/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.grupp.pkg15;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
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
}
