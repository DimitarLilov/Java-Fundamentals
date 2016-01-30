package Problem3;

import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] line = input.nextLine().split(" ");
        int count = 1;
        int maxCount = 1;
        int index = 0;
        for (int i = 0; i < line.length - 1; i++) {
            if (line[i].equals(line[i + 1])){
                count++;
            }else{
                count=1;
            }
            if (count > maxCount){
                maxCount = count;
                index = i;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(line[index] + " ");
        }
    }
}
