package Module_4_4_1;


import Module_4_4_2.Currency;

public class USBank extends Bank {

    @Override
    public int getMonthlyRate() {
        switch (currency) {
            case USD:
                return 1;
            case EUR:
                return 2;
            default:
                return 0;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch (currency) {
            case USD:
                return 0;
            case EUR:
                return 10000;
            default:
                return 0;
        }
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (currency) {
            case USD:
                return 1000;
            case EUR:
                return 1200;
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
                return withdrawalSum > 1000 ? 7 : 5;
            case EUR:
                return withdrawalSum > 1000 ? 8 : 6;
            default:
                return 0;
        }
    }

    public USBank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital, Currency currency) {
        super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital, currency);
    }
}

