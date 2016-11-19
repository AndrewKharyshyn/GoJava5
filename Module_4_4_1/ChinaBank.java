package Module_4_4_1;

import java.util.Currency;

/**
 * Created by Andrew on 19.11.2016.
 */
public class ChinaBank extends Bank {
    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    int getCommission(int summ) {
        return 0;
    }

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}

