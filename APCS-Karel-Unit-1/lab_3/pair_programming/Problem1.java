package lab_3.pair_programming;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void checkSurrounded(){
        short count=0;
        while(!frontIsClear() && count<4){
            turnLeft();
            count++;
        }
        if(count==4)
            turnOff();
        else{
            while(count!=4){
                turnLeft();
                count++;
            }
        }
    }
}

