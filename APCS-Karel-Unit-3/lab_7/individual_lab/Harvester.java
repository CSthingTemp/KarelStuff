package lab_7.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Harvester extends Robot
{
    int[][]field = new int[6][5];
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void harvest() {
        for(int i=0; i<field.length; i++){
            for(int j=0; j<field[0].length; j++){ //fix like all of this
                move();
                while(nextToABeeper()){
                    pickBeeper();
                    field[i][j]++;
                }
            }
            turnLeft();
            turnLeft();
            for(int j=0; j<field[0].length; j++){
                move();
            }
            turnRight();
            move();
            turnRight();
        }
        printField();
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void printField() {
       System.out.println("[");
       for(int i=0; i<this.field.length-1; i++){
           System.out.print("[");
           for(int j=0; j<this.field[0].length-1; j++){
               System.out.print(this.field[i][j]+", ");
           }
           System.out.print(this.field[this.field.length-1][this.field[0].length-1]);
           System.out.println("], ");
       }
       System.out.print("[");
       for(int j=0; j<this.field[0].length-1; j++){
           System.out.print(this.field[this.field.length-1][j]+", ");
       }
       System.out.print(this.field[this.field.length-1][this.field[0].length-1]);
       System.out.println("]");
       System.out.println("]");
    }
   
}

