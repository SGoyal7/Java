public class BinarySearch {
    
    public static void main(String[] args) {
        int arr[] = {-5,-2,1,2,15,18,20,50};
        int ans = search(arr, 18);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]) {
                end = mid -1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
