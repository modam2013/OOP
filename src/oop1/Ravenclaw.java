package oop1;

public class Ravenclaw extends Hogwarts{
    private int smart;// умны
    private int wise;//мудры
    private int fullOfCreativity;//полны творчества
    public  Ravenclaw(String name, int conjure, int distance,int smart,int wise,int fullOfCreativity){
        super(name,conjure,distance);
        this.smart = smart;
        this.wise = wise;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Когтевран {" +
                " Имя =" + name +
                ", wise=" + wise +
                ", полны творчества =" + fullOfCreativity +
                ", ум ='" + smart + '\'' +
                ", колдовство =" + conjure +
                ", трангрессирование=" + distance +
                '}';
    }
    public int getpoint(){
        return smart+wise+fullOfCreativity+this.Sum() ;
    }
    public static Ravenclaw findBestFaculty(Ravenclaw[]studio){
        int g=0;
        for (int i = 1; i < studio.length; i++) {
            if (studio[g].getpoint()<studio[i].getpoint())
                g=i;
        }
        return studio[g];
    }
}
