package Module_5;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        DAOImpl daoImpl = new DAOImpl();

        controller.requestRooms(200, 2, "London", "Tower");
        controller.requestRooms(180, 2, "Shanghai", "Sky Tower");
        controller.requestRooms(100, 1, "Kyiv", "President Hotel");
        System.out.println();

        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();

        controller.check(api1, api2);
        //daoImpl.save();
        //daoImpl.delete();
        //daoImpl.update();
        //daoImpl.findById(789);
    }
}
