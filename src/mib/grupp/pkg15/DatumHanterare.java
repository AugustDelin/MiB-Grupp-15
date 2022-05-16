/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.time.LocalDate;


/**
 *
 * @author augustdelin
 */
public class DatumHanterare {

    private static LocalDate ettDatum;

    public DatumHanterare() {
        String Dagensdatum = LocalDate.now().toString();
        System.out.println(Dagensdatum);
    }

    public static String getDagensDatum() {
        String DagensDatum = LocalDate.now().toString();
        return DagensDatum;
    }
}

