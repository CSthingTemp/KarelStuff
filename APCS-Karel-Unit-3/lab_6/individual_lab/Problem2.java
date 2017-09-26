package lab_6.individual_lab;
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
    
    public void buildFence() {
        while(!facingNorth())
            turnLeft();
        while(!nextToABeeper())
            move();
        while(nextToABeeper())
            pickBeeper();
        getToCorner();
        turnRight();
        for(int i=0; i<4; i++){
            while(nextToWall()){
                putBeeper();
                move();
            }
            turnLeft();
            move();
        }
        turnRight();
        move();
    }
    
    public void getToCorner(){
        while(!facingNorth())
            turnLeft();
        while(frontIsClear()){
            turnRight();
            move();
            turnLeft();
        }
    }
    
    public boolean nextToWall(){
        turnLeft();
        boolean a=!frontIsClear();
        turnRight();
        return a;
    }
}

