/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.time.LocalDate;
import java.util.Date;


/**
 *
 * @author augustdelin
 */
public class DatumHanterare {


    public DatumHanterare() {
        
    }

    public static String getDagensDatum() {
        String dagensDatum = LocalDate.now().toString();
        return dagensDatum;
    }
}

