package Module_2_2_2;

import java.util.Scanner;

/**
 * Created by Andrew on 31.10.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Withdrawal balance = new Withdrawal();
        Withdrawal withdrawalSum = new Withdrawal();

        System.out.println("Текущий баланс на Вашем счету: " + balance.balance);

        System.out.println("Введите сумму снятия средств...");
        Scanner sc = new Scanner(System.in);
        withdrawalSum.withdrawalSum = sc.nextDouble();

        if (withdrawalSum.withdrawalSum >= balance.balance) {
            withdrawalSum.sumWithdrawal();
        } else {
            if (withdrawalSum.withdrawalSum <= 0) {
                System.out.println("Вы указали неверную сумму. Пожалуйста, повторите ввод...");
            } else {
                System.out.println("Вы снимаете: " + withdrawalSum.withdrawalSum + ".");
                withdrawalSum.sumWithdrawal();
            }
        }
    }
}


