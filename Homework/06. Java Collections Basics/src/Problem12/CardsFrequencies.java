package Problem12;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputCards = input.nextLine().split("\\W+");
        LinkedHashMap<String, Integer> cards = new LinkedHashMap<>();
        int totalCount = 0;
        for (String card : inputCards){
            Integer count = cards.get(card);
            if (count == null){
                count=0;
            }
            cards.put(card, count+1);
            totalCount++;
        }
        for (Map.Entry<String , Integer> entry: cards.entrySet()){
            double percentage = ((double)entry.getValue()/(double)totalCount) * 100;
            System.out.format("%s -> %.2f\n",entry.getKey(),percentage);
        }
    }
}
