/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erike
 */
//Fälten för GetMetoder.
public class GetMetoder {

    private static InfDB idb;

//    Konstruktorn för GetMetoder.
    public GetMetoder() {
        idb = Main.getDB();
    }
//    Get-metod för att hämta ID från Agent med användarnamnet.

    public static int hämtaAgentIDFrånNamn(String användarnamn) {
        String agentID = "Finns ej";
        int agentNR = 99;
        try {
            agentID = idb.fetchSingle("Select Agent_ID from Agent where namn ='" + användarnamn + "'");
            agentNR = Integer.parseInt(agentID);

        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }

        return agentNR;
    }

//    Get-metod för att hämta ID från utrustning med det inmatade namnet.
    public static int hämtaUtrustningsIDFrånNamn(String benämning) {
        String utrustningsID = "Finns ej";
        int utrustningsNR = 99;

        try {
            utrustningsID = idb.fetchSingle("Select utrustnings_ID from utrustning where benamning ='" + benämning + "'");
            utrustningsNR = Integer.parseInt(utrustningsID);

        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utrustningsNR;
    }

//    Get-metod för att hämta utrustnings-ID från agent med det inmatade Agent-ID.
    public static ArrayList<String> getUtrustningsIDnFrånAgentID(int agentID) {
        ArrayList<String> utrustningslista = null;
        try {
            utrustningslista = idb.fetchColumn("Select Utrustnings_ID from innehar_utrustning where agent_ID=" + agentID);
        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utrustningslista;
    }
//
    public static String getRasFrånNamn(String ettNamn) {
        String ras = null;
        try {

            String boglodite = idb.fetchSingle("Select Namn from alien join boglodite b on alien.Alien_ID = b.Alien_ID where namn = '" + ettNamn + "'");
            String squid = idb.fetchSingle("Select Namn from alien join squid s on alien.Alien_ID = s.Alien_ID where namn = '" + ettNamn + "'");
            String worm = idb.fetchSingle("Select Namn from alien join worm w on alien.Alien_ID = w.Alien_ID where namn = '" + ettNamn + "'");

            if (Validera.kollaNullSträng(boglodite)) {
                ras = "Boglodite";
            }
            if (Validera.kollaNullSträng(squid)) {
                ras = "Squid";
            }
            if (Validera.kollaNullSträng(worm)) {
                ras = "Worm";
            }

        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ras;
    }
// Hämtar ut senaste ID:t i listan och ökar denna till ett oanvänt ID.
    public static String getNextAlienID() {
        String nextId = null;
        try {
            nextId = idb.getAutoIncrement("alien", "Alien_ID");

        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextId;
    }
// Hämtar ut senaste ID:t i listan och ökar denna till ett oanvänt ID.
    public static String getNextAgentID() {
        String nextId = null;
        try {
            nextId = idb.getAutoIncrement("agent", "Agent_ID");

        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextId;
    }

    public static HashMap<String, String> getEnAlien(String valdAlien) {
        HashMap<String, String> alienAvNamn = null;
        try {
            alienAvNamn = idb.fetchRow("select alien.Losenord, Alien_ID, alien.Namn, Registreringsdatum, alien.Telefon, Benamning, agent.Namn from alien join agent on alien.Ansvarig_Agent = agent.Agent_ID join plats on alien.Plats = plats.Plats_ID where alien.namn = '" + valdAlien + "'");
        } catch (InfException ex) {
            Logger.getLogger(GetMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alienAvNamn;

    }
public static String getRasAttributFrånID(String ettID) {
        String mängdAttribut = null;
        try {

            String boogies = idb.fetchSingle("Select Antal_Boogies from boglodite where Alien_ID = '" + ettID + "'");
            String armar = idb.fetchSingle("Select Antal_Armar from squid where Alien_ID = '" + ettID + "'");
            //String worm = idb.fetchSingle("Select Namn from alien join worm w on alien.Alien_ID = w.Alien_ID where namn = '" + ettNamn + "'");

            if (Validera.kollaNullSträng(boogies)) {
                mängdAttribut = boogies;
            }
            if (Validera.kollaNullSträng(armar)) {
                mängdAttribut = armar;
            }
//            if (Validera.kollaNullSträng(worm)) {
//                ras = "Worm";
//            }

        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mängdAttribut;
        }


        public static HashMap<String, String> getEnAgent(String valdAgent) {
            HashMap<String, String> agentAvNamn = null;
            try {
                agentAvNamn = idb.fetchRow("select agent.Losenord, Agent_ID, agent.Namn, Anstallningssdatum, agent.Telefon, Administrator,omrade '" + valdAgent + "'");
            } catch (InfException ex) {
                Logger.getLogger(GetMetoder.class.getName()).log(Level.SEVERE, null, ex);
            }
            return agentAvNamn;

        }


}
