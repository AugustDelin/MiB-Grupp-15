/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author erike
 */
public class Validera {

    public static boolean kollaTom(JTextField enRuta) {
        boolean resultat = true;
        if (enRuta.getText().isEmpty()) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Någon ruta är tom.");
            enRuta.requestFocus();
        }
        return resultat;
    }
    
    public static boolean kollaTomPWF(JPasswordField enRuta) {
        boolean resultat = true;
        if (enRuta.getText().isEmpty()) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Någon ruta är tom.");
            enRuta.requestFocus();
        }
        return resultat;
    }

    public static boolean kollaLösen(String enSträng, JPasswordField lösenruta) {
        // kontrollerar om lösenord stämmer
        boolean resultat = true;
        if (!enSträng.equals(lösenruta.getText())) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt lösenord");
            lösenruta.requestFocus();

        }
        return resultat;

    }
    
    public static boolean kollaAdmin(String adminstatus) {
        boolean resultat = true;
        if(!adminstatus.equals("J")) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Du har inte administratörsbehörigheter!");
        }
        return resultat;
    }
    
    public static boolean kollaNullvärde(String variabelAttKolla){
        boolean resultat = true;
        if(variabelAttKolla == null){
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt användarnamn");
        }
        return resultat;
    }
}
