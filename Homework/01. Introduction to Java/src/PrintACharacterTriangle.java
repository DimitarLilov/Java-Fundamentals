import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int count = 0;
        for (int i = 0; i < n + n-1; i++) {
            if (i < n){
                count++;
            }else{
                count--;
            }
            for (int j = 0; j < count; j++) {

                System.out.print((char) (97 + j) +" ");

            }
            System.out.println();

        }
    }
}
