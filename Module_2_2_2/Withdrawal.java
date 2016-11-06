package Module_2_2_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Withdrawal {

    double balance = 100, withdrawalSum, commission;

    void sumWithdrawal() {

        commission = withdrawalSum * 0.05;

        if (balance >= (withdrawalSum + commission)) {
            balance = balance - withdrawalSum - commission;
            System.out.println("OK, операция успешно завершена! Снято: " + withdrawalSum + ". \nКомиссия за транзакцию: " + commission + " Баланс счета: " + balance);
        } else {
            System.out.println("NO, Недостаточно средств на счету (Ваш баланс: " + balance + ". Комиссия за снятие /5%/: " + commission + "). Требуется еще: " + Math.abs(balance - withdrawalSum - commission));
        }
    }

    void withdrawalProcess() {
        System.out.println("Текущий баланс на Вашем счету: " + balance);

        System.out.println("Введите сумму снятия средств...");
        Scanner sc = new Scanner(System.in);
        withdrawalSum = sc.nextDouble();

        if (withdrawalSum >= balance) {
            sumWithdrawal();
        } else {
            if (withdrawalSum <= 0) {
                System.out.println("Вы указали неверную сумму. Пожалуйста, повторите ввод...");
            } else {
                System.out.println("Вы снимаете: " + withdrawalSum + ".");
                sumWithdrawal();
            }
        }

    }
}