package Module_5;

public class TripAdvisorAPI implements API {

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(1458, 1200, 1, "Tower", "London");
        rooms[1] = new Room(2158, 70, 1, "Capital", "Paris");
        rooms[2] = new Room(3258, 800, 2, "The Dubai Hotel", "Dubai");
        rooms[3] = new Room(4987, 220, 2, "President Hotel", "Kyiv");
        rooms[4] = new Room(110, 80, 1, "Capital", "Paris");
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
