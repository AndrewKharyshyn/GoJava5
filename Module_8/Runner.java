package Module_8;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        UserDAO user1 = new UserDAO(1, "Andriy");
        UserDAO user2 = new UserDAO(2, "Olga");
        UserDAO user3 = new UserDAO(3, "Oleh");
        UserDAO user4 = new UserDAO(4, "Sergiy");

        ArrayList<UserDAO> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        AbstractDAOImpl abstractDAO = new AbstractDAOImpl();

        abstractDAO.save("New item");
        abstractDAO.saveAll(userList);
        abstractDAO.delete(user1);
        abstractDAO.getList(abstractDAO.database);
        abstractDAO.deleteByld(2);
        abstractDAO.get(3);
        abstractDAO.deleteAll(abstractDAO.database);
    }
}
