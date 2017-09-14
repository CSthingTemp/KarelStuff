package lab_5.pair_programming;
import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers(){
        move();
        int i=0;
        for(; this.nextToABeeper(); i++){
            pickBeeper();
        }
        for(int j=0; j<i*2; j++){
            putBeeper();
        }
        move();
    }
}
