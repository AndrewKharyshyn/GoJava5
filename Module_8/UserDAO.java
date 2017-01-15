package Module_8;

import java.util.Iterator;
import java.util.List;

class UserDAO extends AbstractDAOImpl {

    long id;
    String name;

    public UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDAO " +
                "id = " + id +
                ", name = " + name;
    }

    public void save(UserDAO userDAO) {
        System.out.println("Method SAVE:");
        database.add(userDAO);
        System.out.println("Item " + userDAO + " saved to Database:");
        System.out.println(database);
        System.out.println();
    }

    public void saveAll(List list) {
        System.out.println("Method SAVE ALL:");
        database.addAll(list);
        System.out.println(database);
        System.out.println();
    }

   public void delete(UserDAO userDAO) {
        System.out.println("Method DELETE:");
        database.remove(userDAO);
        System.out.println("Deleted object: " + userDAO);
        System.out.println(database);
        System.out.println();
    }

    public List<UserDAO> getList(List list) {
        System.out.println("Method GET LIST:");
        System.out.println("Get the following list:");
        System.out.println(list);
        System.out.println();
        return list;
    }

    public void deleteByld(long id) {
        System.out.println("Method DELETE BY ID:");
        Iterator<UserDAO> iterator = database.iterator();
        int count = 0;
        while (iterator.hasNext()) {

            if (iterator.next().toString().contains("id = " + id)) {
                iterator.remove();
                count = 1;
                System.out.println("The item with ID " + id + " has been deleted from the list");
            }
        }
        if (count == 0) {
            System.out.println("ID " + id + " not found.");
        }
        System.out.println(database);
        System.out.println();
    }

    public UserDAO get(long id) {
        System.out.println("Method GET BY ID:");
        int count = 0;
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).toString().contains("id = " + id)) {
                count = 1;
                System.out.println("The item found: " + database.get(i).toString());
            }
        }
        if (count == 0) {
            System.out.println("ID " + id + " not found.");
        }
        System.out.println();

        return null;
    }

    public void deleteAll(List list) {
        System.out.println("Method DELETE ALL:");
        database.removeAll(database);
        System.out.println(database);
    }
}
