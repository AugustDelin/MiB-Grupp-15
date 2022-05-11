/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import oru.inf.InfException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import oru.inf.InfDB;
/**
 *
 * @author augustdelin
 */
public class AlienMetoder {

    private static InfDB idb;
    private static StartSkärm ettFönster; 

    public AlienMetoder(StartSkärm ettFönster) {
        idb = Main.getDB();
        this.ettFönster = ettFönster;

    }

    public static void loggaInAlien(JTextField användarnamnRuta, JPasswordField lösenruta) {
        if (Validera.kollaTom(användarnamnRuta) && Validera.kollaTom(lösenruta)) {
            try {
                //hämtar användarnamn ifrån loginruta
                String användarnamn = användarnamnRuta.getText();

                // hämta lösenordet som matchar angivet användarnamn ifrån databasen
                String lösenord = idb.fetchSingle("Select Losenord from alien where namn ='" + användarnamn + "'");

                //jämför inskrivet lösen med det som står skrivet i rutan lösenord
                if (Validera.kollaNullvärde(lösenord) && Validera.kollaLösen(lösenord, lösenruta)) {

                    //om ovan villkor är true skapas en ny ruta
                    new AlienStartSkärm(användarnamn).setVisible(true);
                    ettFönster.dispose();
                }

            } catch (InfException ex) {
                Logger.getLogger(StartSkärm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void visaOC(JLabel ettFönster, String användarnamn) {
        try {
            String OC = idb.fetchSingle("Select agent.namn from agent join omradeschef on agent.Agent_ID = omradeschef.Agent_ID join omrade on omradeschef.omrade = omrade.Omrades_ID join plats on omrade.Omrades_ID = plats.Finns_I join alien on plats.Plats_ID = alien.Plats where alien.namn = '"+ användarnamn+"'");
            ettFönster.setText("Din områdeschef är: " + OC);
        } catch (InfException ex) {
            Logger.getLogger(AlienMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }
}

