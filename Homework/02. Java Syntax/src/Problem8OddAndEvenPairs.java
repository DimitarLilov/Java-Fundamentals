import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String[] numbersInput = input.nextLine().split(" ");
        for (int i = 0; i < numbersInput.length; i++) {
            numbers.add(Integer.parseInt(numbersInput[i]));

        }
        if (numbers.size()%2 ==1){
            System.out.println("Invalid length");
            System.exit(0);
        }
        for (int i = 0; i < numbers.size(); i+=2) {
            boolean isEven = false;
            boolean isOdd = false;
            int firstNumb = numbers.get(i);
            int secondNumb = numbers.get(i + 1);
            if (firstNumb %2 == 0 && secondNumb % 2 ==0){
                isEven = true;
            } else if (firstNumb % 2 == 1 && secondNumb % 2 == 1){
                isOdd = true;
            }
            System.out.printf("%s, %s -> ", firstNumb, secondNumb);
            if (isEven){
                System.out.println("both are even");
            } else if (isOdd){
                System.out.println("both are odd");
            } else {
                System.out.println("different");
            }
        }
    }
}
