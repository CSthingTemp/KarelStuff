package lab_4.individual_lab;
import kareltherobot.*;


/**
 * @author :  D. Appel
 */
public class Problem2 extends Problem1
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()){
            beeperMove();
        }
        move();
    }
    
    public void beeperMove(){
        putBeeper();
        if(leftWallEmpty()){
            turnLeft();
        }
        if(!frontIsClear()){
            turnRight();
        }
        move();
    }
    
    public boolean leftWallEmpty(){
        turnLeft();
        boolean asdf=frontIsClear();
        turnRight();
        return asdf;
    }
}

