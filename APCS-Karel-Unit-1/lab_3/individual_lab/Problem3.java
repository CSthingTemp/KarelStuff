package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
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
        int count=0; //number of streets bot has gone down
        for(int i=0; i<maxAves-1; i++){
            move();
            turnLeft(); //facing up
            if(frontIsClear()){ //check if can enter house
                move();
                count++;
                turnLeft(); //facing left
                while(count>0){
                    if(!frontIsClear()){ //check if left wall is there
                        turnLeft();
                        turnLeft(); //facing right
                        if(!frontIsClear()){ //check if right wall is there
                            turnLeft(); //facing up
                            if(frontIsClear()){ //check if end wall is there
                                move();
                                count++;
                                turnLeft(); //facing left
                                continue;
                            }else{
                                turnLeft();
                                turnLeft(); //facing down
                                while(count>0){
                                    putBeeper();
                                    move();
                                    count--;
                                }
                            }
                        }else{
                            turnRight(); //facing down
                            while(count>0){
                                move();
                                count--;
                            }
                        }
                    }else{
                        turnLeft(); //facing down
                        while(count>0){
                            move();
                            count--;
                        }
                    }
                }
                turnLeft(); //facing left
            }else{
                turnRight();
            }
        }
    }
}

