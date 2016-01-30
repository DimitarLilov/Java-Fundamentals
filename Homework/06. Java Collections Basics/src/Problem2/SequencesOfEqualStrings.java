package Problem2;

import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] line = input.nextLine().split(" ");
        for (int i = 0; i < line.length -1; i++) {
            if (line[i].equals(line[i+1])){
                System.out.print(line[i] + " ");
            } else{
                System.out.println(line[i]);
            }
            if (i == line.length -2){
                System.out.print(line[i + 1]);
            }
        }
        if (line.length == 1){
            System.out.println(line[0]);
        }
    }
}
