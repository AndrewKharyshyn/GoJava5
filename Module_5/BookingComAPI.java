package Module_5;

import java.util.Arrays;

public class BookingComAPI implements API {

    Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(789, 300, 1, "London", "Tower");
        rooms[1] = new Room(101, 80, 1, "Paris", "Capital");
        rooms[2] = new Room(100, 800, 2, "Dubai", "The Dubai Hotel");
        rooms[3] = new Room(425, 520, 4, "Kyiv", "President Hotel");
        rooms[4] = new Room(536, 100, 2, "Kyiv", "Hyyatt");
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
