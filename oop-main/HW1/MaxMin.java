import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int mini =  Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.isEmpty()) {
                break;
            }
            String[] parts = str.trim().split("\\s+");
            for (String part : parts) {
                int n = Integer.parseInt(part);
                if (n < mini) mini = n;
                if (n > maxi) maxi = n;
            }
        }
        System.out.println(mini);
        System.out.println(maxi);
    }
}
