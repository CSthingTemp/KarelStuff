package lab_4.individual_lab;
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
    
    public void escapeRoom() {
        getToWall(); //to allign it to a wall
        turnLeft(); //initialize conditions for wall checking
        
        while(!rightWallEmpty()){
            if(!frontIsClear()){ //corners
                turnLeft();
            }
            move();
        }
        
        turnRight();
        move();
        move();
    }
    
    public boolean rightWallEmpty(){
        turnRight();
        boolean asdf=frontIsClear();
        turnLeft();
        return asdf;
    }
    
    public void getToWall(){
        while(frontIsClear()){
            move();
        }
    }
    
    
}

