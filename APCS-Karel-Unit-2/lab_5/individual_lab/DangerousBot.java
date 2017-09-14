package lab_5.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void choosePile() {
        int heldBeepers=0;
        while(nextToABeeper()){
            pickBeeper();
            heldBeepers++;
        }
        if(heldBeepers%2==0){
            turnRight();
        }else{
            turnLeft();
        }
        move();
        for(int i=0; nextToABeeper(); i++){
            pickBeeper();
        }
        turnLeft();
        turnLeft();
        move();
    }
   
}

