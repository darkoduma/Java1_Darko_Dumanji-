
package main;

import media.Television;



public class Main {
    
    public static void main(String [] args) {
        
        Television myTv = new Television();
        System.out.println();
        myTv.setVolume(3);
        myTv.setTurnOn(true);
        myTv.setCurrentProgram(10);
        
        myTv.showData();
        
    }
    
    
    
    
    
}
