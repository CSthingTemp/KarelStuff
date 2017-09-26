package lab_7.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Quad extends Robot
{
    //This array should track 
    int[][]columns = new int[4][5];
    public Quad(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixQuad() {
        for(int i=0; i<4; i++){
            turnLeft();
            for(int j=0; j<5; j++){
                if(!nextToABeeper()){
                    putBeeper();
                    columns[i][j]++;
                }
                if(j!=4)
                    move();
            }
            turnLeft();
            turnLeft();
            while(frontIsClear()){
                move();
            }
            turnLeft();
            for(int j=0; j<4; j++){
                move();
            }
        }
    }
    
    public void printFixes() {
        System.out.println("{");
        for(int i=0; i<4-1; i++){
            System.out.print("{");
            for(int j=0; j<5-1; j++){
                System.out.print(columns[i][j]+", ");
            }
            System.out.println(columns[i][columns[0].length-1]+"},");
        }
        System.out.print("{");
        for(int j=0; j<5-1; j++){
            System.out.print(columns[columns.length-1][j]+", ");
        }
        System.out.println(columns[columns.length-1][columns[0].length-1]+"}");
        System.out.println("}");
        //This method should print the beepers placed in each column of the quad
        //If a beeper was already present, then the entry should be zero
        //If a beeper was placed, the entry should be 1
        //The first column should be {1, 1, 1, 0, 0}
        
    }
   
}

