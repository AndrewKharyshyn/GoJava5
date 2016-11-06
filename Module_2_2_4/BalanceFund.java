package Module_2_2_4;

import java.util.Scanner;

/**
 * Created by Andrew on 05.11.2016.
 */
public class BalanceFund {
    int[] balances = {1200, 250, 2000, 500, 3200};
    String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    String inputName;
    int nameIndex;
    int inputSum;
    double balance;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите свое имя...");
        inputName = sc.nextLine();
        nameCheck();
    }

    public void nameCheck() {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(inputName)) {
                System.out.println("Здравствуйте, " + inputName + ". Вход в систему выполнен. ID пользователя: " + i);
                nameIndex = i;
                balanceCheck();
                break;
            }
            System.out.println("Ошибка ввода! Имя пользователя " + inputName + " не существует. Повторите ввод.");
            inputData();

        }
    }

    public void balanceCheck() {

        System.out.println(inputName + ", Ваш баланс составляет: " + balances[nameIndex]);
        balanceFund();
    }

    public void balanceFund() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите сумму пополнения");
        inputSum = sc.nextInt();
        if (inputSum <= 0) {
            System.out.println("Введена неверная сумма. Повторите попытку...");
            balanceFund();
        } else {
            balance = balances[nameIndex] + inputSum;
            System.out.println("Операция проведена успешно. Ваш счет пополнен на " + inputSum + ". Баланс: " + balance);
        }
    }
}

