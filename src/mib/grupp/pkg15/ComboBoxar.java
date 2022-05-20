/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erike
 */
//Fälten för klassen ComboBoxar.
public class ComboBoxar {

    private static InfDB idb;

//    Konstruktorn för ComboBoxar.
    public ComboBoxar() {
        idb = Main.getDB();

    }
    //Skapa en ArrayList och fyller denna med platserna som finns
    //enLåda.addItem("");
    public static void fyllCBPlats(JComboBox enLåda) {
        try {
            enLåda.removeAllItems();
            ArrayList<String> platser = idb.fetchColumn("select benamning from plats order by benamning");
            for (String enPlats : platser) {
                enLåda.addItem(enPlats);
            }

        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Skapar en ArrayList och fyller denna med de tre raserna som finns
    //enLåda.addItem("");

    public static void fyllCBras(JComboBox enLåda) {
        ArrayList<String> raslista = new ArrayList();
        raslista.add("Boglodite");
        raslista.add("Squid");
        raslista.add("Worm");

        for (String rasnamn : raslista) {
            enLåda.addItem(rasnamn);
        }

    }
//Skapar en ArrayList och fyller denna namnen som finns hos aliens

    public static void fyllCBAlienNamn(JComboBox enLåda) {
        try {
            ArrayList<String> namnLista = idb.fetchColumn("select namn from alien");

            for (String ettNamn : namnLista) {
                enLåda.addItem(ettNamn);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    Skapar en ArrayList och fyller den med namnen från utrustningslistan.

    public static void fyllCBAgentUtrustning(JComboBox enLåda) {

        try {
            ArrayList<String> utrustningsLista = idb.fetchColumn("Select benamning from utrustning order by benamning");

            for (String enUtrustning : utrustningsLista) {
                enLåda.addItem(enUtrustning);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//    Skapa en ArrayList och fuller den med chefer inom de olika områdena.

    public static void fyllCBchefsOmråden(JComboBox enLåda) {

        try {
            ArrayList<String> områdesLista = idb.fetchColumn("Select Benamning from Omrade order by Benamning");

            for (String ettOmråde : områdesLista) {
                enLåda.addItem(ettOmråde);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//     Skapar en ArrayList och fyller den med namn på agenter.

    public static void fyllCBAgentNamn(JComboBox enLåda) {

        try {
            ArrayList<String> namnListaAgent = idb.fetchColumn("Select Namn from Agent order by namn");

            for (String enAgent : namnListaAgent) {
                enLåda.addItem(enAgent);
            }
        } catch (InfException ex) {
            Logger.getLogger(AgentochAdminMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}