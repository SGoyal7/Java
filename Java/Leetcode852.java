public class Leetcode852 {
    
    public static void main(String[] args) {

    }

    public int MountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]) {
                //you are in the decreasing part of the array
                //this may be the answeer but look at left
                //so end != mid-1
                end = mid;
            }
            else {
                //in the ascending part of the array
                start = mid + 1;
                //we know mid+1 > mid element
            }

            //in the end, start = end and pointing to the largest number
            //start and end are always trying to find the max element in the above 2 checks
            //at every point of time for start and end, they have the best possible answer till that time
            
        }
        return start; //or return end;
    }
}
