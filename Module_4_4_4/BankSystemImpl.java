package Module_4_4_4;

import Module_4_4_1.Bank;
import Module_4_4_2.Currency;
import Module_4_4_3.User;

public class BankSystemImpl implements BankSystem {

    @Override
    public void transferMoney(User fromUser, User toUser, int withdrawalSum) {
        //if (fromUser.getBank().getCurrency()!== toUser.getBank().getCurrency()){
        //   System.out.println("Incompatible currency types of users.  Money transfer impossible.");
        // }
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
        if (withdrawalSum > 0 && withdrawalSum <= user.getBank().getLimitOfWithdrawal()) {
            user.setBalance(user.getBalance() - withdrawalSum - (user.getBank().getCommission(withdrawalSum) / 100) * withdrawalSum);
            System.out.println("Withdrawal sum: " + withdrawalSum + " " + user.getBank().getCurrency() + ". New balance: " + user.getBalance() + " " + user.getBank().getCurrency());
            if (withdrawalSum > user.getBalance()) {
                System.out.println("Insufficient balance. Withdrawal impossible.");
            }
        } else {
            System.out.println("Withdrawal operation impossible.");
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("User got salary: " + user.getSalary() + " " + user.getBank().getCurrency() + ". New balance: " + user.getBalance() + ". " + user.getBank().getCurrency());
    }

    @Override
    public void fundUser(User user, int fundingSum) {
        if (fundingSum > 0 && fundingSum <= user.getBank().getLimitOfFunding()) {
            user.setBalance(user.getBalance() + fundingSum);
            System.out.println("User funding: " + fundingSum + " " + user.getBank().getCurrency() + ". New balance: " + user.getBalance() + "." + " " + user.getBank().getCurrency());
        }
        if (fundingSum <= 0) {
            System.out.println("Error. Input sum incorrect. Funding operation impossible.");
        }

        if (fundingSum > user.getBank().getLimitOfFunding()) {
            System.out.println("Funding sum over limit. Operation impossible.");
        }
    }
}
