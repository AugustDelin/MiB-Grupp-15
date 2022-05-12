/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.grupp.pkg15;

/**
 *
 * @author erike
 */
public class Navigera {
    
    public Navigera(){
        
    }
    
    public static void openStartSkärm()
    {
        new StartSkärm().setVisible(true);
    }
    
    public static void openAlienStartSkärm(String användarnamn)
    {
        new AlienStartSkärm(användarnamn).setVisible(true);
    }
    
    public static void openAgentStartSkärm(String användarnamn)
    {
        new AgentStartSkärm(användarnamn).setVisible(true);
    }
    
    public static void openAgentMinSida(String användarnamn)
    {
        new AgentMinSida(användarnamn).setVisible(true);
    }
    
    public static void avslutaProgram()
    {
        System.exit(0);
    }
    
}
