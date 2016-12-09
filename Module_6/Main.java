package Module_6;

public class Main {
    public static void main(String[] args) {

        ArraysUtils.digitArray = new int[]{13, 72, 16, 11, -7, 118, 21, 8, -6, 64};


        User user1 = new User(3, "Davidov", "Ruslan", 5500, 1800);
        User user2 = new User(6, "Kovalska", "Anna", 2000, 300);
        User user3 = new User(1, "Maksimchuk", "Iryna", 2500, 1000);
        User user4 = new User(3, "Davidov", "Ruslan", 5500, 1800);
        User user5 = new User(2, "Kushnir", "Vitaliy", 1250, 450);
        User user6 = new User(4, "Fedorchuk", "Natalia", 500, 800);
        User user7 = new User(5, "Fedorchuk", "Olga", 14400, 1800);

        User[] users = new User[7];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = user5;
        users[5] = user6;
        users[6] = user7;

        System.out.println("Array methods results:");

        ArraysUtils.result();
        ArraysUtils.resultmin();
        ArraysUtils.resultmax();
        ArraysUtils.resultmaxpos();
        ArraysUtils.resultmaxneg();
        ArraysUtils.resultmultip();
        ArraysUtils.resultmod();
        ArraysUtils.secondLargNum();
        ArraysUtils.reverse();
        ArraysUtils.findEvenElements();
        System.out.println();

        UserUtils userUtils = new UserUtils();
        System.out.println();

        System.out.println("Users with conditional balance:");
        userUtils.usersWithConditionalBalance(users, 1000);
        System.out.println();

        System.out.println("Salary payment:");
        userUtils.paySalaryToUsers(users);
        System.out.println();

        System.out.println("Users' ID:");
        userUtils.getUsersId(users);

        userUtils.uniqueUsers(users);
        System.out.println();

        System.out.println("Array without empty users:");
        userUtils.deleteEmptyUsers(users);
    }
}
