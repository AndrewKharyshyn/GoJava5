package Module_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class AbstractDAOImpl<T> //extends AbstractDAO
{

    List<T> database = new ArrayList<>();

    public void save(T val) {
        database.add(val);
        System.out.println("Item saved to Database");
        System.out.println(database);
    }

    public void saveAll(List T) {
        database.addAll(T);
        System.out.println(database);
    }

    public void delete(Object o) {
        database.remove(o);
        System.out.println("Deleted object: " + o);
        System.out.println(database);
    }

    public List<T> getList(List list) {
        System.out.println("Get the following list:");
        System.out.println(list);
        return list;
    }

   public void deleteByld(long id) {
        Iterator <T> iterator = database.iterator();
        while (iterator.hasNext()){
            if (iterator.next().
        }
        System.out.println("The item with ID "+id + " has been deleted from the list");

    }

    public T get(long id) {
        return null;
    }

   /* @Override
    public void deleteAll(List T) {

    }
    */
}
