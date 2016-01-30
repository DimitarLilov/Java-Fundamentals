package Problem16;


import java.util.Scanner;

public class CalculateN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long factorial = calculateFactorial(num);
        System.out.println(factorial);
    }

    private static long calculateFactorial(long num) {
        if(num == 1 || num == 0) {
            return 1;
        }

        return num * calculateFactorial(num - 1);
    }
}
