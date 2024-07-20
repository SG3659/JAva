package mathdsa;

public class oddeen {
    public static void main(String[] args) {
        int n=57;
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n) {
        return (n & 1) == 1;
    }
}
