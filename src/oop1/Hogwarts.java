package oop1;

public class Hogwarts {
     String name;//имя ученика
     int conjure; // колдовать
     int distance; // трансгрессировать

    public Hogwarts(String name, int conjure, int distance) {
        this.name = name;
        this.conjure = conjure;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }



    @Override
    public String toString() {
        return "Hogwarts{" +
                "Имя'" + name + '\'' +
                ", колдовство =" + conjure +
                ", трансгрессирование =" + distance +
                '}';
    }
    public int Sum(){
        return conjure+distance;
    }

    public static Hogwarts  findBestFaculty(Hogwarts[]studio){
        int g=0;
        for (int i = 1; i < studio.length; i++) {
            if (studio[g].Sum()<studio[i].Sum())
                g=i;
        }
        return studio[g];
    }

}


