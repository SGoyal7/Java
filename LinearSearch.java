public class LinearSearch {
    
    public static void main(String[] args) {

        int[] nums = {23,45,1,2,8,19,-1,-19,8,-5};
        int target = 19;
        int ans = LSearch(nums, target);
        System.out.println(ans);
    }
    //search in the array: return the index if  item found
    //otherwise return -1

    static int LSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int index = 0; index < arr.length; index++) {
            if(arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
