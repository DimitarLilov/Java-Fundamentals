package Problem6;


import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine().toUpperCase();
        String[] text = inputText.split("\\W+");
        String target = input.nextLine().toUpperCase();
        int count = 0;
        for (int i = 0; i < text.length ; i++) {
            if (target.equals(text[i])){
                count++;
            }
        }
        System.out.print(count);
    }
}
