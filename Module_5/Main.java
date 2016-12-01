package Module_5;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        DAO daoImpl = new DAOImpl();
        Room room1 = new Room(258, 150, 3, "Taiwan", "Taibei");

        controller.requestRooms(1300, 1, "London", "Tower");
        controller.requestRooms(60, 1, "Shanghai", "Sky Tower");
        controller.requestRooms(500, 1, "Kyiv", "President Hotel");
        System.out.println();

        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();

        controller.check(api1, api2);
        daoImpl.save(room1);
        daoImpl.delete(room1);
        daoImpl.update(room1);
        daoImpl.findById(789);
    }
}
