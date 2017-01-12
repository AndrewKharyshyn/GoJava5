package Module_8;

import java.util.List;

class UserDAO extends AbstractDAOImpl{

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
                ", name = " + name + '\'';
    }

   /* <T> void save (List <T> list){

    }

    <T> void delete(T t){

    }

    void deleteAll(List T);
    void saveAll(List T);
    List <T> getList(List list);
    void deleteByld(long id);
    T get(long id);*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
