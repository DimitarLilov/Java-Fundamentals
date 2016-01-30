import java.io.*;

public class Problem3CountCharacterTypes {
    public static void main(String[] args) {
        String vowelsSymbol = "aeiou";
        String punctionSymbol = "!.,?";
        Integer counterConsonants =0;
        Integer counterVowels = 0;
        Integer counterPunction = 0;
        try(
                BufferedReader fileReader =
                        new BufferedReader(
                                new FileReader("resources/words.txt"));
                BufferedWriter fileWriter =
                        new BufferedWriter(
                                        new FileWriter("resources/count-chars.txt"))

        ) {
            int symbol;
            while ((symbol = fileReader.read()) != -1) {
                char ch = (char)symbol;
                if (vowelsSymbol.contains(ch+"")){
                    counterVowels++;
                } else if (punctionSymbol.contains(ch+"")){
                    counterPunction++;
                }else if (Character.isLetter(ch)){
                    counterConsonants++;
                }
            }
            fileWriter.write(String.format("Vowels: %d%n",counterVowels));
            fileWriter.write(String.format("Consonants: %d%n",counterConsonants));
            fileWriter.write(String.format("Punctuation: %d%n",counterPunction));

        } catch (IOException ioex) {
            System.err.println("File is not found!");
        }
    }
}
