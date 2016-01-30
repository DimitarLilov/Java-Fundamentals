package Problem14;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(input.nextLine().split(" ")));
        String sortType = input.nextLine();

        if(sortType.equals("Ascending")) {
            nums.stream()
                    .map(s -> Integer.parseInt(s))
                    .sorted((num1, num2) -> num1.compareTo(num2))
                    .forEach(num -> System.out.print(num + " "));
        } else {
            nums.stream()
                    .map(s -> Integer.parseInt(s))
                    .sorted((num1, num2) -> num2.compareTo(num1))
                    .forEach(num -> System.out.print(num + " "));
        }
    }
}
