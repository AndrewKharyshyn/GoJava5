package Module_10_2;

import java.util.Scanner;

public class MainMethod {


    public static void main(String[] args) throws StartsWithException {
        System.out.println("Enter ANY city name to check how Exception works:");

        try {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            startsWithL(userInput);
        } catch (StartsWithException e) {
            System.err.println(e.getErrMessage());
        }
    }

    public  static boolean startsWithL (String string)throws StartsWithException{
        boolean startsWithL = false;
        if (!string.startsWith("L")) {
            throw new StartsWithException("Missed! city name must begin with 'L'!");
        }
        if (string.startsWith("L")) {
            System.out.println("Guessed! You have entered correct city name!");
        }
        return startsWithL;
    }

}
