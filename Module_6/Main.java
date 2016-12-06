package Module_6;

public class Main {
    public static void main(String[] args) {

        ArraysUtils.digitArray = new int[] {13,72,16, 11, -7, 118,21,8,-6, 64};
        User user1 = new User(1, "Davidov", "Ruslan", 5500, 1800);
        User user2 = new User(2, "Kovalska", "Anna", 2000, 300);
        User user3 = new User(3, "Maksimchuk", "Iryna", 2500, 1000);
        User user4 = new User(4, "Fedorchuk", "Natalia", 500, 800);
        User user5 = new User(5, "Kushnir", "Vitaliy", 1250, 450);
        User user6 = new User(4, "Fedorchuk", "Natalia", 500, 800);

        User[] users = new User[6];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = user5;
        users[5] = user6;

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
        userUtils.uniqueUsers(users);

    }
}
