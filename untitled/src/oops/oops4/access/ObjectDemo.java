package oops.oops4.access;

public class ObjectDemo {
// we already covered this in previous lecture
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();// gets call when garbage collector hits
    }
    int num;
    float gpa;
    public ObjectDemo(int num,float gpa ) {
        this.num = num;
        this.gpa=gpa;
    }

    @Override
    public int hashCode() {// a number representation of an object
        //return super.hashCode();
        return num;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo a= new ObjectDemo(12,75.5f);
        ObjectDemo b= new ObjectDemo(12,80.5f);
//        System.out.println(a.hashCode());
        if(a==b){// check weather they pointing to same
            System.out.println("a is equal to b");
        }else {
            System.out.println("no");
        }

        if(a.equals(b)){// check content of it
            System.out.println("a is equal to b");
        }else {
            System.out.println("no");
        }

    }
}
