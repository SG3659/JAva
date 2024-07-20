package oops.oops5abstarctclassesinterfaesannotations.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("electric engine start ");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stop ");
    }

    @Override
    public void acc() {
        System.out.println("0 to 60 in 3 sec ");
    }
}
