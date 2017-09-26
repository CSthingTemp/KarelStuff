package lab_7.pair_programming;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Planter extends Robot
{
    //Instance variable used to store the array for beeper field
    int[][]field;
    
    public Planter(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, -1);
    }
    
    public void setField(int[][]fieldSpecs) {
        this.field = fieldSpecs;
    }
    
    public void plantField() {
        for(int i=0; i<this.field.length; i++){
            for(int j=0; j<this.field[0].length; j++){
                while(this.field[i][j]>=1){
                    putBeeper();
                    this.field[i][j]--;
                }
                move();
            }
            while(!facingNorth())
                turnLeft();
            move();
            if(i%2==0)
                turnLeft();
            else
                turnRight();
        }
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void printField() {
        //Print out the beeperField to console
        for(int row = 0; row < this.field.length; row++){
            for(int col = 0; col < this.field[0].length; col++) {
                System.out.print(this.field[row][col] + " ,");
            }
            System.out.println();
        }
    }
   
}

