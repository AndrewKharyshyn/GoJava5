package Module_2_2_2;

public class Withdrawal {

    double balance = 100, withdrawalSum, commission;

    void sumWithdrawal(){

        commission = withdrawalSum*0.05;

        if (balance>=(withdrawalSum+commission)){
            balance = balance - withdrawalSum - commission;
            System.out.println("OK, операция успешно завершена! Снято: " +withdrawalSum+ ". Комиссия за транзакцию: "+commission + " Баланс счета: " + balance);
        }
        else {
            System.out.println("NO, Недостаточно средств на счету (Ваш баланс: "+balance + ". Комиссия за снятие /5%/: " + commission + "). Требуется еще: " + Math.abs(balance-withdrawalSum-commission));
        }
    }

}
