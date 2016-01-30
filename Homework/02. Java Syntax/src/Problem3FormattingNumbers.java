import java.util.Scanner;

public class Problem3FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();
        String aHex = Integer.toHexString(a).toUpperCase();
        String aBinary =  String.format("%10s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.format("|%-10s|%10s|%10.2f|%-10.3f|", aHex, aBinary,b,c);



    }
}
