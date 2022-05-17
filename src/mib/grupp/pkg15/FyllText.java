/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author erike
 */
public class FyllText {
    
    public FyllText(){
        
    }
    
    public static void välkomstLabel(JLabel textruta, String användarnamn)
    {
        textruta.setText("Välkommen " + användarnamn + ".");
    }
    
    public static void inloggadSom(JLabel textruta, String användarnamn)
    {
        textruta.setText("Du är inloggad som: " + användarnamn + ".");
    }
    
    public static void inloggadSomAdmin(JLabel textruta, String användarnamn)
    {
        textruta.setText("Du är inloggad som: " + användarnamn + "(Administratör).");
    }
    
}
