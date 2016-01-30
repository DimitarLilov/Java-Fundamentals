import java.io.*;

public class Problem6SaveACustomObjectInAFile {
    public static void main(String[] args) {
        try(
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("resources/course.save"));
                ObjectInputStream objectInputStream = new ObjectInputStream(
                        new FileInputStream("resources/course.save"))
        ) {
            Course newCourse = new Course("Java Fundamentals",300);
            objectOutputStream.writeObject(newCourse);
            Course readerObject = (Course)objectInputStream.readObject();
            readerObject.printInfo();
        } catch (IOException ioex) {
            System.err.println("File is not found!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
