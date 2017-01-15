package Module_8;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println("--------------------------------");
        System.out.println("UserDAO methods");

        List<UserDAO> listOfUsers = new ArrayList<>();
        user1.save(user1);

        listOfUsers.add(user2);
        listOfUsers.add(user3);
        listOfUsers.add(user4);

        user1.saveAll(listOfUsers);
        user1.delete(user1);
        user1.getList(listOfUsers);
        user1.deleteByld(3);
        user1.get(4);
        user1.deleteAll(listOfUsers);
    }
}
