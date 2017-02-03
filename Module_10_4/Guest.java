package Module_10_4;

public class Guest {
    private String name;
    private String surname;
    private double paymentDebt;

    public Guest(double paymentDebt, String name, String surname) {
        this.paymentDebt = paymentDebt;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPaymentDebt() {
        return paymentDebt;
    }

    public void setPaymentDebt(double paymentDebt) {
        this.paymentDebt = paymentDebt;
    }
}
