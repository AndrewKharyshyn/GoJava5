package FinalProjectCore;

public class Room {
    private long roomId;
    private int persons;
    private double price;
    private Hotel hotel;
    private boolean hasAdditionalService;
    private double discount;
    private User userReserved;

    public Room(long roomId, int persons, double price, boolean hasAdditionalService, double discount, User userReserved) {
        this.roomId = roomId;
        this.persons = persons;
        this.price = price;
//        this.hotelId = hotelId;
        this.hasAdditionalService = hasAdditionalService;
        this.discount = discount;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public boolean isHasAdditionalService() {
        return hasAdditionalService;
    }

    public void setHasAdditionalService(boolean hasAdditionalService) {
        this.hasAdditionalService = hasAdditionalService;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public User getUserReserved() {
        return userReserved;
    }

    public void setUserReserved(User userReserved) {
        this.userReserved = userReserved;
    }
}
