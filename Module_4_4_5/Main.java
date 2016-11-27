package Module_4_4_5;

import Module_4_4_1.ChinaBank;
import Module_4_4_1.EUBank;
import Module_4_4_1.USBank;
import Module_4_4_2.Currency;
import Module_4_4_3.User;
import Module_4_4_4.BankSystem;
import Module_4_4_4.BankSystemImpl;


public class Main {
    public static void main(String[] args) {
        USBank usBank1 = new USBank(1, "USA", 2541, 550, 25, 9580000, Currency.USD);
        USBank usBank2 = new USBank(1, "USA", 2541, 550, 25, 9580000, Currency.EUR);
        EUBank euBank1 = new EUBank(2, "Germany", 1800, 380, 10, 7000000, Currency.USD);
        EUBank euBank2 = new EUBank(2, "Germany", 1800, 380, 10, 7000000, Currency.EUR);
        ChinaBank chinaBank1 = new ChinaBank(3, "China", 7200, 1250, 12, 12540000, Currency.USD);
        ChinaBank chinaBank2 = new ChinaBank(3, "China", 7200, 1250, 12, 12540000, Currency.EUR);
        User user1 = new User(1, "Svitlana", 1550, 7, "Formag Forwarding", 550, usBank1);
        User user2 = new User(2, "Andriy", 2800, 3, "DEPS Ukraine", 850, usBank2);
        User user3 = new User(3, "Alex", 7200, 2, "MSI", 200, euBank1);
        User user4 = new User(4, "Iryna", 2500, 4, "Focus", 400, euBank2);
        User user5 = new User(5, "Igor", 1470, 14, "Everest", 480, chinaBank1);
        User user6 = new User(6, "Sergei", 2100, 1, "P&G", 1100, chinaBank2);
        BankSystem bankSystem = new BankSystemImpl();


        System.out.println("User 1 Data:");
        bankSystem.transferMoney(user1, user6, 150);
        bankSystem.fundUser(user1, 2890);
        bankSystem.paySalary(user1);
        bankSystem.withdrawOfUser(user1, 20);
        System.out.println();

        System.out.println("User 2 Data:");
        bankSystem.transferMoney(user2, user5, 3500);
        bankSystem.fundUser(user2, 4200);
        bankSystem.paySalary(user2);
        bankSystem.withdrawOfUser(user2, 2450);
        System.out.println();

        System.out.println("User 3 Data:");
        bankSystem.transferMoney(user3, user1, 1520);
        bankSystem.fundUser(user3, 250);
        bankSystem.paySalary(user3);
        bankSystem.withdrawOfUser(user3, 13280);
        System.out.println();

        System.out.println("User 4 Data:");
        bankSystem.transferMoney(user4, user2, 258);
        bankSystem.fundUser(user4, 9870);
        bankSystem.paySalary(user4);
        bankSystem.withdrawOfUser(user4, 5500);
        System.out.println();

        System.out.println("User 5 Data:");
        bankSystem.transferMoney(user5, user3, 750);
        bankSystem.fundUser(user5, 1200);
        bankSystem.paySalary(user5);
        bankSystem.withdrawOfUser(user5, 800);
        System.out.println();

        System.out.println("User 6 Data:");
        bankSystem.transferMoney(user6, user1, 100);
        bankSystem.fundUser(user6, 5400);
        bankSystem.paySalary(user6);
        bankSystem.withdrawOfUser(user6, 50000);
        System.out.println();
    }
}
