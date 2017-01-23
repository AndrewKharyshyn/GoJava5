package FinalProjectCore;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        AbstractDAO abstractDAOImpl = new AbstractDAOImpl();
        // abstractDAOImpl.addUserRoom();

        abstractDAOImpl.addHotels();

        abstractDAOImpl.addUserTable();

        controller.systemEnter();

    }
}
