package oop2;

public class Car extends Transport implements Checkable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        System.out.println("Проверяем двигатель");
    }
}
