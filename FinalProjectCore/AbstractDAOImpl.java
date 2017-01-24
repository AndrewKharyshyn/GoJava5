package FinalProjectCore;

import java.util.*;

public class AbstractDAOImpl implements AbstractDAO {

    //Here are the predefined lists
    private List<User> userList = new ArrayList<>();
    private List<Room> roomsHotel1 = new ArrayList<>();
    private List<Room> roomsHotel2 = new ArrayList<>();
    private List<Room> roomsHotel3 = new ArrayList<>();
    private List<Hotel> hotels = new ArrayList<>();

    //Adding predefined users to the list
    @Override
    public void addUsersToDB() {
        User user1 = new User(1, "Alex", "Melnikov");
        User user2 = new User(2, "Olga", "Safonova");
        User user3 = new User(3, "Oleg", "Petrov");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    //Copying the user list to other list
    @Override
    public List<User> getUsers() {
        ArrayList<User> res = new ArrayList<User>(userList);
        return res;
    }

    @Override
    public void addingNewUser(User user) {
        userList.add(user);
    }

    //Creating the random rooms
    private int roomId = 0;
    private Random random = new Random();

    @Override
    public Room generateRoom(int hotelID) {
        double price = random.nextInt(5001);
        return new Room(++roomId, random.nextInt(5),
                price, hotelID,
                random.nextBoolean(),
                random.nextDouble(),
                null);
    }

    //Adding random rooms to the lists by loop
    @Override
    public void addUserRoom() {
        for (int i = 0; i < 10; i++) {
            roomsHotel1.add(generateRoom(1));
            roomsHotel2.add(generateRoom(2));
            roomsHotel3.add(generateRoom(3));
        }
    }

    //Creating hotel objects with lists inside
    Hotel hotel1 = new Hotel(1, "President Hotel", "Kyiv", roomsHotel1);
    Hotel hotel2 = new Hotel(2, "Hyatt", "Odesa", roomsHotel2);
    Hotel hotel3 = new Hotel(3, "Hyatt", "Istanbul", roomsHotel3);

    //Merging hotels into one list
    @Override
    public void addHotels() {
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
    }

    //Copying hotel lists
    @Override
    public List<Hotel> getHotels() {
        ArrayList<Hotel> res = new ArrayList<Hotel>(hotels);
        return res;
    }
}

