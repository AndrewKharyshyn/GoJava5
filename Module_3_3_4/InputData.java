package Module_3_3_4;


import java.util.Scanner;
public class InputData {

    String nameInput(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please, input user name");
        String userName = sc3.nextLine();
        return userName;
    }

    String inputCompanyName(){
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Please, input your company name");
        String company = sc4.nextLine();
        return company;
    }

    int checkSumm () {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please, input withdrawal sum...");
        int summ = sc1.nextInt();
        if (summ <= 0) {
            System.out.println("You have entered incorrect sum! Please, try again...");
            checkSumm();
        }
        return summ;
    }

    int checkMonth () {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please, input work month number...");
        int mon = sc2.nextInt();
        if (mon <= 0) {
            System.out.println("You have entered incorrect month number! Please, try again...");
            checkMonth();
        }
        return mon;
    }
}

