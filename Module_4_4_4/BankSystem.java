package Module_4_4_4;

import Module_4_4_3.User;

public interface BankSystem {
    void withdrawOfUser(User user, int withdrawalSum);
    void fundUser(User user, int fundingSum);
    void transferMoney(User fromUser, User toUser, int withdrawalSum);
    void paySalary(User user);
}
