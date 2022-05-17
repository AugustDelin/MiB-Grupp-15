/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

    // Hämtar och returnerar strängar från komboboxar.
    public static String hamtaCbSträng(JComboBox enLåda) {
        String cbSträng = enLåda.getSelectedItem().toString();
        return cbSträng;
    }

    public static boolean kollavärdeIStringArrayList(ArrayList<String> ArrayListSträng, String strängAttJämföra) {
        boolean resultat = true;
        for (String enSträng : ArrayListSträng) {
            if (enSträng.equals(strängAttJämföra)) {
                resultat = false;
                JOptionPane.showMessageDialog(null, "Objektet är redan registrerat, försök med ett annat!");
            }
        }
        return resultat;
    }

    public static boolean kollaNullSträng(String enSträng) {
        boolean resultat = true;
        if (enSträng == null) {
            resultat = false;
        }
        return resultat;
    }

    public static boolean kollaDatumFormat(JTextField fält1) {
        boolean resultat = true;
        String datum1 = fält1.getText();
        String format = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(datum1);
            if (!sdf.format(date).equals(datum1)) {
                resultat = false;
                throw new ParseException(datum1 + " is not a valid format for " + format, 0);
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return resultat;
    }

    public static boolean kollaDatumFormat2(JTextField fält1) {
        boolean resultat = true;
        String ettDatum = fält1.getText();
        Pattern pattern = Pattern.compile("\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$");
        Matcher matcher = pattern.matcher(ettDatum);
        boolean matchFound = matcher.find();
        if (!matchFound) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt datumformat(korrekt format är YYYY-MM-DD");
        }
        return resultat;
    }

}
