import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            String in = scan.nextLine();
            if (in.isEmpty()) {
                break;
            }
            ++cnt;
        }
        System.out.println(cnt);
    }
}
