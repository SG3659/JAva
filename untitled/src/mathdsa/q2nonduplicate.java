package mathdsa;

public class q2nonduplicate {
    public static void main(String[] args) {
        int [] arr={2,3,4,1,2,1,3,6,4};
        System.out.println(nondupli(arr));
    }

    public static int nondupli(int[]arr) {
        int unique=0;
        for (int i:arr) {
        unique^=i;
        }
        return unique;
    }
}
