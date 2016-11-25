package Module_4_4_4;

import Module_4_4_3.User;

public class BankSystemImpl implements BankSystem {

    @Override
    public void transferMoney(User fromUser, User toUser, int withdrawalSum) {

        fromUser.setBalance(fromUser.getBalance() - withdrawalSum);
        toUser.setBalance(toUser.getBalance() + withdrawalSum);
        System.out.println("Transferred:" + withdrawalSum + ". FromUser (new balance "+ fromUser.getBalance()+")" + ". ToUser (new balance "+ toUser.getBalance()+" ).");
    }

    @Override
    public void withdrawOfUser(User user, int withdrawalSum) {
        if (withdrawalSum>0 && withdrawalSum <=user.getBank().getLimitOfWithdrawal(user.getCurrency())){
            user.setBalance(user.getBalance()-withdrawalSum-user.getBank().getCommission(user.getBank()));
        }
        else {
            System.out.println("Operation impossible.");
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance()+user.getSalary());
        System.out.println("User got salary" + user.getSalary() + ". New balance: "+ user.getBalance()+".");
    }

    @Override
    public void fundUser(User user, int fundingSum) {
        if (fundingSum>0 && fundingSum <=user.getBank().getLimitOfWithdrawal()) {
            user.setBalance(user.getBalance() + fundingSum);
            System.out.println("User funding:" + fundingSum + ". New balance: "+ user.getBalance()+".");
        }
            else {
            System.out.println("Operation impossible.");
            }
    }
}
