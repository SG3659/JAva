package oops.oops5abstarctclassesinterfaesannotations.interfaces;

public class Car implements Engine, Brake,Media{
    @Override
    public void start() {
        System.out.println("voice control start ");
    }

    @Override
    public void stop() {
        System.out.println("Engine shut down in 5min   ");
    }

    @Override
    public void acc() {
        System.out.println("0to 100 in 3sec");
    }

    @Override
    public void brake() {
        System.out.println("Abs braking");
    }
}
