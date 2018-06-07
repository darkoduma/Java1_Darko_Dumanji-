package media;

public class Television {

    private int volume = 0;
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
    
    public boolean getTornOn() {
        return turnOn;
        
    }
    
    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
        
    }
    
    
    public Television(){
        this.volume = 3;
        this.currentProgram = 1;
        this.turnOn = Boolean.FALSE;
        
    }
    
    public Television(int volume, int currentProgram, boolean turnOn){
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = Boolean.TRUE;
        
    }
    
    public void showData(){
        System.out.println("Jacina tona je: " + this.volume);
        System.out.println("TV kanal je: " + this.currentProgram);
        System.out.println("TV je ukljucen: " + this.turnOn);
        
    }
    

}
