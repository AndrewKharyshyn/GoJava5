package Module_5;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        DAO daoImpl = new DAOImpl();
        Room room1 = new Room(258, 150, 3, "Taiwan", "Taibei");

        System.out.println("Search rooms result:");

        controller.requestRooms(1500, 1, "London", "Tower");
        controller.requestRooms(500, 1, "Plaza", "New York");
        controller.requestRooms(250, 1, "Kyiv", "Hyyatt");
        System.out.println();

        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();

        System.out.println("Check results:");

        controller.check(api1, api2);

        daoImpl.save(room1);
        daoImpl.delete(room1);
        daoImpl.update(room1);
        daoImpl.findById(789);
    }
}
