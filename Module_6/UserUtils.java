package Module_6;

import java.util.Arrays;

public class UserUtils {

    User[] uniqueUsers(User[] users) {

        User[] uniqueUsers = new User[users.length];

        System.out.println();
        Arrays.sort(users);

        for (int k = 0; k < users.length - 1; k++) {
            if (users[k].getId() == users[k + 1].getId() && users[k].getFirstName().equals(users[k + 1].getFirstName())
                    && users[k].getLastName().equals(users[k + 1].getLastName())
                    && users[k].getBalance() == users[k + 1].getBalance() && users[k].getSalary() == users[k + 1].getSalary()) {
                uniqueUsers[k] = null;
                uniqueUsers[k + 1] = users[k + 1];
            }
            if (users[k].getId() != users[k + 1].getId() || !users[k].getFirstName().equals(users[k + 1].getFirstName())
                    || !users[k].getLastName().equals(users[k + 1].getLastName())
                    || users[k].getBalance() != users[k + 1].getBalance() || users[k].getSalary() != users[k + 1].getSalary()) {
                uniqueUsers[k] = users[k];
            }
        }
        System.out.println("Array of unique users:");
        System.out.println(Arrays.toString(uniqueUsers));
        for (int i = 0; i < uniqueUsers.length; i++) {
            users[i] = uniqueUsers[i];
        }
        return null;
    }

    User[] usersWithConditionalBalance(User[] users, int balance) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                System.out.println(users[i].getLastName() + " " + users[i].getFirstName() + ", balance: " + users[i].getBalance());
                count = count + 1;
            }
        }
        if (count == 0) {
            System.out.println("User with balance " + balance + " not found.");
        }

        return null;
    }


    public final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
            System.out.println("User's " + users[i].getLastName() + " " + users[i].getFirstName() + " balance after salary paid: " + users[i].getBalance());
        }
        return users;
    }

    public final long[] getUsersId(User[] users) {
        for (int i = 0; i < users.length; i++) {
            System.out.println("User's " + users[i].getLastName() + " " + users[i].getFirstName() + " ID: " + users[i].getId());
        }
        return null;
    }

    User[] deleteEmptyUsers(User[] users) {
        int counter = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                counter = counter + 1;
            }
        }
        User[] newUser = new User[users.length - counter];

        int k = 0;

        for (int i = 0, j = 0; i < newUser.length; i++, j++) {
            if (users[i] == null) {
                k= i;
            }
            if (users[i] != null) {
                newUser[j] = users[i];
            }
        }
        System.out.println(Arrays.toString(newUser));
        return null;
    }
}




