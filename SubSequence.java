import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        //subseq("", "abc");
        //System.out.println(subseqlist("", "abc"));
        //subseqAscii("", "abc");
        System.out.println(subseqlistAscii("", "abc"));
    }

    static void subseq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqlist(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqlist(p+ch, up.substring(1));
        ArrayList<String> right = subseqlist(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> subseqlistAscii(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subseqlistAscii(p+ch, up.substring(1));
        ArrayList<String> second = subseqlistAscii(p, up.substring(1));
        ArrayList<String> third = subseqlistAscii(p +(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
