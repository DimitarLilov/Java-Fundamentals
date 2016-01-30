import java.util.Scanner;

public class Problem12CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstString = input.next();
        String secondString = input.next();
        Long totalSumChar = multiplyingChar(firstString, secondString);
        System.out.print(totalSumChar);
    }

    private static Long calculatingRemainder(String firstString, String secondString) {
        Long totalSumRemainder= 0L;
        if (firstString.length() > secondString.length()){
                String remainder = firstString.substring(secondString.length());
                for (int i = 0; i < remainder.length(); i++) {
                    totalSumRemainder += remainder.charAt(i);
                }
            } else if (secondString.length() > firstString.length()){
                String remainder = secondString.substring(firstString.length());
                for (int i = 0; i < remainder.length(); i++) {
                    totalSumRemainder += remainder.charAt(i);
                }
            }
        return totalSumRemainder;
    }

    private static Long multiplyingChar(String firstString, String secondString) {
        Long totalSum =0l;
        for (int i = 0; i < firstString.length(); i++) {
            totalSum += firstString.charAt(i) * secondString.charAt(i);
        }
        totalSum += calculatingRemainder(firstString,secondString);
        return totalSum;
    }
}
