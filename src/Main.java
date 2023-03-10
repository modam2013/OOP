import oop1.*;



public class Main {

    public static void main(String[] args) {
        System.out.println("");

        Gryffindor[] students = {
                new Gryffindor("Гарри Поттер", 4, 5, 10, 10, 15),
                new Gryffindor(" Гермиона Грейнджер", 10, 9, 5, 10, 20),
                new Gryffindor("Рон Уизли", 2, 5, 5, 10, 5),
        };

        for (int i = 0; i < students.length; i++) {
            Gryffindor gryffindor = students[i];
             System.out.print(gryffindor.getName() + "( Колдовство " + gryffindor.getConjure() + " баллов, " + "Трангрессирование " + gryffindor.getDistance() + " баллов,  " +
                  " благородство " + gryffindor.getNobility() + " баллов, " + " честь" + gryffindor.getHonor() + " баллов, " + "храбрость " + gryffindor.getBravery() + " баллов)"+" сумма баллов " + gryffindor.getpoint() );
             System.out.println("");
        }
        System.out.println("");
        System.out.println( " лучший ученик  :" + Gryffindor.findBestFaculty(students));
        System.out.println("");

        Hufflepuff[]students1={
                new Hufflepuff(" Захария Смит",4,5,6,10,9),
                new Hufflepuff("Седрик Диггори",5,5,10,10,10),
                new Hufflepuff(" Джастин Финч-Флетчли",5,5,5,5,5),
        };
        for (int i = 0; i < students1.length; i++) {
            Hufflepuff hufflepuff = students1[i];
            System.out.print(hufflepuff.getName() + "( Колдовство " + hufflepuff.getConjure() + " баллов, " + "Трангрессирование " + hufflepuff.getDistance() + " баллов,  " +
                    " благородство " + hufflepuff.getHardworking() + " баллов, " + " честь" + hufflepuff.getLoyal() + " баллов, " +
                    "храбрость " + hufflepuff.getHonest() + " баллов)"+ hufflepuff.getpoint());
            System.out.println("");
        }
        System.out.println("");
        System.out.println( " лучший ученик :" + Hogwarts.findBestFaculty(students1));
        System.out.println("");
        Ravenclaw[]students2={
                new Ravenclaw(" Чжоу Чанг",5,6,8,10,5),
                new Ravenclaw(" Падма Патил ",5,6,4,5,8),
                new Ravenclaw("Маркус Белби",5,4,5,8,5),
        };
        for (int i = 0; i < students2.length; i++) {
            Ravenclaw ravenclaw = students2[i];
            System.out.print(ravenclaw.getName() + "( Колдовство " + ravenclaw.getConjure() + " баллов, " + "Трангрессирование " + ravenclaw.getDistance() + " баллов,  " +
                    " УМ " + ravenclaw.getSmart() + " баллов, " + " мудрость " + ravenclaw.getWise() + " баллов, " +
                    " творчество  " + ravenclaw.getFullOfCreativity() + " баллов )"+ ravenclaw.getpoint());
            System.out.println("");
        }
        System.out.println("");
        System.out.println( " лучший ученик  :" + Hogwarts.findBestFaculty(students1));
        System.out.println("");
        Slytherin[]students3={
                new Slytherin("Драко Малфой",5,8,10,9,15,10,10),
                new Slytherin("Грэхэм Монтегю",3,2,5,3,5,2,2),
                new Slytherin("Грегори Гойл ",3,3,3,3,3,3,3),
        };
        for (int i = 0; i < students3.length; i++) {
            Slytherin slytherin = students3[i];
            System.out.print(slytherin.getName() + "( Колдовство " + slytherin.getConjure() + " баллов, " + "Трангрессирование " + slytherin.getDistance() + " баллов,  " +
                    " хитрость " + slytherin.getCunning()+ " баллов, " + " решительность  " + slytherin.getDetermination() + " баллов, " +
                    " амбициозность " + slytherin.getAmbition() + " баллов"+ " находчивость "+ slytherin.getResourcefulness()+" баллов "+ " жажда власти "+ slytherin.getThirstForPower()+ " баллов )"+ slytherin.getpoint());
            System.out.println("");
        }
        System.out.println( " лучший ученик  :" + Gryffindor.findBestFaculty(students));


    }




}