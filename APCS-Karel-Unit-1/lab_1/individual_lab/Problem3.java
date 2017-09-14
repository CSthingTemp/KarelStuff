package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void moveMore(int a){
        for(int i=0; i<a; i++)
            move();
    }
    
    public void giveCarlBeeper() {
        //This method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
        turnRight();
        moveMore(3);
        putBeeper();
        turnLeft();
        turnLeft();
        moveMore(3);
        turnRight();
    }
    
    public void pickAndMoveBeeper() {
        //This method is for carl to pick up the beeper from karel and move it two blocks north
        pickBeeper();
        turnLeft();
        moveMore(2);
        putBeeper();
        turnLeft();
        turnLeft();
        moveMore(2);
        turnLeft();
    }
   
}