import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double firstNumber = console.nextDouble();
        Double secondNumber = console.nextDouble();
        Double threeNumber = console.nextDouble();
        Double average = average(firstNumber,secondNumber,threeNumber);
        System.out.format("%.2f",average);
    }
    public  static Double average(Double firstNumber, Double secondNumber, Double threeNumber){
        Double sum = firstNumber + secondNumber + threeNumber;
        Double average = sum / 3;
        return average;
    }
}
