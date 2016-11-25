package Module_4_4_1;

import Module_4_4_2.Currency;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital, Currency currency) {
        super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital, currency);
    }

    @Override
    public int getMonthlyRate() {
        switch (currency) {
            case USD:
                return 1;
            case EUR:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch (currency) {
            case USD:
                return 10000;
            case EUR:
                return 5000;
            default: return 0;
        }
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (currency) {
            case USD:
                return 100;
            case EUR:
                return 150;
            default:
                return 0;
        }
    }

    @Override
    public int getCommission(int withdrawalSum) {
        if (withdrawalSum < 0) {
            System.out.println("Incorrect value. Your input sum is less than 0");
            return 0;
        }
        switch (currency) {
            case USD:
                return withdrawalSum > 1000 ? 5 : 3;
            case EUR:
                return withdrawalSum > 1000 ? 11 : 10;
            default:
                return 0;
        }
    }
}

