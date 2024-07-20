package pepcoding.array;

public class barchart {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 4};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int floor = max; floor >=1; floor--) {// floor
            for (int i = 0; i < arr.length; i++) {// building floor [array]
                if (arr[i] >= floor) {
                    System.out.print("* \t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
