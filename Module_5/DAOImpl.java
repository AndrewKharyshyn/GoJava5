package Module_5;

public class DAOImpl implements DAO {

    public Room save(Room room) {
        System.out.println("Saved: " + room);
        return room;
    }

    public boolean delete(Room room) {
        System.out.println("Deleted: " + room);
        return true;
    }

    public Room update(Room room) {
        System.out.println("Updated: " + room);
        return room;
    }

    public Room findById(long id) {
        System.out.println("Found: " + id);
        return null;
    }
}
