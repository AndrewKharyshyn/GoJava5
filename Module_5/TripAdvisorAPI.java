package Module_5;

import java.util.Arrays;

public class TripAdvisorAPI implements API {

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(1458, 1200, 1, "London", "Tower");
        rooms[1] = new Room(2158, 70, 1, "Paris", "Capital");
        rooms[2] = new Room(3258, 800, 2, "Dubai", "The Dubai Hotel");
        rooms[3] = new Room(4987, 220, 2, "Kyiv", "President Hotel");
        rooms[4] = new Room(5754, 300, 2, "London", "Tower");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundRooms = new Room[rooms.length];
        for (int i = 0, count = 0; i < rooms.length; i++) {
            if (price <= rooms[i].getPrice() && persons >= rooms[i].getPersons() && city.equals(rooms[i].getCityName()) && hotel.equals(rooms[i].getHotelName()));
            foundRooms [count++] = rooms[i];
                    }
        return foundRooms;
    }
}
