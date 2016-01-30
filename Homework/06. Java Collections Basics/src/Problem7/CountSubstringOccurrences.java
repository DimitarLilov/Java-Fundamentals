package Problem7;


import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String subString = input.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i <= text.length() - subString.length() ; i++) {
            if (text.substring(i,subString.length() + i).equals(subString)){
                count++;
            }
        }
        System.out.print(count);
    }
}
