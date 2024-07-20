package oops.oops5abstarctclassesinterfaesannotations.interfaces;

public class main {
    public static void main(String[] args) {
//        Car bmw =new Car();
//        bmw.acc();
//        bmw.start();
//        Media bmw =new Car();
//        bmw.stop();
        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
