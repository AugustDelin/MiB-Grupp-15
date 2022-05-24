/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import javax.swing.JLabel;

/**
 *
 * @author erike
 * Används för att fylla vanliga labelar såsom välkomstruta och "Inloggad Som" label
 */
//Fälten för klassen FyllText.
public class FyllText {

    public FyllText() {

    }
    

    /**
     *
     * @param textruta
     * @param användarnamn
     * // Fyller labeln Välkommen och lägger till tar in det namn som man loggat in som som parameter
     */
    public static void välkomstLabel(JLabel textruta, String användarnamn) {
        textruta.setText("Välkommen " + användarnamn + ".");
    }

    /**
     *
     * @param textruta
     * @param användarnamn
     * Fyller rutan där det står "Du är in loggad som" och tar inloggningsnamnet som parameter
     */
    public static void inloggadSom(JLabel textruta, String användarnamn) {
        textruta.setText("Du är inloggad som: " + användarnamn + ".");
    }

    /**
     *
     * @param textruta
     * @param användarnamn
     * Fyller rutan där det står "Du är in loggad som" och tar inloggningsnamnet som parameter samt lägger till Administratör
     */
    public static void inloggadSomAdmin(JLabel textruta, String användarnamn) {
        textruta.setText("Du är inloggad som: " + användarnamn + " (Administratör).");
    }

}
