package Module_2_2_3;

import java.util.Scanner;

/**
 * Created by Andrew on 02.11.2016.
 */
public class Withdrawal {
    int[] balances = {1200, 250, 2000, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    String inputName;
    int nameIndex;
    int inputSum;
    double commission;
    double balance;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите свое имя");
        inputName = sc.nextLine();
        nameCheck();
    }

    public void nameCheck() {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(inputName)) {
                nameIndex = i;

                System.out.println("Здравствуйте, " + inputName + ". Вход в систему выполнен. ID пользователя: " + i);
                balanceCheck();

            } else {
                System.out.println("Ошибка ввода! Имя пользователя " + inputName + " не существует. Повторите ввод.");
                inputData();
            }
        }
    }

    public void balanceCheck() {

        System.out.println(inputName + ", Ваш баланс составляет: " + balances[nameIndex]);
        sumWithdrawal();
    }

    public void sumWithdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите сумму снятия");
        inputSum = sc.nextInt();
        commission = inputSum * 0.05;
        if (inputSum <= 0) {
            System.out.println("Введена неверная сумма. Повторите попытку...");
            sumWithdrawal();
        } else {
            if (inputSum + commission <= balances[nameIndex]) {
                balance = balances[nameIndex] - inputSum - commission;
                System.out.println("Операция проведена успешно. Снято: " + inputSum + ". \nКомиссия: " + commission + ". Баланс: " + balance);
            }
            if (balances[nameIndex] < inputSum + commission) {
                System.out.println("На Вашем счету недостаточно средств для снятия. \nВы запросили: " + inputSum + ". Баланс: " + balances[nameIndex]);
            }
        }

    }
}
