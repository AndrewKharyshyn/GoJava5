package Module_6;

import java.util.Arrays;

public class UserUtils {

    User[] uniqueUsers(User[] users) {

        System.out.println();
        Arrays.sort(users);

        for (int k = 0; k < users.length - 2; k++) {
            if (users[k].equals(users[k + 1])) {
                users[k] = null;
            }
        }
        System.out.println("Array of unique users:");
        System.out.println(Arrays.toString(users));
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
                ++counter;
            }
        }
        User[] newUser = new User[users.length - counter];

        for (int i = 0, j = 0; i < users.length; i++) {
            if (users[i] != null) {
                newUser[j++] = users[i];
            }
        }
        System.out.println(Arrays.toString(newUser));
        return newUser;
    }
}




