import java.util.Scanner;

public class Problem4CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double aPow = Math.pow(a, 2);
        double bPow = Math.pow(b, 2);
        double cPow = Math.pow(c,3);
        double firstFormulaResult  = Math.pow(((aPow + bPow) /(aPow - bPow)),((a + b + c ) /Math.sqrt(c)));
        double secondFormulaResult = Math.pow(((aPow+bPow)-cPow),(a-b));
        double averageOfNumbers = (a + b +c)/3.0;
        double averageOfFormulasResults = (firstFormulaResult  + secondFormulaResult) /2.0;
        double diff = Math.abs(averageOfNumbers - averageOfFormulasResults);
        System.out.format("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",firstFormulaResult ,secondFormulaResult,diff);
    }
}
