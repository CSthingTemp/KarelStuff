package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void carpetRooms(int maxAves){
        //first ave can't have a house
        for(int i=0; i<maxAves-1; i++){
            move();
            turnLeft();
            if(frontIsClear()){ //check if can enter house
                move();
                turnLeft();
                if(!frontIsClear()){ //check if left wall is there
                    turnLeft();
                    turnLeft();
                    if(!frontIsClear()){ //check if right wall is there
                        turnLeft();
                        if(!frontIsClear()){ //check if front wall is there
                            putBeeper();
                        }
                        turnLeft();
                        turnLeft();
                        move();
                        turnLeft();
                    }else{
                        turnRight();
                        move();
                        turnLeft();
                    }
                }else{
                    turnLeft();
                    move();
                    turnLeft();
                }
            }else{
                turnRight();
            }
        }
    }
}

