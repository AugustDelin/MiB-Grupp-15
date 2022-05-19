/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.grupp.pkg15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Linda
 */
//Fälten för klassen AdminMetoder.
public class AdminMetoder {

    private static InfDB idb;
    private static StartSkärm ettFönster;

// Konstruktorn för klassen AdminMetoder.
    public AdminMetoder(StartSkärm ettFönster) {
        this.ettFönster = ettFönster;
        idb = Main.getDB();

    }
//Metoden för att logga in som Admin.

    public static void loggainAdmin(JTextField användarnamnRuta, JPasswordField lösenruta) {
        if (Validera.kollaTom(användarnamnRuta) && Validera.kollaTom(lösenruta)) {
            try {
                //hämtar användarnamn ifrån loginruta
                String användarnamn = användarnamnRuta.getText();

                // hämta lösenordet som matchar angivet användarnamn ifrån databasen
                String lösenord = idb.fetchSingle("Select Losenord from agent where namn ='" + användarnamn + "'");
                // hämta adminstatus från databasen
                String adminstatus = idb.fetchSingle("Select Administrator from agent where namn = '" + användarnamn + "'");
                //jämför inskrivet lösen med det som står skrivet i rutan lösenord
                if (Validera.kollaNullvärde(lösenord) && Validera.kollaLösen(lösenord, lösenruta) && Validera.kollaAdmin(adminstatus)) {

                    //om ovan villkor är true skapas en ny ruta
                    new AdminStartSkärm(användarnamn).setVisible(true);
                    ettFönster.dispose();

                }

            } catch (InfException ex) {
                Logger.getLogger(StartSkärm.class.getName()).log(Level.SEVERE, null, ex);

            }
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
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
            //Skapa en ArrayList och fyller denna med de tre raserna som finns
        //enLåda.addItem("");
    public static void fyllCBras(JComboBox enLåda) {
        ArrayList<String> raslista = new ArrayList();
        raslista.add("Boglodite");
        raslista.add("Squid");
        raslista.add("Worm");

        for (String rasnamn : raslista) {
            enLåda.addItem(rasnamn);
        }
    }
public static void listaAliensPerRas(JTextArea lista, JComboBox låda) {

        lista.setText("");
        try {

            String valdRas = Validera.hamtaCbSträng(låda);
            ArrayList<String> alienavRas = idb.fetchColumn("select Namn from alien join " + valdRas + " on alien.alien_id =" + valdRas + ".alien_id");
            for (String enAlien : alienavRas) {
                lista.append(enAlien + "\n");
            }
        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //Skapa en ArrayList och fyller denna med de tre raserna som finns
            //enLåda.addItem("");
    public static void fyllCBAlienNamn(JComboBox enLåda) {
        try {
            ArrayList<String> namnLista = idb.fetchColumn("select namn from alien");

            for (String ettNamn : namnLista) {
                enLåda.addItem(ettNamn);
            }
        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Skapar en hashmap och visar all information om varje enskild alien.
    public static void listaEnskildaAliens(JTextArea lista, JComboBox låda) {

        lista.setText("");
        try {

            String valdAlien = Validera.hamtaCbSträng(låda);
            String ras = getRasFrånNamn(valdAlien);
            
            HashMap<String, String> alienAvNamn = idb.fetchRow("select alien.Losenord, Alien_ID, alien.Namn, Registreringsdatum, alien.Telefon, Benamning, agent.Namn from alien join agent on alien.Ansvarig_Agent = agent.Agent_ID join plats on alien.Plats = plats.Plats_ID where alien.namn = '" + valdAlien + "'");
            lista.append("ID\tNamn\tRas\tTelefon\tPlats\tAnsvar\tRegdatum\tLösenord\n");
            lista.append(alienAvNamn.get("Alien_ID") + "\t");
            lista.append(valdAlien + "\t");
            lista.append(ras + "\t");
            lista.append(alienAvNamn.get("Telefon") + "\t");
            lista.append(alienAvNamn.get("Benamning") + "\t");
            lista.append(alienAvNamn.get("Namn") + "\t");
            lista.append(alienAvNamn.get("Registreringsdatum") + "\t");
            lista.append(alienAvNamn.get("Losenord"));

        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String getRasFrånNamn(String ettNamn) {
        String ras = null;
        try {

            String bogolite = idb.fetchSingle("Select Namn from alien join boglodite b on alien.Alien_ID = b.Alien_ID where namn = '" + ettNamn + "'");
            String squid = idb.fetchSingle("Select Namn from alien join squid s on alien.Alien_ID = s.Alien_ID where namn = '" + ettNamn + "'");
            String worm = idb.fetchSingle("Select Namn from alien join worm w on alien.Alien_ID = w.Alien_ID where namn = '" + ettNamn + "'");

            if (Validera.kollaNullSträng(bogolite)) {
                ras = "Bogolite";
            }
            if (Validera.kollaNullSträng(squid)) {
                ras = "Squid";
            }
            if (Validera.kollaNullSträng(worm)) {
                ras = "Worm";
            }

        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ras;
    }
    
public static void fyllAdminUtrustning(JComboBox enLåda) {

        try {
            ArrayList<String> utrustningsLista = idb.fetchColumn("Select benamning from utrustning order by benamning");

            for (String enUtrustning : utrustningsLista) {
                enLåda.addItem(enUtrustning);
            }
        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        public static String getAlienID() {
        String nextId = null;
        try {
            nextId = idb.getAutoIncrement("alien", "Alien_ID");

        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextId;
    }

        
        
public static int hämtaAgentIDFrånNamn(String användarnamn) {
        String agentID = "Finns ej";
        int agentNR = 99;
        try {
            agentID = idb.fetchSingle("Select Agent_ID from Agent where namn ='" + användarnamn + "'");
            agentNR = Integer.parseInt(agentID);

        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }

        return agentNR;
    }

 public static ArrayList<String> getUtrustningsIDnFrånAgentID(int agentID) {
        ArrayList<String> utrustningslista = null;
        try {
            utrustningslista = idb.fetchColumn("Select Utrustnings_ID from innehar_utrustning where agent_ID=" + agentID);
        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utrustningslista;
 }
    public static int hämtaUtrustningsIDFrånNamn(String benämning) {
        String utrustningsID = "Finns ej";
        int utrustningsNR = 99;

        try {
            utrustningsID = idb.fetchSingle("Select utrustnings_ID from utrustning where benamning ='" + benämning + "'");
            utrustningsNR = Integer.parseInt(utrustningsID);

        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utrustningsNR;
    }
    
    public static void laggTillUtrustningPåAdmin(JComboBox enLåda, String användarnamn) {
        String valdUtrustning = Validera.hamtaCbSträng(enLåda);
        int utrustningsID = hämtaUtrustningsIDFrånNamn(valdUtrustning);
        int agentID = hämtaAgentIDFrånNamn(användarnamn);
        String utrustningsIDSomSträng = Integer.toString(utrustningsID);
        String dagensDatum = DatumHanterare.getDagensDatum();
        if (Validera.kollavärdeIStringArrayList(getUtrustningsIDnFrånAgentID(agentID), utrustningsIDSomSträng)) {

            try {
                idb.insert("Insert into Innehar_Utrustning values(" + agentID + "," + utrustningsID + ",'" + dagensDatum + "')");
                JOptionPane.showMessageDialog(null, "Du har lagt till " + valdUtrustning + " till din lista!");

            } catch (InfException ex) {
                Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    //Går att ta bort ur systemet men går ej om utrustning har lagts till på agent
    public static void taBortUtrustningUrSystemet(JComboBox enLåda) {
        try {
            String valdUtrustning = Validera.hamtaCbSträng(enLåda);
            int utrustningsID = hämtaUtrustningsIDFrånNamn(valdUtrustning);
            idb.delete("delete from utrustning where benamning ='" + valdUtrustning + "'");
            idb.delete("delete from innehar_utrustning where Utrustnings_ID =" + utrustningsID);
            JOptionPane.showMessageDialog(null, "Du har tagit bort " + valdUtrustning + " ur systemet");
            enLåda.removeItem(valdUtrustning);
        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
     public static boolean nyRegistreraAlien(JLabel id, JLabel datum, JTextField namnFält, JComboBox rasLåda, JPasswordField lösenFält, JTextField telNrFält, JComboBox platsLåda, JComboBox agentLåda, JTextField attributFält) {
        boolean resultat = true;
        if(Validera.kollaTom(namnFält) && Validera.kollaTom(lösenFält) && Validera.kollaTom(telNrFält) && Validera.kollaMaxTvåsiffror(attributFält) && Validera.kollaTelefonnummer(telNrFält) && Validera.kollaLängdLösenord(lösenFält))
            {
                resultat = false;
                String ettNamn = null;
            
        try {
            
            String ettIDString = id.getText();
            int ettID = Integer.parseInt(ettIDString);
            String ettDatum = datum.getText();
            ettNamn = namnFält.getText();
            String valdRas = rasLåda.getSelectedItem().toString();
            String mängdAtributString = attributFält.getText();
            int mängdAtribut = Integer.parseInt(mängdAtributString);
            String ettLösen = lösenFält.getText();
            String ettTelNr = telNrFält.getText();
            String enPlats = platsLåda.getSelectedItem().toString();
            String platsIDSträng = idb.fetchSingle("select Plats_ID from plats where Benamning = '" + enPlats + "'");
            int platsID = Integer.parseInt(platsIDSträng);
            String enAgent = agentLåda.getSelectedItem().toString();
            String agentIDSträng = idb.fetchSingle("select Agent_ID from agent where namn = '" + enAgent + "'");
            int agentID = Integer.parseInt(agentIDSträng);

            idb.insert("insert into alien values(" + ettID + ",'" + ettDatum + "','" + ettLösen + "','" + ettNamn + "','" + ettTelNr + "'," + platsID + "," + agentID+")");
            if(valdRas.equals("Boglodite"))
                
        {
            idb.insert("insert into boglodite values("+ettID+","+ mängdAtribut+")");
        }
        if(valdRas.equals("Squid"))
        {
            idb.insert("insert into squid values("+ettID+","+ mängdAtribut+")");
        }
        if(valdRas.equals("Worm"))
        {
            idb.insert("insert into worm values("+ettID+")");
        }
            
        } catch (InfException ex) {
            Logger.getLogger(AdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, ettNamn + " är nu registrerad");
            }
        return resultat;
        
    }

}
