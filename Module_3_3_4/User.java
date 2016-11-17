package Module_3_3_4;


public class User {
    String name;
    double balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary() {
        System.out.println("User: " + getName());
        System.out.println("Initial balance: " + getBalance() + " " + getCurrency());
        balance += getSalary();
        System.out.println("The salary received " + getSalary() + " " + getCurrency() + "\nNew balance: " + getBalance() + " " + getCurrency());
    }

    void withdraw(Integer summ) {
        double commission1 = summ * 0.05;
        double commission2 = summ * 0.1;

        if (summ > 0 && summ < 1000 && (summ + commission1) <= getBalance()) {
            balance = getBalance() - summ - commission1;
            System.out.println("Operation successful! Withdrawal sum: " + summ + " " + getCurrency() +"\nBalance: " + getBalance() + "\nCommission: " + commission1+ " " + getCurrency());
        }
           if (summ > 0 && summ >= 1000 && (summ + commission2) <= getBalance()) {
            balance = getBalance() - summ - commission2;
            System.out.println("Operation successful! Withdrawal sum: " + summ + " " + getCurrency() + "\nBalance: " + getBalance() + " " + getCurrency() + "\nCommission: " + commission2 + " " + getCurrency());
        }
        if (getBalance()< summ+commission1 || getBalance()<summ+commission2){
            System.out.println("Not enough money on your account. Operation not available.");
        }
    }

    void companyNameLength() {
        int charQuant = 0;
        for (int i = 0; i < getCompanyName().length() + 1; i++) {
            charQuant = i;
        }
        System.out.println("Number of characters in your company name (" +getCompanyName()+"): " + charQuant);
    }

    void monthIncreaser(int addMonth) {
        System.out.println(getName() + " initially has worked at " + getCompanyName() + " for " +getMonthsOfEmployment() + " months.");
        monthsOfEmployment += addMonth;
        System.out.println("The updated employment time is " + getMonthsOfEmployment() + " months.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
