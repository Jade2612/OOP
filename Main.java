import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String blowup(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length();i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                if (i < str.length() - 1) {
                    int loop = ch - '0';
                    for (int j = 0; j < loop;j++) {
                        res.append(str.charAt(i+1));
                    }
                }
            }
            else if (Character.isLetter(ch)) {
                res.append(ch);
            }
        }
        return res.toString();
    }

    static int maxRun(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int res = 1; int track = 1;
        for (int i = 1; i < str.length();i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                ++track;
                res = Math.max(res, track);
            }
            else {
                track = 1;
            }
        }
        return res;
    }

    static boolean stringIntersect(String a, String b, int len) {
        if (len > a.length() || len > b.length()) {
            return false;
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= a.length() - len;i++) {
            set.add(a.substring(i, i + len));
        }
        for (int i = 0; i <= b.length() - len;i++) {
            if (set.contains(b.substring(i, i + len))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String test = new String("6y");
        System.out.println(blowup(test));
        String test2 = new String("uuuuuuuu");
        System.out.println(maxRun(test2));
        System.out.println(stringIntersect("abcdef","def",4));
    }

}