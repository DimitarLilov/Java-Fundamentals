package Problem17;

import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] numbers = input.nextLine().split(" ");

        for(int num1 = 0;num1 < n;num1++){
            for(int num2 = 0;num2 < numbers.length;num2++){
                for(int num3 = 0;num3 < numbers.length;num3++){
                    for(int num4 = 0;num4 < numbers.length;num4++){
                        if( numbers[num1]!=numbers[num2]&&
                                numbers[num2]!=numbers[num3]&&
                                numbers[num3]!=numbers[num4]&&
                                numbers[num4]!=numbers[num1]&&
                                numbers[num1]!=numbers[num3]&&
                                numbers[num2]!=numbers[num4] ){

                            if((numbers[num1]+numbers[num2]).equals
                                    (numbers[num3]+numbers[num4])){
                                System.out.printf("%s|%s == %s|%s\n",
                                        numbers[num1],numbers[num2],
                                        numbers[num3],numbers[num4]);
                            }
                        }
                    }
                }
            }
        }
    }
}
