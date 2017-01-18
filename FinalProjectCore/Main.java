package FinalProjectCore;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        AbstractDAOImpl abstractDAOImpl = new AbstractDAOImpl();

        abstractDAOImpl.addHotels();
        abstractDAOImpl.addUserRoom();
        abstractDAOImpl.addUserTable();

        controller.systemEnter();

    }
}
