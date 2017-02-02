package Module_10_3;

public class MainClass {

    public static void main(String[] args) {
        Cars sportsCar = null;
        try {
           editCarParams(sportsCar);
        }
        catch (NullPointerException e){
            System.err.println("Operations with NULL objects are prohibited!");
        }
    }

    public static void editCarParams(Cars car)throws NullPointerException {
        car.setMaxSpeed(260);
        car.setPassengers(2);
        car.setType("WRC");
    }
}
