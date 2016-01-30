import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem13GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        fillingNumbers(input, numbers);
        String[] commands = input.nextLine().split(" ");
        executingCommand(commands, numbers);
    }
    private static void fillingNumbers(Scanner input, List<Integer> numbers) {
        String[] line = input.nextLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            numbers.add(Integer.parseInt(line[i]));
        }
    }
    private static void executingCommand(String[] commands, List<Integer> numbers){
        String evenOdd = commands[2];
        int amountOfNumbers = Integer.parseInt(commands[1]);
        switch (evenOdd){
            case "even": gettingFirstEvenNumbers(amountOfNumbers, numbers);
                break;
            case "odd": gettingFirstOddNumbers(amountOfNumbers, numbers);
                break;
        }
    }
    private static void gettingFirstOddNumbers(int amountOfNumbers, List<Integer> numbers){
        int counter = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i) % 2 == 1){
                System.out.print(numbers.get(i) + " ");
                counter++;
            }
            if (counter >= amountOfNumbers){
                break;
            }

        }
    }
    private static void gettingFirstEvenNumbers(int amountOfNumbers, List<Integer> numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0){
                System.out.print(numbers.get(i) + " ");
                counter++;
            }
            if (counter >= amountOfNumbers){
                break;
            }
        }
    }
}
