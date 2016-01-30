import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Problem7RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        List<Integer> randomNumb =  new ArrayList<>();
        Random randomGenerator = new Random();
        int minNumb = Math.min(n,m);
        int maxNumb = Math.max(n,m);
        for (int i = 0; i <= maxNumb - minNumb ; i++) {
            Integer randomNumber = randomGenerator.nextInt(maxNumb - minNumb + 1) + minNumb;
            while (randomNumb.contains(randomNumber)) {
                randomNumber = randomGenerator.nextInt(maxNumb - minNumb + 1) + minNumb;
            }
            randomNumb.add(randomNumber);
        }
        for (int i : randomNumb){
            System.out.format("%d ",i);
        }

    }
}
