package lab_2.individual_lab;


import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(7, 1, East, -1);
        karel.main();
        karel.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("H:/CS-A/APCS-Karel-Unit-1/worlds/lab-2-p3.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(4);  
        World.setVisible(true);
    }
}