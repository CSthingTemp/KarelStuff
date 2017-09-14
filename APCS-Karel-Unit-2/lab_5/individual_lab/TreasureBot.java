package lab_5.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends DangerousBot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void faceDirection(int dir){
        if(dir==1){
            while(!facingNorth()){
                turnLeft();
            }
        }else if(dir==2){
            while(!facingEast()){
                turnLeft();
            }
        }else if(dir==3){
            while(!facingSouth()){
                turnLeft();
            }
        }else{
            while(!facingWest()){
                turnLeft();
            }
        }
    }
    
    public void findTreasure() {
        for(int i=0; i<11; i++){ //not sure what the max beepers is
            int moveDirection=pickAllBeepers();
            faceDirection(moveDirection%4);
            while(!nextToABeeper()){
                move();
            }
        }
    }
    
    public int pickAllBeepers(){
        int heldBeepers=0;
        while(nextToABeeper()){
            pickBeeper();
            heldBeepers++;
        }
        return heldBeepers;
    }
}

