package Module_4_4_5;

import Module_4_4_1.ChinaBank;
import Module_4_4_1.EUBank;
import Module_4_4_1.USBank;
import Module_4_4_2.Currency;
import Module_4_4_3.User;
import Module_4_4_4.BankSystemImpl;


public class Main {
    public static void main(String[] args) {
        USBank usBank1 = new USBank(1,"USA", 2541,550,25,9580000,Currency.USD);
        USBank usBank2 = new USBank(1,"USA", 2541,550,25,9580000,0,Currency.EUR, 0,0,0,0);
        EUBank euBank1 = new EUBank(2,"Germany", 1800,380,10,7000000,0,Currency.USD, 0,0,0,0);
        EUBank euBank2 = new EUBank(2,"Germany", 1800,380,10,7000000,0,Currency.EUR, 0,0,0,0);
        ChinaBank chinaBank1 = new ChinaBank(3,"China", 7200,1250,12,12540000,0,Currency.USD, 0,0,0,0);
        ChinaBank chinaBank2 = new ChinaBank(3,"China", 7200,1250,12,12540000,0,Currency.EUR, 0,0,0,0);
        User user1 = new User (1, "Svitlana", 1550, 7, "Formag Forwarding", 550, usBank1);
        User user2 = new User (2, "Andriy", 2800, 3, "DEPS Ukraine", 850, usBank2);
        User user3 = new User (3, "Alex", 7200, 2, "MSI", 200, euBank1);
        User user4 = new User (4, "Iryna", 2500, 4, "Focus", 400, euBank2);
        User user5 = new User (5, "Igor", 1470, 14, "Everest", 480, chinaBank1);
        User user6 = new User (6, "Sergei", 2100, 1, "P&G", 1100, chinaBank2);
        BankSystemImpl bankSystem = new BankSystemImpl();

        bankSystem.transferMoney(user1,user2,150);
        bankSystem.fundUser(user1,2890);
        bankSystem.paySalary(user1);
        bankSystem.withdrawOfUser(user1, 15800);



    }
}
