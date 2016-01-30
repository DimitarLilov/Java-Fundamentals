import java.util.Scanner;

public class Problem6ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numb = input.next();
        System.out.println(Long.valueOf(numb, 7));
    }
}
