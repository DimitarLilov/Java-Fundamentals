import java.io.*;
import java.util.ArrayList;

public class Problem5SaveAnArrayListOfDoubles {
    public static void main(String[] args) {
        try(
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("resources/doubles.list"))

        ) {
            ArrayList<Double> doubles = new ArrayList<>();
            doubles.add(41.1);
            doubles.add(3.14);
            doubles.add(6.17);
            doubles.add(1.1);
            doubles.add(7.3);
            objectOutputStream.writeObject(doubles);
        } catch (IOException ioex) {
            System.err.println("File is not found!");
        }
        try(
                ObjectInputStream objectInputStream = new ObjectInputStream(
                        new FileInputStream("resources/doubles.list"))


        ) {
            System.out.println(objectInputStream.readObject());
        } catch (IOException ioex) {
            System.err.println("File is not found!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
