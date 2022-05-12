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
    
    //metod som skapar en instans av klassen StartSkärm och visar denna
    public static void openStartSkärm()
    {
        new StartSkärm().setVisible(true);
    }
    
    //metod som skapar en instans av klassen AlienStartSkärm och visar denna
    public static void openAlienStartSkärm(String användarnamn)
    {
        new AlienStartSkärm(användarnamn).setVisible(true);
    }
    
    //metod som skapar en instans av klassen AgentStartSkärm och visar denna
    public static void openAgentStartSkärm(String användarnamn)
    {
        new AgentStartSkärm(användarnamn).setVisible(true);
    }
    
    //metod som öppnar en ny sida av AgentMinSIda
    public static void openAgentMinSida(String användarnamn)
    {
        new AgentMinSida(användarnamn).setVisible(true);
    }
    
    public static void avslutaProgram()
    {
        System.exit(0);
    }
    
}