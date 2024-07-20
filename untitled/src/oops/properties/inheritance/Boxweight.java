package oops.properties.inheritance;

public class Boxweight extends Box {
    double weight;
    public Boxweight( ){
        this.weight=-1;
    }
    /*Boxweight(Boxweight other){
        super (other);
        weight= other.weight;
    }*/
    Boxweight(double side , double weight){
        super(side);
        this.weight=weight;
    }
    public Boxweight(double l, double w , double h, double weight){
        super(l,w,h);// call the parent class constructor
        // used to initialize values present in parent class
        System.out.println(this.weight);// reffer to this class weight property
        // System.out.println(super.weight);// reffer to parent class property
        // System.out.println(super.l);
        this.weight=weight;

    }

    public Boxweight(Boxweight ob,double weight) {
        super(ob);
        this.weight = weight;
    }
}
