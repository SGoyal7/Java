import java.util.Arrays;

public class SearchinString {
    
    public static void main(String[] args) {

        String name = "Shubham";
        char target = 'a';

        //System.out.println(Search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean Search(String str, char tar) {

        if(str.length() == 0) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if(tar == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean Search2(String str, char tar) {

        if(str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if(ch == tar) {
                return true;
            }
        }
        return false;
    }
}
