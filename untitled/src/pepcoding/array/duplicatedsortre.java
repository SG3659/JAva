package pepcoding.array;

public class duplicatedsortre {
    public static int main(String[] args) {
        int[] arr ={112};
        int j=1;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]!=arr[i-1])
                {
                      arr[j]=arr[i];
                      j++;
            }
        }
        return j;
    }
}
