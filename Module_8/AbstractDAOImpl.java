package Module_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class AbstractDAOImpl<T> implements AbstractDAO<T> {

    List<T> database = new ArrayList<>();

    public void save(T val) {
        System.out.println("Method SAVE:");
        database.add(val);
        System.out.println("Item " + val + " saved to Database:");
        System.out.println(database);
        System.out.println();
    }

    public void saveAll(List T) {
        System.out.println("Method SAVE ALL:");
        database.addAll(T);
        System.out.println(database);
        System.out.println();
    }

    public void delete(T o) {
        System.out.println("Method DELETE:");
        database.remove(o);
        System.out.println("Deleted object: " + o);
        System.out.println(database);
        System.out.println();
    }

    public List<T> getList(List list) {
        System.out.println("Method GET LIST:");
        System.out.println("Get the following list:");
        System.out.println(list);
        System.out.println();
        return list;
    }

    public void deleteByld(long id) {
        System.out.println("Method DELETE BY ID:");
        Iterator<T> iterator = database.iterator();
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

    public T get(long id) {
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

    public void deleteAll(List T) {
        System.out.println("Method DELETE ALL:");
        database.removeAll(database);
        System.out.println(database);
    }
}
