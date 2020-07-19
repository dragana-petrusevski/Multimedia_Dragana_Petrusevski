package main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {
        
        Television Samsung = new Television();
        
        Samsung.setCurrentProgram(2);
        Samsung.setVolume(0);
        Samsung.setTurnOn(false);
        Samsung.printAttributes();
        
        Television Toshiba = new Television();
        
        Toshiba.setCurrentProgram(3);
        Toshiba.setVolume(4);
        Toshiba.setTurnOn(true);
        Toshiba.printAttributes();
        
        
        Radio Rock = new Radio();
        Rock.setFmFrequency(96.2);
        Rock.setAmFrequency(635);
        Rock.setBand('F');
        Rock.printAttributes();
        
              
    }
    
}
