package FinalProjectCore;

import java.util.List;

public interface AbstractDAO {

    void addUserTable();//Adding users to the list

    List<User> getUsers(); //Getting the copy of user list

    Room generateRoom(); //Generating random rooms

    void addUserRoom(); //filling the list with random rooms

    void addHotels();

    List<Hotel> getHotels();

    void addingNewUser(User user);
}
