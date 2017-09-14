package lab_4.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Problem2
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        while(true){
            if(leftWallEmpty()){
                if(beeperWindow()){
                    returnToStart();
                    return;
                }
            }
            if(!frontIsClear()){
                turnRight();
            }
            move();
        }
    }
    
    public boolean beeperWindow(){
        turnLeft();
        move();
        if(!nextToABeeper()){
            putBeeper();
        }else{
            return true;
        }
        
        turnLeft();
        turnLeft(); //turn around
        
        move();
        turnLeft();
        return false;
    }
    
    public void returnToStart(){
        turnLeft();
        turnLeft();
        move();
        turnRight();
        move();
        turnLeft();
        turnLeft();
    }
    
}

