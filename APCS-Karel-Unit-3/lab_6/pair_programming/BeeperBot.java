package lab_6.pair_programming;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[13];
    int tempCount = 0;
    
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAndCountBeepers() {
        move();
        for(int i=0; i<beeperList.length; i++){
            turnLeft();
            for(int j=0; nextToABeeper(); j++){
                pickBeeper();
                beeperList[i]++;
                move();
            }
            turnLeft();
            turnLeft();
            while(frontIsClear())
                move();
            turnLeft();
            if(frontIsClear())
                move();
        }
    }
    
    public int[] getBeeperList() {
        //This will be used to print the beepers found.  No need to modify.
        return beeperList;
    }
   
}

