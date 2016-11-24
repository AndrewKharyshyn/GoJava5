package Module_4_4_1;

import java.util.Currency;

import static Module_4_4_2.Currency.EUR;
import static Module_4_4_2.Currency.USD;

public class ChinaBank extends Bank {

    int withdrawalSum;
    Module_4_4_2.Currency currency;
    int fundingLimit;
    int monthlyRate;
    int commission;
    int withdrawalLimit;

    @Override
    int getMonthlyRate() {
        switch (currency) {
            case USD: monthlyRate = 1;
                break;
            case EUR: monthlyRate = 0;
                break;
        }
        return monthlyRate;
    }

    @Override
    int getLimitOfFunding() {
        switch (currency) {
            case USD: fundingLimit = 10000;
                break;
            case EUR: fundingLimit = 5000;
                break;
        }
        return fundingLimit;
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (currency) {
            case USD: withdrawalLimit = 100;
                break;
            case EUR: withdrawalLimit = 150;
                break;
        }
        return withdrawalLimit;
    }

    @Override
    int getCommission(int withdrawalSum) {
        if ((currency) == USD && withdrawalSum < 1000) {
            commission = 3;
        }
        if ((currency) == USD && withdrawalSum > 1000) {
            commission = 5;
        }
        if ((currency) == EUR && withdrawalSum < 1000) {
            commission = 10;
        }
        if ((currency) == EUR && withdrawalSum > 1000) {
            commission = 11;
        }
        return commission;
    }

    public ChinaBank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital, int withdrawalSum, Module_4_4_2.Currency currency, int fundingLimit, int monthlyRate, int commission, int withdrawalLimit) {
        super(id, bankCountry, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.withdrawalSum = withdrawalSum;
        this.currency = currency;
        this.fundingLimit = fundingLimit;
        this.monthlyRate = monthlyRate;
        this.commission = commission;
        this.withdrawalLimit = withdrawalLimit;
    }
}

