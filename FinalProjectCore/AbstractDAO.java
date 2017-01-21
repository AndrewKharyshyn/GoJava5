package FinalProjectCore;

import java.util.Collection;
import java.util.Map;

public interface AbstractDAO {

    void addUserTable();
   // void addNewUser (long id, String name, String lastName);
    void addUserRoom();
    void addHotels();

    public Collection<User> getUserList();
    public Collection<Hotel> getHotels();
    Map<String, String> addHotelMap();
}
