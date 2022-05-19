/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erike
 */
public class GetMetoder {
    
    private static InfDB idb;
       
    public GetMetoder(){
        idb = Main.getDB();
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
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ras;
    }
    
    public static String getNextAlienID() {
        String nextId = null;
        try {
            nextId = idb.getAutoIncrement("alien", "Alien_ID");

        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextId;
    }
    
    public static String getNextAgentID() {
        String nextId = null;
        try {
            nextId = idb.getAutoIncrement("agent", "Agent_ID");

        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextId;
    }
}

