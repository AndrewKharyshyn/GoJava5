package Module_4_4_4;

import Module_4_4_3.User;

public class BankSystemImpl implements BankSystem {

    @Override
    public void transferMoney(User fromUser, User toUser, int withdrawalSum) {

        fromUser.setBalance(fromUser.getBalance() - withdrawalSum);
        toUser.setBalance(toUser.getBalance() + withdrawalSum);
        System.out.println("Transferred:" + withdrawalSum + ". FromUser (new bala: ");
    }

    @Override
    public void withdrawOfUser(User user, int withdrawalSum) {
        if (withdrawalSum>0 && withdrawalSum <=user.getBank().getLimitOfWithdrawal(user.getCurrency())){
            user.setBalance(user.getBalance()-withdrawalSum-user.getBank().getCommission(user.));
        }

    }

    @Override
    public void paySalary(User user) {


    }

    @Override
    public void fundUser(User user, int fundingSum) {

    }
}
