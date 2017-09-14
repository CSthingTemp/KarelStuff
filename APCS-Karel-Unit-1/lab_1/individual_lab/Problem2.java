package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void moveMore(int value){
        for(short i=0; i<value; i++)
            move();
    }
    
    public void shuttleRace() {
        turnLeft();
        move();
        
        turnRight();
        moveMore(2);
        turnRight();
        moveMore(2);
        
        for(byte i=0; i<4; i++){
            turnLeft();
            moveMore(2);
        }
        
        turnRight();
        moveMore(2);
        turnRight();
        move();
        turnRight();
    }
   
}