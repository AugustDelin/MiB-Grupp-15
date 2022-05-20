/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
        //Kontrollerar att båda fälten är ifyllda
        if (Validera.kollaTom(gammaltlösen) && Validera.kollaTom(nyttlösen))
        try {
            //Hämtar lösenord som tillhör inskrivet ID ifrån databasen
            String lösenord = idb.fetchSingle("Select Losenord from AGENT where namn ='" + användarnamn + "'");
            //Kollar så att det nya stämmer överens med det gamla 
            if (Validera.kollaLösen(lösenord, gammaltlösen)) {
                String nyttLösenord = nyttlösen.getText();
                idb.update("UPDATE AGENT SET losenord='" + nyttLösenord + "' where namn ='" + användarnamn + "'");
                JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listaAliensPåPlats(JTextArea lista, JComboBox låda) {
        //Nollsätter listan
        lista.setText("");
        try {
            //Hämtar Sträng och namnger denna till valdPlats ifrån Combobox
            String valdPlats = Validera.hamtaCbSträng(låda);
            //Listan gås igenom och listar namnen på aliens som finns på vald plats
            ArrayList<String> aliensPåPlats = idb.fetchColumn("select namn from alien join plats on alien.Plats = plats.Plats_ID where plats.benamning = '" + valdPlats + "'");
            for (String alien : aliensPåPlats) {
                lista.append(alien + "\n");
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Visar alla aliens som tillhör vald ras
    public static void listaAliensPerRas(JTextArea lista, JComboBox låda) {

        //Listan sätts blank
        lista.setText("");
        try {
//Hämtar sträng ifrån COmboBox
            String valdRas = Validera.hamtaCbSträng(låda);
            //Hämtar en ArrayList av vald ras och skriver ut denna i listan
            ArrayList<String> alienavRas = idb.fetchColumn("select Namn from alien join " + valdRas + " on alien.alien_id =" + valdRas + ".alien_id");
            for (String enAlien : alienavRas) {
                lista.append(enAlien + "\n");
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//Skapar en hashmap och visar all information om varje enskild alien.

    public static void listaEnskildaAliens(JTextArea lista, JComboBox låda) {

        //Sätter textfältet som tomt
        lista.setText("");
        try {
// hämtar varibler ifrån fälten
            String valdAlien = Validera.hamtaCbSträng(låda);
            String ras = GetMetoder.getRasFrånNamn(valdAlien);

            //HashMapen gås igenom. Först namnges rubriker sedan hämtas data med hjälp av nyckeln som skrivs ut i listan
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
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void laggTillUtrustningPåAgent(JComboBox enLåda, String användarnamn) {
        //Deklrarerar felmeddlande som ska användas i om utrustning redan finns på agenten
        String felmeddelande = "Denna utrusnting är redan registrerad på " + användarnamn;
        //Hämtar vald utrustning ifrån en Combobox och gör om String variabler till integers
        String valdUtrustning = Validera.hamtaCbSträng(enLåda);
        int utrustningsID = GetMetoder.hämtaUtrustningsIDFrånNamn(valdUtrustning);
        int agentID = GetMetoder.hämtaAgentIDFrånNamn(användarnamn);
        //Här görs IDt om till strängar för att kunna jämföra om agenten har utrustningen registrerad på sig eller inte
        String utrustningsIDSomSträng = Integer.toString(utrustningsID);
        String dagensDatum = DatumHanterare.getDagensDatum();
        if (Validera.kollaOmvärdeFinnsIArrayList(GetMetoder.getUtrustningsIDnFrånAgentID(agentID), utrustningsIDSomSträng, felmeddelande)) {
// om Valideringen godkänns registreras den nya utrustningen på agenten
            try {
                idb.insert("Insert into Innehar_Utrustning values(" + agentID + "," + utrustningsID + ",'" + dagensDatum + "')");
                JOptionPane.showMessageDialog(null, "Du har lagt till " + valdUtrustning + " till din lista!");

            } catch (InfException ex) {
                Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void listaChefAvOmrade(JTextArea lista, JComboBox låda) {
        //Sätter textfältet blankt
        lista.setText("");
        try {
            //Hämtar en sträng ifrån en Combobox, i detta fall valt område
            String valtOmrade = Validera.hamtaCbSträng(låda);
            //Hämtar lista ifrån DB
            ArrayList<String> chefAvOmrade = idb.fetchColumn("select Agent.namn from agent join omradeschef on omradeschef.Agent_ID = agent.Agent_ID join omrade on omrade.Omrades_ID= omradeschef.Agent_ID where omrade.benamning= '" + valtOmrade + "'");
            //Listar alla agenet i valt område
            for (String enChef : chefAvOmrade) {
                lista.append(enChef);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentMetoderLinda.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void visaAlienFrånRegDatum(JTextField fält1, JTextField fält2, JTextArea enArea) {
        //Nödvändiga valideringar görs innan programet körs
        if (Validera.kollaTom(fält1) && Validera.kollaTom(fält2) && Validera.kollaDatumFormat(fält1) && Validera.kollaDatumFormat(fält2)) {
            try {

                //variabler hämtas ifrån getfält
                String datum1 = fält1.getText();
                String datum2 = fält2.getText();
                ArrayList<HashMap<String, String>> alien = idb.fetchRows("select namn from alien where Registreringsdatum between'" + datum1 + "'and'" + datum2 + "'");

                //listan gås igenom och läggs upp i en textarea
                for (HashMap<String, String> enRad : alien) {
                    enArea.append(enRad.get("Namn") + "\n");
                }
            } catch (InfException ex) {
                Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
// Metod för att registrera en ny Alien.

    public static void nyRegistreraAlien(JLabel id, JLabel datum, JTextField namnFält, JComboBox rasLåda, JPasswordField lösenFält, JTextField telNrFält, JComboBox platsLåda, JComboBox agentLåda, JTextField attributFält) {
        //Validering för samtliga fält görs så, om valideringen godkänns körs programmet
        if (Validera.kollaTom(namnFält) && Validera.kollaTom(lösenFält) && Validera.kollaTom(telNrFält) && Validera.kollaMaxTvåsiffror(attributFält) && Validera.kollaTelefonnummer(telNrFält) && Validera.kollaLängdLösenord(lösenFält)) {

            String ettNamn = null;

            try {
//Först deklarerars alla variabler, text hämtas från fält och nödvändiga Stringvaribler konverteras till int
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

                idb.insert("insert into alien values(" + ettID + ",'" + ettDatum + "','" + ettLösen + "','" + ettNamn + "','" + ettTelNr + "'," + platsID + "," + agentID + ")");
                if (valdRas.equals("Boglodite")) {
                    idb.insert("insert into boglodite values(" + ettID + "," + mängdAtribut + ")");
                }
                if (valdRas.equals("Squid")) {
                    idb.insert("insert into squid values(" + ettID + "," + mängdAtribut + ")");
                }
                if (valdRas.equals("Worm")) {
                    idb.insert("insert into worm values(" + ettID + ")");
                }

            } catch (InfException ex) {
                Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, ettNamn + " är nu registrerad");
            id.setText(GetMetoder.getNextAlienID());
            namnFält.setText("");
            lösenFält.setText("");
            telNrFält.setText("");
            attributFält.setText("");
        }

    }

    //metod för att udvika dubbla ID
    // public static boolean kollaID(JLabel ettLabel) {
    //try {
    //boolean resultat = false;
    //String ettIDString = ettLabel.getText();
    //int ettID = Integer.parseInt(ettIDString);
    //String idLista = idb.fetchSingle("Select Alien_ID from alien");
    // int idListan = Integer.parseInt(idLista);
    //ArrayList<Integer> idListaAliens = idListan;
    //for(String ettID : )
    //if (ettID.) {
    //  }
    //} catch (InfException ex) {
    //   Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
    // }
    // }
}
