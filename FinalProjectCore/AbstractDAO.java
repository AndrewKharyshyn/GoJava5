package FinalProjectCore;

import java.util.Collection;
import java.util.List;

public interface AbstractDAO {

    void addUserTable();
    Collection<User> getUsers(); //Getting the copy of user list
    List<User> getUserList();

    // void addNewUser (long id, String name, String lastName);

    Room generateRoom(); //Generating random rooms

    //void addUserRoom();

    void addHotels();

    public Collection<Hotel> getHotels();
}
