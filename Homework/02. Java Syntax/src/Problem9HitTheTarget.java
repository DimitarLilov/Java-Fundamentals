import java.util.Scanner;

public class Problem9HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte target = input.nextByte();
        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j < 20; j++) {
                if (i + j == target){
                    System.out.format("%s + %s = %s", i, j, target);
                    System.out.println();
                }
                if (i - j == target){
                    System.out.format("%s - %s = %s", i, j, target);
                    System.out.println();
                }
            }
        }
    }
}
