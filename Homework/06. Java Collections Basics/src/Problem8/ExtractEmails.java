package Problem8;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Pattern emailPattern = Pattern.compile("(\\w+\\d*\\.*\\-*\\_*)+\\@+(\\w+\\.+\\w+\\.*\\w*)+");
        Matcher matcher = emailPattern.matcher(text);
        while (matcher.find()){
            System.out.print(matcher.group());
            System.out.println();
        }
    }
}
