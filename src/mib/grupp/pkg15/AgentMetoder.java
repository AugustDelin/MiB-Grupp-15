/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erike
 */
// Fälten för klassen AgentMetoder.
public class AgentMetoder {

    private static InfDB idb;
    private static StartSkärm ettFönster;

//    Konstruktorn för klassen AgentMetoder.
    public AgentMetoder(StartSkärm ettFönster) {
        this.ettFönster = ettFönster;
        idb = Main.getDB();

    }
// Metoden för att logga in som Agent.

    public static void loggainAgent(JTextField användarnamnRuta, JPasswordField lösenruta) {

        if (Validera.kollaTom(användarnamnRuta) && Validera.kollaTom(lösenruta)) {
            try {
                //hämtar användarnamn ifrån loginruta
                String användarnamn = användarnamnRuta.getText();

                // hämta lösenordet som matchar angivet användarnamn ifrån databasen
                String lösenord = idb.fetchSingle("Select Losenord from agent where namn ='" + användarnamn + "'");

                //jämför inskrivet lösen med det som står skrivet i rutan lösenord
                if (Validera.kollaNullvärde(lösenord) && Validera.kollaLösen(lösenord, lösenruta)) {

                    //om ovan villkor är true skapas en ny ruta
                    new AgentStartSkärm(användarnamn).setVisible(true);
                    ettFönster.dispose();

                }

            } catch (InfException ex) {
                Logger.getLogger(StartSkärm.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }
// Metod för att byta lösenord för Agent.

    public static void bytLösenord(String användarnamn, JPasswordField gammaltlösen, JPasswordField nyttlösen) {
        if (Validera.kollaTom(gammaltlösen) && Validera.kollaTom(nyttlösen))
        try {
            String lösenord = idb.fetchSingle("Select Losenord from AGENT where namn ='" + användarnamn + "'");
            if (Validera.kollaLösen(lösenord, gammaltlösen)) {
                String nyttLösenord = nyttlösen.getText();
                idb.update("UPDATE AGENT SET losenord='" + nyttLösenord + "' where namn ='" + användarnamn + "'");
                JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
            }
        } catch (InfException ex) {
            Logger.getLogger(AlienMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void fyllCBPlats(JComboBox enLåda) {
        try {
            enLåda.removeAllItems();
            ArrayList<String> platser = idb.fetchColumn("select benamning from plats order by benamning");
            for (String enPlats : platser) {
                enLåda.addItem(enPlats);
            }

        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listaAliensPåPlats(JTextArea lista, JComboBox låda) {
        lista.setText("");
        try {
            String valdPlats = Validera.hamtaCbSträng(låda);
            ArrayList<String> aliensPåPlats = idb.fetchColumn("select namn from alien join plats on alien.Plats = plats.Plats_ID where plats.benamning = '" + valdPlats + "'");
            for (String alien : aliensPåPlats) {
                lista.append(alien + "\n");
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void fyllCBras(JComboBox enLåda) {
        //Skapa en ArrayList och fyller denna med de tre raserna som finns
        //enLåda.addItem("");
        ArrayList<String> raslista = new ArrayList();
        raslista.add("Boglodite");
        raslista.add("Squid");
        raslista.add("Worm");

        for (String rasnamn : raslista) {
            enLåda.addItem(rasnamn);
        }

    }

    public static void fyllCBAlienNamn(JComboBox enLåda) {
        try {
            //Skapa en ArrayList och fyller denna med de tre raserna som finns
            //enLåda.addItem("");
            ArrayList<String> namnLista = idb.fetchColumn("select namn from alien");

            for (String ettNamn : namnLista) {
                enLåda.addItem(ettNamn);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listaAliensPerRas(JTextArea lista, JComboBox låda) {

        lista.setText("");
        try {

            String valdRas = Validera.hamtaCbSträng(låda);
            ArrayList<String> alienavRas = idb.fetchColumn("select Namn from alien join " + valdRas + " on alien.alien_id =" + valdRas + ".alien_id");
            for (String enAlien : alienavRas) {
                lista.append(enAlien);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void listaEnskildaAliens(JTextArea lista, JComboBox låda) {

        lista.setText("");
        try {

            String valdAlien = Validera.hamtaCbSträng(låda);
            String ras = getRasFrånNamn(valdAlien);
            //HashMap<String, String> alienAvNamn = idb.fetchRow("select * from alien where namn ='" + valdAlien + "'");

            HashMap<String, String> alienAvNamn = idb.fetchRow("select alien.Losenord, Alien_ID, alien.Namn, Registreringsdatum, alien.Telefon, Benamning, agent.Namn from alien join agent on alien.Ansvarig_Agent = agent.Agent_ID join plats on alien.Plats = plats.Plats_ID where alien.namn = '" + valdAlien + "'");
            lista.append("ID\tNamn\tRas\tTelefon\tPlats\tAnsvar\tRegdatum\tLösenord\n");
            lista.append(alienAvNamn.get("Alien_ID") + "\t");
            lista.append(valdAlien + "\t");
            lista.append(ras + "\t");
            //lista.append(alienAvNamn.get("alien.Namn")+"\t");
            lista.append(alienAvNamn.get("Telefon") + "\t");
            lista.append(alienAvNamn.get("Benamning") + "\t");
            lista.append(alienAvNamn.get("Namn") + "\t");
            lista.append(alienAvNamn.get("Registreringsdatum") + "\t");
            lista.append(alienAvNamn.get("Losenord"));

        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void fyllAgentUtrustning(JComboBox enLåda) {

        try {
            ArrayList<String> utrustningsLista = idb.fetchColumn("Select benamning from utrustning order by benamning");

            for (String enUtrustning : utrustningsLista) {
                enLåda.addItem(enUtrustning);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int hämtaAgentIDFrånNamn(String användarnamn) {
        String agentID = "Finns ej";
        int agentNR = 99;
        try {
            agentID = idb.fetchSingle("Select Agent_ID from Agent where namn ='" + användarnamn + "'");
            agentNR = Integer.parseInt(agentID);

        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }

        return agentNR;
    }

    public static int hämtaUtrustningsIDFrånNamn(String benämning) {
        String utrustningsID = "Finns ej";
        int utrustningsNR = 99;

        try {
            utrustningsID = idb.fetchSingle("Select utrustnings_ID from utrustning where benamning ='" + benämning + "'");
            utrustningsNR = Integer.parseInt(utrustningsID);

        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utrustningsNR;
    }

    public static ArrayList<String> getUtrustningsIDnFrånAgentID(int agentID) {
        ArrayList<String> utrustningslista = null;
        try {
            utrustningslista = idb.fetchColumn("Select Utrustnings_ID from innehar_utrustning where agent_ID=" + agentID);
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utrustningslista;
    }

    public static void laggTillUtrustningPåAgent(JComboBox enLåda, String användarnamn) {
        String valdUtrustning = Validera.hamtaCbSträng(enLåda);
        int utrustningsID = hämtaUtrustningsIDFrånNamn(valdUtrustning);
        int agentID = hämtaAgentIDFrånNamn(användarnamn);
        String utrustningsIDSomSträng = Integer.toString(utrustningsID);
        String dagensDatum = DatumHanterare.getDagensDatum();
        if (Validera.kollavärdeIStringArrayList(getUtrustningsIDnFrånAgentID(agentID), utrustningsIDSomSträng)) {

            try {
//                idb.insert("Insert into Innehar_Utrustning values(" + agentID + "," + utrustningsID + ",'00-00-00')");
                idb.insert("Insert into Innehar_Utrustning values(" + agentID + "," + utrustningsID + ",'" + dagensDatum + "')");
                JOptionPane.showMessageDialog(null, "Du har lagt till " + valdUtrustning + "till din lista!");

            } catch (InfException ex) {
                Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void listaChefAvOmrade(JTextArea lista, JComboBox låda) {

        lista.setText("");
        try {

            String valtOmrade = Validera.hamtaCbSträng(låda);
            ArrayList<String> chefAvOmrade = idb.fetchColumn("select Agent.namn from agent join omradeschef on omradeschef.Agent_ID = agent.Agent_ID join omrade on omrade.Omrades_ID= omradeschef.Agent_ID where omrade.benamning= '" + valtOmrade + "'");
            for (String enChef : chefAvOmrade) {
                lista.append(enChef);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoderLinda.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void fyllCBchefsOmråden(JComboBox enLåda) {

        try {
            ArrayList<String> områdesLista = idb.fetchColumn("Select Benamning from Omrade order by Benamning");

            for (String ettOmråde : områdesLista) {
                enLåda.addItem(ettOmråde);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String getRasFrånNamn(String ettNamn)
    {
        String ras = null;
        try {
            
            String bogolite = idb.fetchSingle("Select Namn from alien join boglodite b on alien.Alien_ID = b.Alien_ID where namn = '"+ ettNamn+"'");
            String squid = idb.fetchSingle("Select Namn from alien join squid s on alien.Alien_ID = s.Alien_ID where namn = '"+ettNamn+"'");
            String worm = idb.fetchSingle("Select Namn from alien join worm w on alien.Alien_ID = w.Alien_ID where namn = '"+ettNamn+"'");
            
            if(Validera.kollaNullSträng(bogolite))
            {
                ras = "Bogolite";
            }
            if(Validera.kollaNullSträng(squid))
            {
                ras = "Squid";
            }
            if(Validera.kollaNullSträng(worm))
            {
                ras = "Worm";
            }
                
                } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ras;
    }
    
    public static void getAlienFrånRegDatum(JTextField fält1, JTextField fält2, JTextArea enArea){
        if(Validera.kollaTom(fält1) && Validera.kollaTom(fält2) && Validera.kollaDatumFormat2(fält1) && Validera.kollaDatumFormat2(fält2)){
        try {
            //ArrayList<HashMap<String, String>> alien = idb.fetchRows("select namn from alien where Registreringsdatum between'" + fält1 + "'and'" + fält2 + "'");
            String datum1 = fält1.getText();
            String datum2 = fält2.getText();
            ArrayList<HashMap<String, String>> alien = idb.fetchRows("select namn from alien where Registreringsdatum between'" + datum1 + "'and'" + datum2 + "'");
            System.out.println(alien);
            
            for(HashMap<String, String> enRad : alien){
                enArea.append(enRad.get("Namn") + "\n");
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
}
