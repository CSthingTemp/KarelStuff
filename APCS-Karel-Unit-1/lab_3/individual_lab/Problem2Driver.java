package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2Driver implements Directions
{
    public static void main(String args[])  {
        Problem2 karel = new Problem2(1, 1, East, -1);
        karel.carpetRooms(9);
        karel.turnOff();
        
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig5-8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(8);  
        World.setVisible(true);
    }
}
