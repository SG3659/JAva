package recursion;

public class ddecreasing {
    public static void main(String[] args) {
      decreasing(5);
    }
    public static void decreasing(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }
}
