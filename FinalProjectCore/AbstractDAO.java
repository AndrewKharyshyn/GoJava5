package FinalProjectCore;

import java.util.Map;

public interface AbstractDAO {

    void addUserTable();
   // void addNewUser (long id, String name, String lastName);
    void addUserRoom();
    void addHotels();
    Map<String, String> addHotelMap();
}
