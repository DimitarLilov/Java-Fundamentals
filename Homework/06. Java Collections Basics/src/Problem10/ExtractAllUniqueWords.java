package Problem10;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String[] textArr = text.split("\\W+");
        Arrays.sort(textArr);
        Set<String> extractTxt = new TreeSet<>();
        for (int i = 0; i < textArr.length; i++) {
            extractTxt.add(textArr[i]);
        }
        extractTxt.stream().forEach(x -> System.out.print(x + " "));
    }
}
