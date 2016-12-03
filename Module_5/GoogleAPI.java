package Module_5;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(581, 100, 1, "Beijing International Hotel", "Beijing");
        rooms[1] = new Room(482, 75, 1, "New Canada", "Toronto");
        rooms[2] = new Room(453, 435, 1, "Plaza", "New York");
        rooms[3] = new Room(421, 520, 4, "President Hotel", "Kyiv");
        rooms[4] = new Room(578, 100, 2, "Hyyatt", "Kyiv");
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
