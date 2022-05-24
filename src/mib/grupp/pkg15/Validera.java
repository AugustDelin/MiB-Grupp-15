/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author erike
 * 
 * I klassen fnns de valideringsmetoder som behövs i programmet
 */
public class Validera {

    /**
     *
     * @param enRuta
     * @return
     * Metod för att kolla om rutan för användarnamn är tom. Ifall rutan är tom skrivs ett felmeddelande ut 
       som beskriver problemet.

     */
    public static boolean kollaTom(JTextField enRuta) {
        boolean resultat = true;
        if (enRuta.getText().isEmpty()) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Någon ruta är tom.");
            enRuta.requestFocus();
        }
        return resultat;
    }

    

    /**
     *
     * @param enSträng
     * @param lösenruta
     * @return
     * Kontrollerar så att lösenordet som skrivs in och som finns i databasen stämmer överens.
     * Om det inte stämmer skrivs ett felmeddelande ut.
     */
    public static boolean kollaLösen(String enSträng, JPasswordField lösenruta) {
        boolean resultat = true;
        if (!enSträng.equals(lösenruta.getText())) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt lösenord");
            lösenruta.requestFocus();

        }
        return resultat;

    }

    

    /**
     *
     * @param adminstatus
     * @return
     * Kontrollerar adminstatus, genom att kontrollera om "J" står skrivet i administratör
     * Om detta inte är fallet skrivs felmeddlande ut.
     */
    public static boolean kollaAdmin(String adminstatus) {
        boolean resultat = true;
        if (!adminstatus.equals("J")) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Du har inte administratörsbehörigheter!");
        }
        return resultat;
    }

    
    /**
     *
     * @param variabelAttKolla
     * @return
     * Kontrollerar om en viss variabel innehåller ett nullvärde.
     * Används vid inloggning och kollar om det finns ett lösenord till vald namn.
     * Om valt namn inte har något lösenord kommer felmeddelande upp.
     */
    public static boolean kollaNullvärde(String variabelAttKolla) {
        boolean resultat = true;
        if (variabelAttKolla == null) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt användarnamn");
        }
        return resultat;
    }

    /**
     *
     * @param ArrayListSträng
     * @param strängAttJämföra
     * @param felmeddelande
     * @return
     * Tar in en ArrayList, en sträng samt valt felmeddelande.
     * Metoden går igenom ett ArrayList och kollar om vald sträng finns i listan.
     * Om vald sträng finns skrivs ett felmeddelande ut.
     * Metoden kan återanvändas på många ställen då den även tar in en sträng som motsvarar ett felmeddelande.
     * 
     */
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

    /**
     *
     * @param enSträng
     * @return
     * Kollar om värdet i en sträng är Null, utan felmeddelande
     */
    public static boolean kollaNullSträng(String enSträng) {
        boolean resultat = true;
        if (enSträng == null) {
            resultat = false;
        }
        return resultat;
    }

    

    /**
     *
     * @param fält1
     * @return
     * Metod för att kolla så att man angivet rätt datumformat och inom rätt årsinterval.
     * Har valt från 1950 som tidigaste datum och nuvarande år som senaste datum.
     */
    public static boolean kollaDatumFormat(JTextField fält1) {
        boolean resultat = true;
        String ettDatum = fält1.getText();
        // Pattern definerar vad som är korrekt mönster/format och matcher kontrollerar mot pattern
        // matchfound returnerar ett sant ett falskt värde beroende på om matchningen är korrekt
        Pattern pattern = Pattern.compile("\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$");
        Matcher matcher = pattern.matcher(ettDatum);
        boolean matchFound = matcher.find();
        //Nedan hämtas de fyra första sifforna ifrån valtdatum(dvs året.) Valt datum samt nuvarande år görs om till intvariabler
        String valtÅrtal = ettDatum.substring(0, 4);
        int kollaÅrtal = Integer.parseInt(valtÅrtal);
        int nuvarandeÅr = Integer.parseInt(DatumHanterare.getNuvarandeÅrtal());
        //Om formatet INTE är korrekt returneras ett felmeddelande
        if (!matchFound) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt datumformat(korrekt format är YYYY-MM-DD)");
        }
        //Här används int variblerna för kontrollera årsintervallerna. Vi har valt korrekta intervall från 1950-(nuvarande år) 2022
        //Om inmatat värde faller utanför detta intervall kommer ett felmeddelande
        if (kollaÅrtal < 1950 || kollaÅrtal > nuvarandeÅr) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt årsintervall (korrekta årtal 1950-nuvarande år)");

        }
        return resultat;
    }

    /**
     *
     * @param ettFält
     * @return
     * Denna metod används för att kontrollera rutan "rasattribut"
     * Vi har gjort en begränings som säger att man som minst måste ha 1 och max får ha 19 boogies eller armar
     * Om man inte gjort rätt skrivs felmeddelande ut
     */
    public static boolean kollaMängdRasAttribut(JTextField ettFält) {
        boolean resultat = true;
        String ettTal = ettFält.getText();
        //Pattern visar att man värdet som ska matchas bestå av antingen en 1 följt av ett tal mellan 0-9 ELLER en siffra mellan 1-9
        Pattern pattern = Pattern.compile("^(1[0-9]|[1-9])$");
        Matcher matcher = pattern.matcher(ettTal);
        boolean matchFound = matcher.find();
        if (!matchFound) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt angivet rasattribut, fältet tar tal mellan 1-19");
            ettFält.requestFocus();

        }
        return resultat;
    }

    /**
     *
     * @param ettFält
     * @return
     * Kontrollerar att man skrivit in telefonnummer med endast siffor.
     * Har lagt till begränsning att man BARA kan ha siffor och måste ange minst en siffra men max tio siffor
     */
    public static boolean kollaTelefonnummer(JTextField ettFält) {
        boolean resultat = true;
        String ettTelefonnummer = ettFält.getText();
        Pattern pattern = Pattern.compile("^[0-9]{1,10}$");
        Matcher matcher = pattern.matcher(ettTelefonnummer);
        boolean matchFound = matcher.matches();
        if (!matchFound) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt angivet telefonnummer, du kan ange max tio siffror i detta fält (använd ej bindelstreck!)");
            ettFält.requestFocus();
        }

        return resultat;
    }

    /**
     *
     * @param ettFält
     * @return
     * Databasen tar max sex tecken i lösenordsfältet. Denna metoden ser till så att man inte matar in för många tecken.
     * Om man skrivit fler än sex tecken kommer felmeddelande upp
     */
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

    /**
     *
     * @param ettFält
     * @return
     * Denna metod kontrollerar så att man angivit endast en VERSAL när man matar in agentnamn vid nyregistrering samt omregistrering av agent.
     * Om man gjort "fel" kommer felmeddelande upp.
     * 
     */
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
    
    public static boolean kollaVärdeINTEFinnsIArrayList(ArrayList<String> ArrayListSträng, String strängAttJämföra, String felmeddelande) {
        boolean resultat = false;
        for (String enSträng : ArrayListSträng) {
            if (enSträng.equalsIgnoreCase(strängAttJämföra)) {
                resultat = true;
                JOptionPane.showMessageDialog(null, felmeddelande);

            }
        }
        return resultat;
    }
    
    public static boolean kollaIntVapen(JTextField ettFält) {
        boolean resultat = true;
        String ettTelefonnummer = ettFält.getText();
        Pattern pattern = Pattern.compile("^[0-9]{1,10}$");
        Matcher matcher = pattern.matcher(ettTelefonnummer);
        boolean matchFound = matcher.matches();
        if (!matchFound) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Felaktigt angivenkaliber, du kan ange max tio siffror i detta fält!");
            ettFält.requestFocus();
        }

        return resultat;
    }


}
