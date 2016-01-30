package Problem4;

import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] line = input.nextLine().split(" ");
        int[] numbers = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        int maxLength = 1;
        int count = 1;
        int end =0;
        System.out.print(numbers[0] + " ");
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                count++;
                System.out.print(numbers[i] + " ");
            }else{
                count = 1;
                System.out.println();
                System.out.print(numbers[i] + " ");
            }
            if (count > maxLength){
                maxLength = count;
                end = i;
            }

        }
        System.out.println();
        System.out.print("Longest: ");
        for (int i = end - maxLength + 1; i <= end ; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
