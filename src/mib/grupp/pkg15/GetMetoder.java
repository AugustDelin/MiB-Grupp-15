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
            Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return agentNR;
    }

    //    Get-metod för att hämta ID från Alien med användarnamnet.
    public static int hämtaAlienIDFrånNamn(String användarnamn) {
        String alienID = "Finns ej";
        int alienNR = 99;
        try {
            alienID = idb.fetchSingle("Select Alien_ID from Alien where namn ='" + användarnamn + "'");
            alienNR = Integer.parseInt(alienID);

        } catch (InfException ex) {
            Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return alienNR;
    }

//    Get-metod för att hämta ID från utrustning med det inmatade namnet.
    public static int hämtaUtrustningsIDFrånNamn(String benämning) {
        String utrustningsID = "Finns ej";
        int utrustningsNR = 99;

        try {
            utrustningsID = idb.fetchSingle("Select utrustnings_ID from utrustning where benamning ='" + benämning + "'");
            utrustningsNR = Integer.parseInt(utrustningsID);

        } catch (InfException ex) {
            Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utrustningsNR;
    }

//    Get-metod för att hämta utrustnings-ID från agent med det inmatade Agent-ID.
    public static ArrayList<String> getUtrustningsIDnFrånAgentID(int agentID) {
        ArrayList<String> utrustningslista = null;
        try {
            utrustningslista = idb.fetchColumn("Select Utrustnings_ID from innehar_utrustning where agent_ID=" + agentID);
        } catch (InfException ex) {
            Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ras;
    }
// Hämtar ut senaste ID:t i listan och ökar denna till ett oanvänt ID.

    public static String getNextAlienID() {
        String nextId = null;
        try {
            nextId = idb.getAutoIncrement("alien", "Alien_ID");

        } catch (InfException ex) {
            Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextId;
    }
// Hämtar ut senaste ID:t i listan och ökar denna till ett oanvänt ID.

    public static String getNextAgentID() {
        String nextId = null;
        try {
            nextId = idb.getAutoIncrement("agent", "Agent_ID");

        } catch (InfException ex) {
            Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nextId;
    }
    
    // Hämtar ut senaste ID:t i listan och ökar denna till ett oanvänt ID.

    public static String getNextUtrustningsID() {
        String nextId = null;
        try {
            nextId = idb.getAutoIncrement("Utrustning", "Utrustnings_ID");

        } catch (InfException ex) {
            Logger.getLogger(MetoderUnikaAdmin.class.getName()).log(Level.SEVERE, null, ex);
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
//Hämtar antal armar eller boogies från lista berende på ras.
            String boogies = idb.fetchSingle("Select Antal_Boogies from boglodite where Alien_ID = '" + ettID + "'");
            String armar = idb.fetchSingle("Select Antal_Armar from squid where Alien_ID = '" + ettID + "'");
            //String worm = idb.fetchSingle("Select Namn from alien join worm w on alien.Alien_ID = w.Alien_ID where namn = '" + ettNamn + "'");
//Om den inte hittar något är går detta vidare till nästa ras
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
            Logger.getLogger(MetoderAgentAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mängdAttribut;
    }

    public static HashMap<String, String> getEnAgent(String valdAgent) {
        HashMap<String, String> agentAvNamn = null;
        try {
            agentAvNamn = idb.fetchRow("Select Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Benamning from agent join omrade on omrade = omrade.Omrades_ID where namn = '" + valdAgent + "'");
        } catch (InfException ex) {
            Logger.getLogger(GetMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return agentAvNamn;

    }

    public static ArrayList<String> getAgentNamn() {
        ArrayList<String> NamnListaAgent = null;
        try {
            NamnListaAgent = idb.fetchColumn("Select namn from Agent order by namn");
        } catch (InfException ex) {
            Logger.getLogger(GetMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return NamnListaAgent;

    }

    public static ArrayList<String> getAlienNamn() {
        ArrayList<String> NamnListaAlien = null;
        try {
            NamnListaAlien = idb.fetchColumn("Select namn from Alien order by namn");
        } catch (InfException ex) {
            Logger.getLogger(GetMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return NamnListaAlien;

    }


public static ArrayList<String> getUtrustningsNamn() {
        ArrayList<String> NamnListaUtrustning = null;
        try {
            NamnListaUtrustning = idb.fetchColumn("Select benamning from Utrustning order by benamning");
        } catch (InfException ex) {
            Logger.getLogger(GetMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return NamnListaUtrustning;
}

    public static ArrayList<HashMap<String,String>> getUtrustningsNamnfrånAgentnamn(String agentNamn) {
        ArrayList<HashMap<String,String>> listan = null;
        try {
            listan = idb.fetchRows("select Benamning, Utkvitteringsdatum from utrustning join innehar_utrustning iu on utrustning.Utrustnings_ID = iu.Utrustnings_ID join agent a on iu.Agent_ID = a.Agent_ID where Namn = '" + agentNamn + "'");
        } catch (InfException ex) {
            Logger.getLogger(GetMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listan;

    }
    
    public static ArrayList<HashMap<String,String>> getFordonsNamnFrånAgentNamn(String agentNamn)
    {
     ArrayList<HashMap<String, String>> fordonsNamn = null;
        try {
            fordonsNamn = idb.fetchRows("select Fordonsbeskrivning, Arsmodell, Utkvitteringsdatum from fordon join innehar_fordon i on fordon.Fordons_ID = i.Fordons_ID join agent a on a.Agent_ID = i.Agent_ID where namn ='" + agentNamn+ "'");
        } catch (InfException ex) {
            Logger.getLogger(GetMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return fordonsNamn;
    }}
