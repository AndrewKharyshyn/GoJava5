package Module_5;

import java.util.Arrays;

public class BookingComAPI implements API {

    Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(790, 300, 1, "Tower", "London");
        rooms[1] = new Room(110, 80, 1, "Capital", "Paris");
        rooms[2] = new Room(100, 800, 2, "The Dubai Hotel", "Dubai");
        rooms[3] = new Room(425, 520, 4, "President Hotel", "Kyiv");
        rooms[4] = new Room(536, 100, 2, "Hyyatt", "Kyiv");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundRooms = new Room[rooms.length];
        for (int i = 0, count = 0; i < rooms.length; i++) {
            if (price >= rooms[i].getPrice() && persons <= rooms[i].getPersons() && city.equals(rooms[i].getCityName()) && hotel.equals(rooms[i].getHotelName()))
                foundRooms[count++] = rooms[i];
        }
        return foundRooms;
    }
}
