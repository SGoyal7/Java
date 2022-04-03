public class Sorted {
    public static void main(String[] args) {

    }
    static boolean sorted(int[] arr, int index) {
        if(index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
