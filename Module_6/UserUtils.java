package Module_6;

import java.util.Arrays;

public class UserUtils {

    User[] uniqueUsers(User[] users) {
        User[] uniqueUsers = new User[users.length];
        for (int i = 0, j = 0; i < users.length; i++, j++) {
            uniqueUsers[j] = users[i];
            if (uniqueUsers[j].equals(users[i])) {
                uniqueUsers[j] = null;
                System.out.println(uniqueUsers [j]);
            }
        }

        return uniqueUsers;
    }
/*
    User[] usersWithContitionalBalance(User[] users, int balance){

    }

    public final User[] paySalaryToUsers(User[] users){

    }

    public final long[] getUsersId(User[] users){

    }
    User[] deleteEmptyUsers(User[] users){

    }
    */
}
