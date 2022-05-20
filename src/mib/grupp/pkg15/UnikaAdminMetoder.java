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
public class UnikaAdminMetoder {

    private static InfDB idb;
    private static StartSkärm ettFönster;

// Konstruktorn för klassen UnikaAdminMetoder.
    public UnikaAdminMetoder(StartSkärm ettFönster) {
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
//Skapar en hashmap och visar all information om varje enskild agent.

    public static void listaEnskildAgent(JTextArea lista, JComboBox låda) {
        //Sätter textfältet som tomt
        lista.setText("");

        // hämtar variabler ifrån fälten
        String valdAgent = Validera.hamtaCbSträng(låda);

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

    // Metod för att byta lösenord för Admin.
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
            Logger.getLogger(UnikaAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void taBortUtrustningUrSystemet(JComboBox enLåda) {
        try {
            String valdUtrustning = Validera.hamtaCbSträng(enLåda);
            int utrustningsID = GetMetoder.hämtaUtrustningsIDFrånNamn(valdUtrustning);
            idb.delete("delete from innehar_utrustning where Utrustnings_ID =" + utrustningsID);
            idb.delete("delete from utrustning where Utrustnings_ID =" + utrustningsID);
            JOptionPane.showMessageDialog(null, "Du har tagit bort " + valdUtrustning + " ur systemet");
            enLåda.removeItem(valdUtrustning);
        } catch (InfException ex) {
            Logger.getLogger(UnikaAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void taBortAgentUrSystemet(JComboBox enLåda) {
        String valdAgent = Validera.hamtaCbSträng(enLåda);
        try {
            int AgentID = GetMetoder.hämtaAgentIDFrånNamn(valdAgent);
            idb.delete("delete from omradeschef where agent_id =" + AgentID);
            idb.delete("delete from kontorschef where agent_id =" + AgentID);
            idb.delete("delete from faltagent where agent_id =" + AgentID);
            idb.delete("delete from agent where agent_id =" + AgentID);
            JOptionPane.showMessageDialog(null, "Du har tagit bort " + valdAgent + " ur systemet");
            enLåda.removeItem(valdAgent);
        } catch (InfException ex) {
            Logger.getLogger(UnikaAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void taBortAlienUrSystemet(JComboBox enLåda) {
        String valdAlien = Validera.hamtaCbSträng(enLåda);
        try {
            int AlienID = GetMetoder.hämtaAgentIDFrånNamn(valdAgent);
            idb.delete("delete from omradeschef where agent_id =" + AgentID);
            idb.delete("delete from kontorschef where agent_id =" + AgentID);
            idb.delete("delete from faltagent where agent_id =" + AgentID);
            idb.delete("delete from agent where agent_id =" + AgentID);
            JOptionPane.showMessageDialog(null, "Du har tagit bort " + valdAgent + " ur systemet");
            enLåda.removeItem(valdAgent);
        } catch (InfException ex) {
            Logger.getLogger(UnikaAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
