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
//Fälten för klassen UnikaAdminMetoder.
public class MetoderUnikaAdmin {

    private static InfDB idb;
    private static StartSkärm ettFönster;

    /**
     *
     * @param ettFönster Konstruktorn för klassen UnikaAdminMetoder.
     */
    public MetoderUnikaAdmin(StartSkärm ettFönster) {
        this.ettFönster = ettFönster;
        idb = Main.getDB();

    }
//Metoden för att logga in som Admin.

    /**
     *
     * @param användarnamnRuta
     * @param lösenruta
     */
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

    /**
     *
     * @param lista
     * @param låda Skapar en hashmap och visar all information om varje enskild
     * agent.
     */
    public static void listaEnskildAgent(JTextArea lista, JComboBox låda) {
        //Sätter textfältet som tomt
        lista.setText("");

        // hämtar variabler ifrån fälten
        String valdAgent = GetMetoder.hamtaCbSträng(låda);

        //HashMapen gås igenom. Först namnges rubriker, sedan hämtas data med hjälp av nyckeln som skrivs ut i listan.
        HashMap<String, String> agentAvNamn = GetMetoder.getEnAgent(valdAgent);
        lista.append("ID\tNamn\tTelefon\tOmrade\tAdmin\tAnsDatum\tLösenord\n");

        lista.append(agentAvNamn.get("Agent_ID") + "\t");
        lista.append(valdAgent + "\t");
        lista.append(agentAvNamn.get("Telefon") + "\t");
        lista.append(agentAvNamn.get("Benamning") + "\t");
        lista.append(agentAvNamn.get("Administrator") + "\t");
        lista.append(agentAvNamn.get("Anstallningsdatum") + "\t");
        lista.append(agentAvNamn.get("Losenord"));

    }

    /**
     *
     * @param användarnamn
     * @param gammaltlösen
     * @param nyttlösen Metod för att byta lösenord för Admin.
     */
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
            Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id
     * @param namnFält
     * @param typLåda
     * @param attributFält Metod för att registrera ny utrustning.
     */
    public static void nyRegistreraUtrustning(JLabel id, JTextField namnFält, JComboBox typLåda, JTextField attributFält) {
        //Validering för samtliga fält görs så, om valideringen godkänns körs programmet
        if (Validera.kollaTom(namnFält) && Validera.kollaTom(attributFält)) {

            String ettNamn = null;

            try {
//Först deklarerars alla variabler, text hämtas från fält och nödvändiga Stringvaribler konverteras till int
                String ettIDString = id.getText();
                int ettID = Integer.parseInt(ettIDString);
                ettNamn = namnFält.getText();
                String valdUtrustning = typLåda.getSelectedItem().toString();
                String Attribut = attributFält.getText();

                ArrayList<String> NamnLista = GetMetoder.getUtrustningsNamn();

                if (Validera.kollaOmvärdeFinnsIArrayList(NamnLista, ettNamn, "En utrustning vid namn " + ettNamn + " finns redan registerad")) {

                    idb.insert("insert into Utrustning values(" + ettID + ",'" + ettNamn + "')");
                    if (valdUtrustning.equals("Vapen")) {
                        if(Validera.kollaIntVapen(attributFält))
                        {
                             int Kaliber = Integer.parseInt(Attribut);
                             idb.insert("insert into Vapen values(" + ettID + "," + Kaliber + ")");
                        }
                        
                    }
                    if (valdUtrustning.equals("Kommunikation")) {
//                        validering krävs
                        idb.insert("insert into Kommunikation values(" + ettID + ",'" + Attribut + "')");
                    }
                    if (valdUtrustning.equals("Teknik")) {
                        //validering krävs
                        idb.insert("insert into Teknik values(" + ettID + ",'" + Attribut + "')");
                    }
                    JOptionPane.showMessageDialog(null, ettNamn + " är nu registrerad");
                    id.setText(GetMetoder.getNextUtrustningsID());
                    namnFält.setText("");
                    attributFält.setText("");

                }

            } catch (InfException ex) {
                Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    /**
     *
     * @param enLåda
     */
    public static void taBortUtrustningUrSystemet(JComboBox enLåda) {
        try {
            String valdUtrustning = GetMetoder.hamtaCbSträng(enLåda);
            int utrustningsID = GetMetoder.hämtaUtrustningsIDFrånNamn(valdUtrustning);
            idb.delete("delete from innehar_utrustning where Utrustnings_ID =" + utrustningsID);
            idb.delete("delete from vapen where Utrustnings_ID =" + utrustningsID);
            idb.delete("delete from kommunikation where Utrustnings_ID =" + utrustningsID);
            idb.delete("delete from teknik where Utrustnings_ID =" + utrustningsID);
            idb.delete("delete from utrustning where Utrustnings_ID =" + utrustningsID);
            JOptionPane.showMessageDialog(null, "Du har tagit bort " + valdUtrustning + " ur systemet");
            enLåda.removeItem(valdUtrustning);
        } catch (InfException ex) {
            Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param enLåda
     */
    public static void taBortAgentUrSystemet(JComboBox enLåda) {
        String valdAgent = GetMetoder.hamtaCbSträng(enLåda);
        try {
            int AgentID = GetMetoder.hämtaAgentIDFrånNamn(valdAgent);
            idb.delete("delete from omradeschef where agent_id =" + AgentID);
            idb.delete("delete from kontorschef where agent_id =" + AgentID);
            idb.delete("delete from faltagent where agent_id =" + AgentID);
            idb.delete("delete from agent where agent_id =" + AgentID);
            JOptionPane.showMessageDialog(null, "Du har tagit bort " + valdAgent + " ur systemet");
            enLåda.removeItem(valdAgent);
        } catch (InfException ex) {
            Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param enLåda
     */
    public static void taBortAlienUrSystemet(JComboBox enLåda) {
        String valdAlien = GetMetoder.hamtaCbSträng(enLåda);
        try {
            int AlienID = GetMetoder.hämtaAlienIDFrånNamn(valdAlien);
            idb.delete("delete from boglodite where alien_id =" + AlienID);
            idb.delete("delete from worm where alien_id =" + AlienID);
            idb.delete("delete from squid where alien_id =" + AlienID);
            idb.delete("delete from alien where alien_id =" + AlienID);
            JOptionPane.showMessageDialog(null, "Du har tagit bort " + valdAlien + " ur systemet");
            enLåda.removeItem(valdAlien);
        } catch (InfException ex) {
            Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id
     * @param datum
     * @param namnFält
     * @param lösenFält
     * @param telNrFält
     * @param adminLåda
     * @param områdesLåda
     */
    public static void nyRegistreraAgent(JLabel id, JLabel datum, JTextField namnFält, JPasswordField lösenFält, JTextField telNrFält, JComboBox adminLåda, JComboBox områdesLåda) {
        //Validering för samtliga fält görs så, om valideringen godkänns körs programmet
        if (Validera.kollaTom(namnFält) && Validera.kollaTom(lösenFält) && Validera.kollaTom(telNrFält) && Validera.kollaTelefonnummer(telNrFält) && Validera.kollaLängdLösenord(lösenFält)) {

            try {
//Först deklarerars alla variabler, text hämtas från fält och lådar och nödvändiga Stringvaribler konverteras till int
                String ettIDString = id.getText();
                int ettID = Integer.parseInt(ettIDString);
                String ettDatum = datum.getText();
                String ettNamn = "Agent " + namnFält.getText();
                String ettLösen = lösenFält.getText();
                String ettTelNr = telNrFält.getText();
                String adminStatus = GetMetoder.hamtaCbSträng(adminLåda);
                String ettOmråde = GetMetoder.hamtaCbSträng(områdesLåda);
                String omRådesIDSträng = idb.fetchSingle("select Omrades_ID from omrade where Benamning = '" + ettOmråde + "'");
                int områdesID = Integer.parseInt(omRådesIDSträng);

                ArrayList<String> NamnLista = GetMetoder.getAgentNamn();
                String felMeddelande = "En Agent vid namn " + ettNamn + " finns redan registrerad.";

                if (Validera.kollaOmvärdeFinnsIArrayList(NamnLista, ettNamn, felMeddelande) && Validera.kontrolleraAgentNamn(namnFält)) {

                    idb.insert("insert into agent values(" + ettID + ",'" + ettNamn + "','" + ettTelNr + "','" + ettDatum + "','" + adminStatus + "','" + ettLösen + "'," + områdesID + ")");

                    JOptionPane.showMessageDialog(null, ettNamn + " är nu registrerad");
                    id.setText(GetMetoder.getNextAgentID());
                    namnFält.setText("");
                    lösenFält.setText("");
                    telNrFält.setText("");

                }

            } catch (InfException ex) {
                Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    /**
     *
     * @param valdAgentFält
     * @param IDFält
     * @param NamnFält
     * @param datumFält
     * @param TeleFält
     * @param LösenFält
     * @param adminFält
     * @param områdesFält
     */
    public static void visaInformationAgent(JComboBox valdAgentFält, JLabel IDFält, JTextField NamnFält, JTextField datumFält, JTextField TeleFält, JTextField LösenFält, JComboBox adminFält, JComboBox områdesFält) {
        String valdAgent = GetMetoder.hamtaCbSträng(valdAgentFält);
        HashMap<String, String> agentAvNamn = GetMetoder.getEnAgent(valdAgent);

        IDFält.setText(agentAvNamn.get("Agent_ID"));
        datumFält.setText(agentAvNamn.get("Anstallningsdatum"));
        NamnFält.setText(valdAgent.substring(6));
        LösenFält.setText(agentAvNamn.get("Losenord"));
        TeleFält.setText(agentAvNamn.get("Telefon"));
        adminFält.setSelectedItem(agentAvNamn.get("Administrator"));
        områdesFält.setSelectedItem(agentAvNamn.get("Benamning"));

    }

    /**
     *
     * @param valdAgentFält
     * @param id
     * @param namnFält
     * @param datumFält
     * @param telNrFält
     * @param lösenFält
     * @param adminLåda
     * @param områdesLåda
     */
    public static void ändraAgent(JComboBox valdAgentFält, JLabel id, JTextField namnFält, JTextField datumFält, JTextField telNrFält, JTextField lösenFält, JComboBox adminLåda, JComboBox områdesLåda) {
        //Validering för samtliga fält görs så, om valideringen godkänns körs programmet
        if (Validera.kollaTom(namnFält) && Validera.kollaTom(lösenFält) && Validera.kollaTom(telNrFält) && Validera.kollaTelefonnummer(telNrFält) && Validera.kollaLängdLösenord(lösenFält) && Validera.kollaDatumFormat(datumFält)) {

            try {
//Först deklarerars alla variabler, text hämtas från fält och lådar och nödvändiga Stringvaribler konverteras till int
                String gammaltNamn = GetMetoder.hamtaCbSträng(valdAgentFält);
                String ettIDString = id.getText();
                int ettID = Integer.parseInt(ettIDString);
                System.out.println(ettID);
                String ettDatum = datumFält.getText();
                String agentBokstav = namnFält.getText();
                String ettNamn = "Agent " + agentBokstav;
                //String ettNamn = "Agent "+namnFält.getText();
                String ettLösen = lösenFält.getText();
                String ettTelNr = telNrFält.getText();
                String adminStatus = GetMetoder.hamtaCbSträng(adminLåda);
                String ettOmråde = GetMetoder.hamtaCbSträng(områdesLåda);
                String omRådesIDSträng = idb.fetchSingle("select Omrades_ID from omrade where Benamning = '" + ettOmråde + "'");
                int områdesID = Integer.parseInt(omRådesIDSträng);
                ArrayList<String> NamnLista = GetMetoder.getAgentNamn();
                String felMeddelande = "En Agent vid namn " + ettNamn + " finns redan registrerad.";

                if (gammaltNamn.equals(ettNamn)) {
                    idb.update("Update agent set Namn ='" + ettNamn + "', Telefon = '" + ettTelNr + "', Anstallningsdatum = '" + ettDatum + "', Administrator='" + adminStatus + "', Losenord ='" + ettLösen + "', Omrade=" + områdesID + " where Agent_ID =" + ettID);

                    JOptionPane.showMessageDialog(null, gammaltNamn + " är nu omregistrerad");
                    namnFält.setText("");
                    lösenFält.setText("");
                    telNrFält.setText("");

                } else if (!gammaltNamn.equals(ettNamn)) {

                    if (Validera.kollaOmvärdeFinnsIArrayList(NamnLista, ettNamn, felMeddelande) && Validera.kontrolleraAgentNamn(namnFält)) {

                        idb.update("Update agent set Namn ='" + ettNamn + "', Telefon = '" + ettTelNr + "', Anstallningsdatum = '" + ettDatum + "', Administrator='" + adminStatus + "', Losenord ='" + ettLösen + "', Omrade=" + områdesID + " Where agent_ID =" + ettID);

                        JOptionPane.showMessageDialog(null, gammaltNamn + " är nu omregistrerad");
                        namnFält.setText("");
                        lösenFält.setText("");
                        telNrFält.setText("");
                        valdAgentFält.removeItem(gammaltNamn);
                        valdAgentFält.addItem(ettNamn);

                    }
                }

            } catch (InfException ex) {
                Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     * @param utrustningsLåda
     * @param agentLÅda
     */
    public static void laggTillUtrustningPåValdAgent(JComboBox utrustningsLåda, JComboBox agentLÅda) {
        //Deklarerar felmeddelande som ska användas i om utrustning redan finns på agenten
        String agentNamn = GetMetoder.hamtaCbSträng(agentLÅda);

        //Hämtar vald utrustning ifrån en Combobox och gör om String variabler till integers
        String valdUtrustning = GetMetoder.hamtaCbSträng(utrustningsLåda);
        int utrustningsID = GetMetoder.hämtaUtrustningsIDFrånNamn(valdUtrustning);
        int agentID = GetMetoder.hämtaAgentIDFrånNamn(agentNamn);
        //Här görs IDt om till strängar för att kunna jämföra om agenten har utrustningen registrerad på sig eller inte
        String utrustningsIDSomSträng = Integer.toString(utrustningsID);
        String dagensDatum = DatumHanterare.getDagensDatum();

        String felMeddlandeHarUtrustningen = "Denna utrustning är redan registrerad på " + agentNamn;
        if (Validera.kollaOmvärdeFinnsIArrayList(GetMetoder.getUtrustningsIDnFrånAgentID(agentID), utrustningsIDSomSträng, felMeddlandeHarUtrustningen)) {
// om Valideringen godkänns registreras den nya utrustningen på agenten
            try {
                idb.insert("Insert into Innehar_Utrustning values(" + agentID + "," + utrustningsID + ",'" + dagensDatum + "')");
                JOptionPane.showMessageDialog(null, "Du har lagt till " + valdUtrustning + " på " + agentNamn + "s lista!");

            } catch (InfException ex) {
                Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    

    /**
     *
     * @param kontorsLåda
     * @param valdAgent
     * @param KCLåda
     */
    public static void laggTillKontorsChef(JComboBox kontorsLåda, JComboBox valdAgent, JComboBox KCLåda) {
        try {
            String enAgent = GetMetoder.hamtaCbSträng(valdAgent);
            String ettKontor = GetMetoder.hamtaCbSträng(kontorsLåda);
            ArrayList<String> agentLista = idb.fetchColumn("select namn from agent join kontorschef k on agent.Agent_ID = k.Agent_ID");
            String ettMeddelande = (enAgent + " ansvarar redan för ett kontor");
            ArrayList<String> kontorsLista = idb.fetchColumn("select kontorsbeteckning from kontorschef");
            int agentID = GetMetoder.hämtaAgentIDFrånNamn(enAgent);
            if (Validera.kollaOmvärdeFinnsIArrayList(agentLista, enAgent, ettMeddelande) && Validera.kollaOmvärdeFinnsIArrayList(kontorsLista, ettKontor, ettKontor +" har redan en chef")) {
                idb.insert("insert into kontorschef values(" + agentID + ", '" + ettKontor + "')");
                JOptionPane.showMessageDialog(null, "Du har lagt till '" + enAgent + "' till kontoret '" + ettKontor + "'");

            } 
        } catch (InfException ex) {
            Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void taBortKontorsChef(JComboBox kontorsLåda, JComboBox valdAgent, JComboBox KCLåda) {
        try {
            String enAgent = GetMetoder.hamtaCbSträng(valdAgent);
            String ettKontor = GetMetoder.hamtaCbSträng(kontorsLåda);
            ArrayList<String> agentLista = idb.fetchColumn("select namn from agent join kontorschef k on agent.Agent_ID = k.Agent_ID");
            String ettMeddelande = (enAgent + " ansvarar inte för något kontor");
            int agentID = GetMetoder.hämtaAgentIDFrånNamn(enAgent);

            if (!agentLista.contains(enAgent)) {
                JOptionPane.showMessageDialog(null, ettMeddelande);
            
            } else {
                idb.delete("delete from kontorschef where agent_ID =" + agentID);
                JOptionPane.showMessageDialog(null, "Du har tagit bort '" + enAgent + "' från kontoret '" + ettKontor + "'");
            }
        } catch (InfException ex) {
            Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param valdAgent
     * @param områdesLåda
     * @param OCLåda
     */
    public static void laggTillOmrådesChef(JComboBox valdAgent, JComboBox områdesLåda, JComboBox OCLåda) {

        String enAgent = GetMetoder.hamtaCbSträng(valdAgent);
        String ettOmråde = GetMetoder.hamtaCbSträng(områdesLåda);
        ArrayList<String> agentLista = GetMetoder.getKontorsCherfer();
        ArrayList<String> omradesIDn = GetMetoder.getAllaOidFrånOC();
        String ettMeddelande = (enAgent + " ansvarar redan för ett område");
        int agentID = GetMetoder.hämtaAgentIDFrånNamn(enAgent);
        int områdesID = GetMetoder.hämtaOmrådesIDFrånNamn(ettOmråde);
        String områdesIDSträng = Integer.toString(områdesID);

        if (Validera.kollaOmvärdeFinnsIArrayList(agentLista, enAgent, ettMeddelande) && Validera.kollaOmvärdeFinnsIArrayList(omradesIDn, områdesIDSträng, "Området " + ettOmråde +" har redan en chef")) {

            try {
                idb.insert("insert into omradeschef values(" + agentID + ",'" + områdesID + "')");
            } catch (InfException ex) {
                Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Du har lagt till " + enAgent + " till området " + ettOmråde);
        }
    }

    public static void taBortOmrådesChef(JComboBox valdAgent, JComboBox områdesLåda, JComboBox OCLåda) {
        String enAgent = GetMetoder.hamtaCbSträng(valdAgent);
        String ettOmråde = GetMetoder.hamtaCbSträng(områdesLåda);
        ArrayList<String> agentLista = GetMetoder.getKontorsCherfer();
        String ettMeddelande = (enAgent + " ansvarar inte för något område");
        int agentID = GetMetoder.hämtaAgentIDFrånNamn(enAgent);
       

        if (!agentLista.contains(enAgent)) {
            JOptionPane.showMessageDialog(null, ettMeddelande);

        } else {
            try {
                idb.delete("delete from omradeschef where agent_ID =" + agentID);
                JOptionPane.showMessageDialog(null, "Du har tagit bort " + enAgent + " från området " + ettOmråde);
            } catch (InfException ex) {
                Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    /**
     *
     * @param namnLåda
     * @param enArea
     */
    public static void listaAgentsUtrustning(JComboBox namnLåda, JTextArea enArea) {
        String agentNamn = GetMetoder.hamtaCbSträng(namnLåda);
        enArea.setText("");
        enArea.append("Benämning\tUtkvitteringsdatum\n");
        ArrayList<HashMap<String, String>> utrustningsLista = GetMetoder.getUtrustningsNamnfrånAgentnamn(agentNamn);
        for (HashMap<String, String> enUtrustning : utrustningsLista) {
            enArea.append(enUtrustning.get("Benamning") + "\t");
            enArea.append(enUtrustning.get("Utkvitteringsdatum") + "\n");
        }
    }

    /**
     *
     * @param namnLåda
     * @param enArea
     */
    public static void listaAgentsFordon(JComboBox namnLåda, JTextArea enArea) {
        String agentNamn = GetMetoder.hamtaCbSträng(namnLåda);
        enArea.setText("");
        enArea.append("Beskrivning\t\tÅrsmodell\tUtkvitteringsdatum\n");
        ArrayList<HashMap<String, String>> fordonsLista = GetMetoder.getFordonsNamnFrånAgentNamn(agentNamn);
        for (HashMap<String, String> ettFordon : fordonsLista) {

            enArea.append(ettFordon.get("Fordonsbeskrivning") + "\t\t");
            enArea.append(ettFordon.get("Arsmodell") + "\t");
            enArea.append(ettFordon.get("Utkvitteringsdatum") + "\n");

        }
    }

}
