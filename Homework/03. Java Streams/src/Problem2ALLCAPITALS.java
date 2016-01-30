import java.io.*;

public class Problem2ALLCAPITALS {
    public static void main(String[] args) {
        StringBuilder lineUpper = new StringBuilder();
        try(
                BufferedReader fileReader =
                        new BufferedReader(
                                new FileReader("resources/lines.txt"))

        ) {
            String line;
            while ((line = fileReader.readLine()) != null) {
               lineUpper.append(line.toUpperCase() + "\n");
            }

        } catch (IOException ioex) {
            System.err.println("File is not found!");
        }
        try(
                PrintWriter printWriter =
                        new PrintWriter(
                                new BufferedWriter(
                                        new FileWriter("resources/lines.txt")))


        ) {
            printWriter.write(lineUpper.toString());
        } catch (IOException ioex) {
            System.err.println("File is not found!");
        }

        System.out.println(lineUpper);
    }
}

