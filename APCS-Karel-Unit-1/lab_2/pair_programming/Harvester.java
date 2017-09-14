package lab_2.pair_programming;
import java.lang.Math;

import kareltherobot.*;
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void harvest() {
        move();
        for(byte i=0; i<3; i++){
            for(byte j=0; j<4; j++){
                pickBeeper();
                move();
            }
            pickBeeper();
            turnLeft();
            move();
            turnLeft();
            for(byte j=0; j<4; j++){
                pickBeeper();
                move();
            }
            pickBeeper();
            if(i!=2){
                turnRight();
                move();
                turnRight();
            }
        }
    }
    
    public void putBack(){
        turnLeft();
        turnLeft();
        for(byte i=0; i<3; i++){
            for(byte j=0; j<4; j++){
                putBeeper();
                move();
            }
            putBeeper();
            turnRight();
            move();
            turnRight();
            for(byte j=0; j<4; j++){
                putBeeper();
                move();
            }
            putBeeper();
            if(i!=2){
                turnLeft();
                move();
                turnLeft();
            }
        }
        move();
        turnLeft();
        turnLeft();
    }
    
}

