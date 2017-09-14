package lab_4.pair_programming;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void runRace() {
        while(frontIsClear()){ //facing right
            moveToNextBeeper();
            turnLeft(); //facing up
            collectBeepers();
            
            turnLeft();
            turnLeft(); //facing down
            
            backToStart();
            turnLeft(); //facing left
        }
    }
    
    public void moveToNextBeeper(){
        while(!nextToABeeper()){
            move();
        }
    }
    
    public void collectBeepers(){
        while(nextToABeeper()){
            pickBeeper();
            move();
        }
    }
    
    public void backToStart(){
        while(frontIsClear()){
            move();
        }
    }
    
}

