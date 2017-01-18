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
}
