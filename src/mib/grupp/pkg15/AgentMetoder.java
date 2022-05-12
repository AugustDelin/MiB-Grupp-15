/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erike
 */
public class AgentMetoder {
    
    private static InfDB idb; 
    private static StartSkärm ettFönster;
    
    public AgentMetoder(StartSkärm ettFönster){
        this.ettFönster = ettFönster;
        idb = Main.getDB();
        
    }
    
    public static void loggainAgent(JTextField användarnamnRuta, JPasswordField lösenruta){
        //idb = Main.getDB();
        if (Validera.kollaTom(användarnamnRuta) && Validera.kollaTom(lösenruta)) {
            try {
                //hämtar användarnamn ifrån loginruta
                String användarnamn = användarnamnRuta.getText();

                // hämta lösenordet som matchar angivet användarnamn ifrån databasen
                String lösenord = idb.fetchSingle("Select Losenord from agent where namn ='" + användarnamn + "'");

                //jämför inskrivet lösen med det som står skrivet i rutan lösenord
                if (Validera.kollaNullvärde(lösenord) && Validera.kollaLösen(lösenord, lösenruta)) {

                    //om ovan villkor är true skapas en ny ruta
                    new AgentStartSkärm(användarnamn).setVisible(true);
                    ettFönster.dispose();
                    
                }

            } catch (InfException ex) {
                Logger.getLogger(StartSkärm.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }
    
    public static void bytLösenord(String användarnamn, JPasswordField gammaltlösen, JPasswordField nyttlösen){
        if(Validera.kollaTom(gammaltlösen) && Validera.kollaTom(nyttlösen))
        try {
            String lösenord = idb.fetchSingle("Select Losenord from AGENT where namn ='" + användarnamn + "'");
            if(Validera.kollaLösen(lösenord, gammaltlösen)){
                String nyttLösenord = nyttlösen.getText();
                idb.update("UPDATE AGENT SET losenord='"+nyttLösenord +"' where namn ='" + användarnamn +  "'");
                JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
            }
        } catch (InfException ex) {
            Logger.getLogger(AlienMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    public static void listaAliensPåPlats(JTextArea lista, JComboBox låda) {
        try {
            ArrayList<String> platser = idb.fetchColumn("select benamning from plats");
            for(String plats : platser) {
                låda.addItem(plats);
            }
           
            ArrayList<String> aliensPåPlats = idb.fetchColumn("select namn from alien join plats on alien.Plats = plats.Plats_ID where plats.benamning = 'Västerås'");
            for (String alien : aliensPåPlats) {
                lista.append(alien + "\n");
            }

        } catch (InfException ex) {
            Logger.getLogger(AgentMetoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void hamtaCbSträng()
    {
        
    }

    
}

