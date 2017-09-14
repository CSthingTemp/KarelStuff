package lab_5.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends TreasureBot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        for(int i=0; i<5; i++){
            move();
            boolean placeBeepers=nextToABeeper();
            turnLeft();
            
            move();
            putOrPlaceBeepers(placeBeepers);
            moveToNextArea();
            
            move();
            putOrPlaceBeepers(placeBeepers);
            moveToNextArea();
            
            turnRight();
            move();
        }
    }
    
    public void moveToNextArea(){
        turnLeft();
        turnLeft();
        move();
    }
    
    public void putOrPlaceBeepers(boolean doPlace){
        if(doPlace){
            if(!nextToABeeper()){
                putBeeper();
            }
        }else{
            while(nextToABeeper()){ //there's a corner with two beepers . . .
                pickBeeper();
            }
        }
    }
   
}

