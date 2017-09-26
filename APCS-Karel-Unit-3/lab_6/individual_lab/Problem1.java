package lab_6.individual_lab;
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
    
    public int[] beeperList={0,0,0,0,0,0,0,0};
    public void sortBeepers() {
        move();
        goToFloor();
        turnLeft();
        for(int i=0; i<8; i++){
            turnLeft();
            while(nextToABeeper()){
                pickBeeper();
                beeperList[i]++;
                move();
            }
            goToFloor();
            turnLeft();
            move();
        }
        turnLeft();
        int arrayMax=maxOfArray(beeperList);
        for(int i=0; i<arrayMax; i++){
            move();
        }
        turnLeft();
        while(frontIsClear()){
            move();
        }
        goToFloor();
        turnLeft();
        
        sortList(beeperList);
        
        for(int i=0; i<8; i++){
            turnLeft();
            while(beeperList[i]>0){
                putBeeper();
                beeperList[i]--;
                move();
            }
            goToFloor();
            turnLeft();
            move();
        }
        System.out.println(beeperList[beeperList.length-1]);
    }
    
    public int maxOfArray(int[] arr){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    
    public void sortList(int[] list){
        for(int j=0; j<list.length-1; j++){
            for(int i=0; i<list.length-1; i++){
                if(list[i]>list[i+1]){
                    int a=list[i];
                    list[i]=list[i+1];
                    list[i+1]=a;
                }
            }
        }
    }
    
    public void turnAround(){
        turnLeft();
        turnLeft();
    }
    
    public void goToFloor(){
        while(!facingSouth()){
            turnLeft();
        }
        while(frontIsClear()){
            move();
        }
    }
    
    public void faceEast(){
        while(!facingEast())
            turnLeft();
    }
    
    
}

