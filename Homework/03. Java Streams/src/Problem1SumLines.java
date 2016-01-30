import java.io.*;

public class Problem1SumLines {

    public static void main(String[] args) {
        try(
                BufferedReader fileReader = new BufferedReader(
                        new FileReader("resources/lines.txt"))
        ) {
            while (true) {
                String line = fileReader.readLine();
                if (line == null) break;
                char[] charLine = line.toCharArray();
                int sumLine =0;
                for (int i = 0; i < charLine.length; i++) {
                    sumLine += charLine[i];
                }
                System.out.println(sumLine);
            }
            } catch (IOException ioex) {
                System.err.println("File is not found!");
            }

        }
}
