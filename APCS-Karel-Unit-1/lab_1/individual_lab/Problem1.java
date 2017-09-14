package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
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
    
    public void rearrangeBeepers() {
        turnRight();
        moveMore(2);
        turnLeft();
        moveMore(2);
        turnLeft();
        for(int i=0; i<4; i++){
            pickBeeper();
            move();
        }
        pickBeeper();
        turnLeft();
        moveMore(2);
        turnLeft();
        moveMore(2);
        turnLeft();
        for(int i=0; i<4; i++){
            putBeeper();
                move();
        }
        putBeeper();
        turnRight();
        moveMore(2);
        turnRight();
        moveMore(2);
        turnRight();
    }
   
}