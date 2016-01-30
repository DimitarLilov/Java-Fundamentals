import java.io.*;

public class Problem4CopyJpgFile {
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("resources/SoftUni.jpg");
                FileOutputStream fos = new FileOutputStream("resources/my-copied-picture.jpg")

        ) {
            int byteContainer;
            while((byteContainer = fis.read())!=-1)
            {
                fos.write(byteContainer);
            }
        } catch (IOException ioex) {
            System.err.println("File is not found!");
        }
    }
}
