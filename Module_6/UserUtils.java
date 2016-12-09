package Module_6;

import java.util.Arrays;

public class UserUtils {

    User[] uniqueUsers(User[] users) {
        User[] tempUsers = new User[users.length];
        User[] uniqueUsers = new User[tempUsers.length];

        for (int i = 0, j = 0; i < users.length; i++, j++) {
            tempUsers[j] = users[i];
        }

        System.out.println();
        Arrays.sort(tempUsers);

        for (int k = 0; k < tempUsers.length; k++) {
            System.out.println(tempUsers[k]);
        }

        System.out.println("Array of unique users:");

        for (int m = 0, n = 0; m < tempUsers.length; m++, n++) {
            if (tempUsers[m].getLastName().equals(tempUsers[m++].getLastName())) {
                uniqueUsers[n] = tempUsers[m];
                System.out.println(uniqueUsers[n]);
            }
        }
        return uniqueUsers;
    }

    User[] usersWithConditionalBalance(User[] users, int balance) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance)
                System.out.println(users[i].getLastName() + " " + users[i].getFirstName() + ". Balance: " + users[i].getBalance());
        }
        if(users[i].getBalance() != balance){
            System.out.println("User with balance "+balance + " not found.");
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

    /*User[] deleteEmptyUsers(User[] users) {

    }*/
}




