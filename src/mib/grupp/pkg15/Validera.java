/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author erike
 */
// Metod för att kolla om rutan för användarnamn är tom. Ifall rutan är tom skriver ut ett felmeddelande 
//som beskriver problemet.
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
    // Metod för att kolla om rutan för användarnamn är tom. Ifall rutan är tom skriver ut ett felmeddelande 
    //som beskriver problemet.
    public static boolean kollaTomPWF(JPasswordField enRuta) {
        boolean resultat = true;
        if (enRuta.getText().isEmpty()) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Någon ruta är tom.");
            enRuta.requestFocus();
        }
        return resultat;
    }
    //Kontrollerar så att lösenordet som skrivs in och som finns i databasen stämmer överens.
    public static boolean kollaLösen(String enSträng, JPasswordField lösenruta) {
        boolean resultat = true;
        if (!enSträng.equals(lösenruta.getText())) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt lösenord");
            lösenruta.requestFocus();

        }
        return resultat;

    }
    // Kollar så att agentens adminstatus är giltig.
    public static boolean kollaAdmin(String adminstatus) {
        boolean resultat = true;
        if (!adminstatus.equals("J")) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Du har inte administratörsbehörigheter!");
        }
        return resultat;
    }
    // Kontrollerar så att användarnamnet i databasen stämmer överens med det inmatade användarnamnet.
    public static boolean kollaNullvärde(String variabelAttKolla) {
        boolean resultat = true;
        if (variabelAttKolla == null) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt användarnamn");
        }
        return resultat;
    }
    //    Används i 
    public static String hamtaCbSträng(JComboBox enLåda) {
        String cbSträng = enLåda.getSelectedItem().toString();
        return cbSträng;
    }
}
