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
        this.hasAdditionalService = hasAdditionalService;
        this.discount = discount;
        this.userReserved = userReserved;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", persons=" + persons +
                ", price=" + price +
                ", hotel=" + hotel +
                ", hasAdditionalService=" + hasAdditionalService +
                ", discount=" + discount +
                ", userReserved=" + userReserved +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (roomId != room.roomId) return false;
        if (persons != room.persons) return false;
        if (Double.compare(room.price, price) != 0) return false;
        if (hasAdditionalService != room.hasAdditionalService) return false;
        if (Double.compare(room.discount, discount) != 0) return false;
        if (!hotel.equals(room.hotel)) return false;
        return userReserved != null ? userReserved.equals(room.userReserved) : room.userReserved == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (roomId ^ (roomId >>> 32));
        result = 31 * result + persons;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + hotel.hashCode();
        result = 31 * result + (hasAdditionalService ? 1 : 0);
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (userReserved != null ? userReserved.hashCode() : 0);
        return result;
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
