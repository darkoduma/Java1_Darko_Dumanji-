package media;

public class Radio {

    private double fmFrequency;
    private double amFrequency;
    private char band;

    public double getFmFrequency() {
        return this.fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public double getAmFrequency() {
        return this.amFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;

    }

    public char getBand() {
        return this.band;

    }

    public void setBand(char band) {
        this.band = band;

    }

    public Radio() {
        this.fmFrequency = 106.8;
        this.amFrequency = 600;
        this.band = 'D';

    }

    public void printAtributes() {
        System.out.println("FM Frekvencija je: " + this.fmFrequency);
        System.out.println("AM Frekvencija je: " + this.amFrequency);
        System.out.println("Band je: " + band);
        System.out.println("");
    }

    public void showData() {
        System.out.println("FM Frekvencija je: " + this.fmFrequency);
        System.out.println("AM Frekvencija je: " + this.amFrequency);
        System.out.println("Band je: " + band);
        System.out.println("");

    }

}
