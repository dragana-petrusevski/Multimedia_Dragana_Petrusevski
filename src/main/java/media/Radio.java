
package media;


public class Radio {
    private double fmFrequency;
    private int amFrequency;
    private char band; 

    public double getFmFrequency() {
        return fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public int getAmFrequency() {
        return amFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }

    public char getBand() {
        return band;
    }

    public void setBand(char band) {
        this.band = band;
    }
    
    public void printAttributes() {
        System.out.println("FM Frequency is: " + this.getFmFrequency());
        System.out.println("AM Frequency is: " + this.getAmFrequency());
        System.out.println("Band is: " + this.getBand());
    }
    
    
}
