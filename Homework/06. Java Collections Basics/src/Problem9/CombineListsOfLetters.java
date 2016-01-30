package Problem9;

import sun.rmi.transport.proxy.CGIHandler;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] text = input.nextLine().replace(" ", "").toCharArray();
        char[] addText = input.nextLine().replace(" ", "").toCharArray();

        ArrayList<Character> textList = new ArrayList<>();
        ArrayList<Character> addTextList = new ArrayList<>();
        for (Character letter : text){
            textList.add(letter);
            addTextList.add(letter);
        }
        for (Character letter : addText){
            if (!addTextList.contains(letter)){
                textList.add(letter);
            }
        }
        for (Character letter : textList){
            System.out.print(letter + " ");
        }

    }
}
