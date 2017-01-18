package FinalProjectCore;

import Module_6.*;

public class Room {
   private long roomId;
    private int persons;
    private long price;
    private int hotelId;
    private User userReserved;

    public Room(int hotelId, long roomId, int persons, long price, User userReserved) {
        this.hotelId = hotelId;
        this.roomId = roomId;
        this.persons = persons;
        this.price = price;
        this.userReserved = userReserved;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public User getUserReserved() {
        return userReserved;
    }

    public void setUserReserved(User userReserved) {
        this.userReserved = userReserved;
    }
}
