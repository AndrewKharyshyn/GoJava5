package FinalProjectCore;

public class Room {
    private long roomId;
    private int persons;
    private long price;
    private long hotelId;
    private boolean hasAdditionalService;
    private long discount;
    private User userReserved;

    public Room(long roomId, int persons, long price, long hotelId, boolean hasAdditionalService, long discount, User userReserved) {
        this.roomId = roomId;
        this.persons = persons;
        this.price = price;
        this.hotelId = hotelId;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public boolean isHasAdditionalService() {
        return hasAdditionalService;
    }

    public void setHasAdditionalService(boolean hasAdditionalService) {
        this.hasAdditionalService = hasAdditionalService;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public User getUserReserved() {
        return userReserved;
    }

    public void setUserReserved(User userReserved) {
        this.userReserved = userReserved;
    }
}
