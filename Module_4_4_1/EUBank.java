package Module_4_4_1;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital, Module_4_4_2.Currency currency) {
        super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital, currency);
    }

    @Override
    public int getMonthlyRate() {
        switch (currency) {
            case USD:
                return 0;
            case EUR:
                return 1;
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
                return 20000;
            default: return 0;
        }
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (currency) {
            case USD:
                return 2000;
            case EUR:
                return 2200;
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
                return withdrawalSum > 1000 ? 4 : 2;
            default:
                return 0;
        }
    }
}
