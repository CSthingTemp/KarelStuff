package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  asdf
 */
public class BeeperBot extends Robot {
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
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
    
    public void findAllBeepers() {
        turnLeft();
        moveMore(3);
        turnLeft();
        moveMore(2);
        for(byte i=0; i<3; i++){
            pickBeeper();
            moveMore(3);
            if(i!=2)
                turnLeft();
        }
        pickBeeper();
        moveMore(2);
    }
   
}

