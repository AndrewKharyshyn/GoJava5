package Module_4_4_4;

import Module_4_4_1.Bank;
import Module_4_4_2.Currency;
import Module_4_4_3.User;

public class BankSystemImpl implements BankSystem {

    @Override
    public void transferMoney(User fromUser, User toUser, int withdrawalSum) {
        if (fromUser.getBank().getCurrency()!= toUser.getBank().getCurrency()){
           System.out.println("Incompatible currency types of users.  Money transfer impossible.");
            return;
        }
        if (withdrawalSum < fromUser.getBalance()) {
            fromUser.setBalance(fromUser.getBalance() - withdrawalSum);
            toUser.setBalance(toUser.getBalance() + withdrawalSum);
            System.out.println("Transferred: " + withdrawalSum + " " + fromUser.getBank().getCurrency() + ". FromUser (new balance " + fromUser.getBalance() + " " + fromUser.getBank().getCurrency() + ")." + " ToUser (new balance " + toUser.getBalance() + " " + fromUser.getBank().getCurrency() + " ).");
        }
        if (withdrawalSum > fromUser.getBalance()) {
            System.out.println("Insufficient balance (FromUser).  Money transfer impossible.");
        }
    }

    @Override
    public void withdrawOfUser(User user, int withdrawalSum) {
        boolean error = false;

        if (withdrawalSum <= 0) {
            System.out.println("Input sum incorrect");
            error = true;
        }
        if (withdrawalSum > user.getBank().getLimitOfWithdrawal()) {
            System.out.println("Withdrawal sum over limit");
            error = true;
        }
        double commission = (user.getBank().getCommission(withdrawalSum) / 100.) * withdrawalSum;

        if (withdrawalSum + commission > user.getBalance()) {
            System.out.println("Insufficient balance");
            error = true;
        }
        if (!error) {
            user.setBalance(user.getBalance() - withdrawalSum - commission);
            System.out.println("Withdrawal sum: " + withdrawalSum + " " + user.getBank().getCurrency() + ". New balance: " + user.getBalance() + " " + user.getBank().getCurrency());
        }
    }


    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("User got salary: " + user.getSalary() + " " + user.getBank().getCurrency() + ". New balance: " + user.getBalance() + ". " + user.getBank().getCurrency());
    }

    @Override
    public void fundUser(User user, int fundingSum) {
        if ((fundingSum > 0 && fundingSum <= user.getBank().getLimitOfFunding()) || user.getBank().getLimitOfFunding() == 0) {
            user.setBalance(user.getBalance() + fundingSum);
            System.out.println("User funding: " + fundingSum + " " + user.getBank().getCurrency() + ". New balance: " + user.getBalance() + "." + " " + user.getBank().getCurrency());
        }
        if (fundingSum <= 0) {
            System.out.println("Error. Input sum incorrect. Funding operation impossible.");
        }
        if (fundingSum > user.getBank().getLimitOfFunding() && user.getBank().getLimitOfFunding() != 0) {
            System.out.println("Funding sum over limit. Operation impossible.");
        }
    }
}
