import java.util.Arrays;

public class Swap {
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9,18};
        swap(arr, 0, 4);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
