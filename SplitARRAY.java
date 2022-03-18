public class SplitARRAY {
    public static void main(String[] args) {

    }
    public int splitarray(int[] nums, int m) {
        int start = 0, end = 0;

        for(int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //binary search
        while(start < end) {
            //try for the middle as potential answer
            int mid = start + (end - start)/2;

            //calculate how many peices you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int n : nums) {
                if(sum+ n > mid) {
                    //you cannot add in this subarray, make new one
                    //say you add this n in new subarray, then sum = num
                    sum = n;
                    pieces++;
                }
                else {
                    sum += n;
                }
            }

            if(pieces > m) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
    }
}
