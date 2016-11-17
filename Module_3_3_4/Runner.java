package Module_3_3_4;

public class Runner {
    public static void main(String[] args) {
        InputData check = new InputData();

        User userInfo = new User(check.nameInput(), 5500,5, check.inputCompanyName(), 5000, "USD");
        userInfo.paySalary();
        userInfo.withdraw(check.checkSumm());
        userInfo.companyNameLength();
        userInfo.monthIncreaser(check.checkMonth());
    }
}
