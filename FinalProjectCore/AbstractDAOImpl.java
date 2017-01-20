package FinalProjectCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbstractDAOImpl implements AbstractDAO {
    List<User> userList = new ArrayList<>();
    List<Room> roomsHotel1 = new ArrayList<>();
    List<Room> roomsHotel2 = new ArrayList<>();
    List<Room> roomsHotel3 = new ArrayList<>();
    List<Hotel> hotels = new ArrayList<>();

    Room room1 = new Room(1, 2, 520, 1, true, 0, null);
    Room room2 = new Room(2, 1, 360, 1, true, 5, null);
    Room room3 = new Room(3, 4, 1250, 1, false, 3, null);
    Room room4 = new Room(4, 1, 400, 1, false, 3, null);
    Room room5 = new Room(5, 2, 500, 1, true, 10, null);
    Room room6 = new Room(6, 1, 1100, 1, true, 15, null);
    Room room7 = new Room(7, 1, 150, 1, false, 0, null);
    Room room8 = new Room(8, 2, 1500, 1, true, 2, null);
    Room room9 = new Room(9, 2, 1000, 1, true, 0, null);
    Room room10 = new Room(10, 3, 2500, 1, true, 0, null);

    Room room11 = new Room(11, 3, 750, 2, true, 10, null);
    Room room12 = new Room(12, 2, 600, 2, false, 7, null);
    Room room13 = new Room(13, 4, 1250, 2, false, 15, null);
    Room room14 = new Room(14, 1, 800, 2, false, 5, null);
    Room room15 = new Room(15, 3, 2500, 2, true, 0, null);
    Room room16 = new Room(16, 1, 850, 2, true, 0, null);
    Room room17 = new Room(17, 1, 550, 2, false, 5, null);
    Room room18 = new Room(18, 4, 1500, 2, false, 20, null);
    Room room19 = new Room(19, 2, 1000, 2, true, 0, null);
    Room room20 = new Room(20, 2, 2500, 2, true, 0, null);

    Hotel hotel1 = new Hotel(1, "President Hotel", "Kyiv", roomsHotel1);
    Hotel hotel2 = new Hotel(2, "Hyatt", "Odesa", roomsHotel2);
    Hotel hotel3 = new Hotel(3, "Hyatt", "Istanbul", roomsHotel3);

    @Override
    public void addUserRoom() {
        roomsHotel1.add(room1);
        roomsHotel1.add(room2);
        roomsHotel1.add(room3);
        roomsHotel1.add(room4);
        roomsHotel1.add(room5);
        roomsHotel1.add(room6);
        roomsHotel1.add(room7);
        roomsHotel1.add(room8);
        roomsHotel1.add(room9);
        roomsHotel1.add(room10);

        roomsHotel2.add(room11);
        roomsHotel2.add(room12);
        roomsHotel2.add(room13);
        roomsHotel2.add(room14);
        roomsHotel2.add(room15);

        roomsHotel3.add(room16);
        roomsHotel3.add(room17);
        roomsHotel3.add(room18);
        roomsHotel3.add(room19);
        roomsHotel3.add(room20);
    }

    @Override
    public void addHotels() {
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
    }

    @Override
    public void addUserTable() {
        User user1 = new User(1, "Alex", "Melnikov");
        User user2 = new User(2, "Olga", "Safonova");
        User user3 = new User(3, "Oleg", "Petrov");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

   /*@Override
    public void addNewUser(long id, String name, String lastName) {
        userList.add(); //Parameters are from Main method
    }*/

    @Override
    public Map<String, String> addHotelMap() {
        Map hotelMap = new HashMap<String, String>();
        hotelMap.put(hotel1.getCity(),hotel1.getHotelName());
        hotelMap.put(hotel2.getCity(),hotel2.getHotelName());
        hotelMap.put(hotel3.getCity(),hotel3.getHotelName());
        return hotelMap;
    }
}
