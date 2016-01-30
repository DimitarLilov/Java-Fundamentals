import java.util.Scanner;

public class Problem2TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float xA = input.nextFloat();
        float yA = input.nextFloat();
        float xB = input.nextFloat();
        float yB = input.nextFloat();
        float xC = input.nextFloat();
        float yC = input.nextFloat();
        float area =  Math.abs((xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2);
        System.out.format("%d",(int)area);
    }
}
