package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;
import java.lang.Math;

public class Problem3 extends Robot{
    
    public Problem3(int st, int av, Direction dir, int beep){
        super(st, av, dir, beep);
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void main(){
        String[] list = {
            "10010111010001000111",
            "10010100010001000101",
            "11110111010001000101",
            "10010100010001000101",
            "10010111011101110111"
        };
        for(int j=0; j<2; j++){
            for(int i=0; i<20; i++){
                move();
                if(list[j*2].charAt(i) == '1')
                    putBeeper();
            }
            move();
            turnRight();
            move();
            turnRight();
            for(int i=19; i>=0; i--){
                move();
                if(list[j*2+1].charAt(i) == '1')
                    putBeeper();
            }
            move();
            turnLeft();
            move();
            turnLeft();
        }
        for(int i=0; i<20; i++){
            move();
            if(list[4].charAt(i) == '1')
                putBeeper();
        }
        move();
    }
}
