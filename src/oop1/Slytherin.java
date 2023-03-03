package oop1;

public class Slytherin extends Hogwarts{
    private int cunning;// хитрость
    private int determination;//решительность
    private int ambition;// амбициозность
    private int resourcefulness;//находчивость
    private int  thirstForPower;//жажда власти

    public Slytherin(String name, int conjure, int distance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, conjure, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return " Слизерин {" +
                " Имя=" + name +
                ", решительность =" + determination +
                ", амбициозность =" + ambition +
                ", находчивость =" + resourcefulness +
                ", жажда власти =" + thirstForPower +
                ", хитрость ='" + cunning + '\'' +
                ", колдовство =" + conjure +
                ", трансгрессирование=" + distance +
                '}';
    }
    public int getpoint(){
        return cunning+determination+ambition+resourcefulness+thirstForPower+this.Sum() ;
    }
    public static Slytherin findBestFaculty(Slytherin[]studio){
        int g=0;
        for (int i = 1; i < studio.length; i++) {
            if (studio[g].getpoint()<studio[i].getpoint())
                g=i;
        }
        return studio[g];
    }
}
