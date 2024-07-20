package oops.oops2.singleton;

public class Singleton {
    static int num=10;
    private Singleton() {
         this.num=num;
    }
 private static Singleton instance;
 public  static Singleton getInstance(){
     // checkwhether 1 obj only is created or not
      if(instance ==null ){
          instance =new Singleton();
      }
      return instance;
 }

}
