import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer number = console.nextInt();

        String numberString = number.toString();
        StringBuilder ghettoNumber = new StringBuilder();
        for (int i = 0; i <numberString.length() ; i++) {
            ghettoNumber.append(convertDigitToGhetto(numberString.charAt(i)));
        }
        System.out.println(ghettoNumber.toString());
    }

    private static String convertDigitToGhetto(char input) {
        String ghettoDigit = " ";
        switch (input){
            case '0': ghettoDigit = "Gee";
                break;
            case '1': ghettoDigit = "Bro";
                break;
            case '2': ghettoDigit = "Zuz";
                break;
            case '3': ghettoDigit = "Ma";
                break;
            case '4': ghettoDigit = "Duh";
                break;
            case '5': ghettoDigit = "Yo";
                break;
            case '6': ghettoDigit = "Dis";
                break;
            case '7': ghettoDigit = "Hood";
                break;
            case '8': ghettoDigit = "Jam";
                break;
            case '9': ghettoDigit = "Mack";
                break;

        }
        return ghettoDigit;
    }
}
