package Module_10_1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception{
        System.out.println("To try the Exception generation, enter any digit here:");
        try {
            Scanner scanner = new Scanner(System.in);
            int testInt = scanner.nextInt();
            String errMessage = "You have entered the incorrect number";
            if (testInt != 1000010) {
                throw new Exception(errMessage);
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.err.println("You are now inside 'Finally' block.");
        }
    }
}

