package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep){
        super(st, av, dir, beep);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void setField(){
        turnRight();
        putBeeper();
        move();
        turnLeft();
        move();
        turnLeft();
        pinRow(2);
    }
    
    public void pinRow(int num){
        for(int i=0; i<num; i++){
            putBeeper();
            move();
            if(i!=num-1)
                move();
        }
    }
}
