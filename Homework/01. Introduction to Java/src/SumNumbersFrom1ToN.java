import java.util.Scanner;

public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        int sum =0;
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i <= n; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
