/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import oru.inf.InfDB;
/**
 *
 * @author augustdelin
 */
public class AlienMetoder {

    private static InfDB idb = Main.getDB();

    public AlienMetoder() {

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
                    //StartSkärm.setVisible(false);
                }

            } catch (InfException ex) {
                Logger.getLogger(StartSkärm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

