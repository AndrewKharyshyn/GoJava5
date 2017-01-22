package FinalProjectCore;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        AbstractDAO abstractDAOImpl = new AbstractDAOImpl();

        abstractDAOImpl.addHotels();
       // abstractDAOImpl.addUserRoom();
        abstractDAOImpl.addUserTable();

        controller.systemEnter();

    }
}
