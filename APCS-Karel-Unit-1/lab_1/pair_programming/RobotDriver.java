package lab_1.pair_programming;

import kareltherobot.*;
import java.awt.Color;

public class RobotDriver implements Directions {
    public static void main(String args[]) {
        BeeperBot skrub = new BeeperBot(4,1,West,0);
        skrub.findAllBeepers();
        skrub.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/lab-1-pair.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(20);  
        World.setVisible(true);
    }
}