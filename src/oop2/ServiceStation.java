package oop2;

public class ServiceStation {
    private void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
        }
    }
    public void check(Bicycle bicycle){
        checkTransport(bicycle);
    }
    public void check(Car car){
        checkTransport(car);
        car.check();
    }
    public void check(Truck truck){
        checkTransport(truck);
        truck.check();

    }
}
