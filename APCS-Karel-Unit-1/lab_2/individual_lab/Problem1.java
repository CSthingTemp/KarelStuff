package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot{
    public Problem1(int st, int av, Direction dir, int beep){
        super(st, av, dir, beep);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void setPins(){
        putBeeper();
        move();
        turnRight();
        move();
        turnLeft();
        turnLeft();
        pinRow(2);
        turnRight();
        move();
        turnRight();
        move();
        pinRow(3);
        turnLeft();
        move();
        turnLeft();
        move();
        pinRow(4);
    }
    
    public void pinRow(int num){
        for(int i=0; i<num; i++){
            putBeeper();
            move();
            move();
        }
    }
    
    
}
