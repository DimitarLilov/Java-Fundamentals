import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem11StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Pattern regex = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b|\\b[A-Z]\\b");
        Matcher match = regex.matcher(line);

        while (match.find()){
            System.out.print(match.group(0) + " ");
        }
    }
}
