import java.math.BigDecimal;
import java.util.Scanner;

public class Problem5ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long numb = input.nextLong();
        System.out.println(Long.toString(numb, 7));

    }
}
