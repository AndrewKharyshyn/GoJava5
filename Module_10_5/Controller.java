package Module_10_5;

import java.util.Scanner;

public class Controller {

    void cityCheck() throws InputLengthException, NoInputException, NotCorrectInputException {
        System.out.println("Here you input any city name");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        try {
            if (userInput.length() < 3) {
                throw new InputLengthException();
            }
            if (userInput.isEmpty()) {
                throw new NoInputException();
            }
            if (isDigit(userInput)) {
                throw new NotCorrectInputException();
            }
            System.out.println("If you are here, then no error occured!");

        } catch (InputLengthException | NoInputException | NotCorrectInputException e) {
            System.err.println("The entered city name is incorrect!" +
                    "\nPossible reasons:" +
                    "\n\t1. City length less than 3 symbols" +
                    "\n\t2. The entered name is blank" +
                    "\n\t3. City name starts with digit");
        }
    }

    private boolean isDigit(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
