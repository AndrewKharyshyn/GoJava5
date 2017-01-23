package FinalProjectCore;

import java.util.Collection;
import java.util.List;

public interface AbstractDAO {

    void addUserTable();

    List<User> getUsers(); //Getting the copy of user list

    Room generateRoom(); //Generating random rooms

    //void addUserRoom();

    void addHotels();

    public List<Hotel> getHotels();
}
