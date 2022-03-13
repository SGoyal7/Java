import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,6,7,8,9};
        ArrayList<Integer> ans = findAllIndex2(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
        //System.out.println(findAllIndex2(arr, 4, 0, new ArrayList<>()));
    }

    static boolean find(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    static ArrayList findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr, target, index+1, list);
    }


}
