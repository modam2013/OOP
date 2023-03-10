package oop1;

public class Hufflepuff extends Hogwarts{
    private int hardworking;//трудолюбивы
    private int loyal;//верны
    private int honest;//честны
    public  Hufflepuff(String name, int conjure, int distance, int hardworking,int loyal, int honest){
        super(name,conjure,distance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return " Пуффендуй {" +
                " Имя =" + name +
                ", верность =" + loyal +
                ", честность =" + honest +
                ", трудолюбие ='" + hardworking + '\'' +
                ", колдовство =" + conjure +
                ", трансгрессирование =" + distance +
                '}';
    }
    public int getpoint(){
        return hardworking+loyal+honest+this.Sum() ;
    }
    public static Hufflepuff  findBestFaculty(Hufflepuff[]studio){
        int g=0;
        for (int i = 1; i < studio.length; i++) {
            if (studio[g].getpoint()<studio[i].getpoint())
                g=i;
        }
        return studio[g];
    }
}
