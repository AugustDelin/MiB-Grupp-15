/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

/**
 *
 * @author augustdelin
 */
//Fälten för klassen DatumHanterare.
public class DatumHanterare {

//Konstruktorn för klassen DatumHanterare.
    public DatumHanterare() {

    }

    public static String getDagensDatum() {
        String dagensDatum = LocalDate.now().toString();
        return dagensDatum;
    }

    public static String getNuvarandeÅrtal() {
        String nuvarandeÅr = Year.now().toString();
        return nuvarandeÅr;

    }
}
