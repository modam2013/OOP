package oop1;

public class Gryffindor extends Hogwarts {
    private int nobility;//благородство
    private int honor;//честь
    private int bravery;//храбрость

    public Gryffindor(String name, int conjure, int distance, int nobility, int honor, int bravery) {
        super(name, conjure, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return " Гриффиндор{" +
                " Имя  =" +name +
                ", честь =" + honor +
                ", храброст =" + bravery +
                ", благородство ='" +  nobility + '\'' +
                ", колдовство =" + conjure +
                ", трансгрессия =" + distance +
                '}';
    }
    public int getpoint(){
        return nobility +honor+bravery+this.Sum();
    }
    public static Gryffindor  findBestFaculty(Gryffindor[]studio){
        int g=0;
        for (int i = 1; i < studio.length; i++) {
            if (studio[g].getpoint()<studio[i].getpoint())
                 g=i;
        }
        return studio[g];
    }
}