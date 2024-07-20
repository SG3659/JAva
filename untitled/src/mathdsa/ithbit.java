package mathdsa;

public class ithbit {
    public static void main(String[] args) {
        int n=5;
        System.out.println(bit(n));
    }

    public static int bit(int n) {
        return (n &(1<<(n-1)));
    }
}
