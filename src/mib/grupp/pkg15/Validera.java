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

    public static boolean kollaLösen(JPasswordField lösenruta, String enSträng) {
        boolean resultat = true;
        if (lösenruta.getText().equals(enSträng)) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt lösenord");
            lösenruta.requestFocus();

        }
        return resultat;

    }
}
