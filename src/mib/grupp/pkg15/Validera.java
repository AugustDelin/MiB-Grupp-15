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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author erike
 */
// Metod för att kolla om rutan för användarnamn är tom. Ifall rutan är tom skrivs ett felmeddelande ut 
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

    public static boolean kollaOmvärdeFinnsIArrayList(ArrayList<String> ArrayListSträng, String strängAttJämföra, String felmeddelande) {
        boolean resultat = true;
        for (String enSträng : ArrayListSträng) {
            if (enSträng.equalsIgnoreCase(strängAttJämföra)) {
                resultat = false;
                JOptionPane.showMessageDialog(null, felmeddelande);

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

    // Metod för att kolla så att man angivet rätt datumformat
    public static boolean kollaDatumFormat(JTextField fält1) {
        boolean resultat = true;
        String ettDatum = fält1.getText();
        Pattern pattern = Pattern.compile("\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$");
        Matcher matcher = pattern.matcher(ettDatum);
        boolean matchFound = matcher.find();
        String valtÅrtal = ettDatum.substring(0, 4);
        int kollaÅrtal = Integer.parseInt(valtÅrtal);
        int nuvarandeÅr = Integer.parseInt(DatumHanterare.getNuvarandeÅrtal());
        if (!matchFound) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt datumformat(korrekt format är YYYY-MM-DD)");
        }
        if (kollaÅrtal < 1950 || kollaÅrtal > nuvarandeÅr) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt årsintervall (tidigaste godkända årtal år 1950)");

        }
        return resultat;
    }

    public static boolean kollaMaxTvåsiffror(JTextField ettFält) {
        boolean resultat = true;
        String ettTal = ettFält.getText();
        Pattern pattern = Pattern.compile("^(1[0-9]|[1-9])$");
        Matcher matcher = pattern.matcher(ettTal);
        boolean matchFound = matcher.find();
        if (!matchFound) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt angivet format, fältet tar tal mellan 1-19");
            ettFält.requestFocus();

        }
        return resultat;
    }

    public static boolean kollaTelefonnummer(JTextField ettFält) {
        boolean resultat = true;
        String ettTelefonnummer = ettFält.getText();
        Pattern pattern = Pattern.compile("^-?[0-9]{1,10}$");
        Matcher matcher = pattern.matcher(ettTelefonnummer);
        boolean matchFound = matcher.matches();
        if (!matchFound) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt angivet telefonnummer, du kan ange max tio siffror i detta fält");
            ettFält.requestFocus();
        }

        return resultat;
    }

    public static boolean kollaLängdLösenord(JTextField ettFält) {
        boolean resultat = true;
        String lösenord = ettFält.getText();
        if (lösenord.length() > 6) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Ditt lösenord får vara max sex tecken långt!");
            ettFält.requestFocus();
        }
        return resultat;
    }

    public static boolean kontrolleraAgentNamn(JTextField ettFält) {
        boolean resultat = true;
        String ettTelefonnummer = ettFält.getText();
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(ettTelefonnummer);
        boolean matchFound = matcher.matches();
        if (!matchFound) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt angivet Agentnamn, du kan endast ange en bokstav med stora bokstäver i detta fält");
            ettFält.requestFocus();
        }

        return resultat;

    }

}
