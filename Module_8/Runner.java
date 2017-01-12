package Module_8;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList <UserDAO> userList = new ArrayList<>();

        UserDAO user1 = new UserDAO(1, "Andriy");
        UserDAO user2 = new UserDAO(2, "Olga");
        UserDAO user3 = new UserDAO(3, "Oleh");
        UserDAO user4 = new UserDAO(4, "Sergiy");

        AbstractDAOImpl abstractDAO = new AbstractDAOImpl();

        abstractDAO.save("Some symbol");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        abstractDAO.saveAll(userList);
        abstractDAO.delete(user1);
        abstractDAO.getList(userList);
        abstractDAO.deleteByld(2);

    }
}
