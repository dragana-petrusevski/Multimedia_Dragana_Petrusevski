
package media;

public class Television {
    
    private int volume;
    private int currentProgram = 1;
    private boolean turnOn;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }


    public void printAttributes() {
        
        if (this.isTurnOn()) {
            System.out.println("Televizor je ukljucen");
            System.out.println("Trenutni program je: " + this.getCurrentProgram());
            System.out.println("Trenutna jacina tona:" + this.getVolume()); 
        } else {
            System.out.println("Televizor je iskljucen");
        }
        System.out.println();
    }
    

    

}
    