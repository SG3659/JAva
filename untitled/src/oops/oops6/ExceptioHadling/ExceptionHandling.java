package oops.oops6.ExceptioHadling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=2;
        int b=0;
        try{
//            divide(a,b);
            String name = "Sahil";
            if (name.equals("Sahil")) {
                throw new MyException("name is sahil");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("normal exception");
        }
        catch (Exception e){
            System.out.println("normal exception");
        }
        finally {
            System.out.println("this will always execute");
        }
    }
    // throws is basically just to declear exception
    // throw means throw an exception
    static int divide (int a, int b) throws ArithmeticException {
        if(b==0){
            throw new  ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
