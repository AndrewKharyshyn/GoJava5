package FinalProjectCore;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Controller {

    AbstractDAOImpl abstractDAOImpl = new AbstractDAOImpl();

    void systemEnter() {
        System.out.println("Welcome to the Hotel Booking System!");
        System.out.println("====================================");
        System.out.println();
        System.out.println("Please, input your name...");
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        System.out.println("Please, input your last name...");
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();

        List<User> users = abstractDAOImpl
                .userList
                .stream()
                .filter(u -> u.getUserName().equals(sc1) && u.getUserLastName().equals(sc2))
                .collect(Collectors.toList());

        if (users == null) {
            System.out.println("User does not exist. Please, register  your account to enable search");
            newUser();
        }
        if (users != null) {
            System.out.println("User " + s1 + " " + s2 + " has been logged in.");
            actionSelect();
        }
    }

    void newUser() {


    }

    void actionSelect() {

    }

    List<Hotel> findHotelByName(String name) {


        return null;//Check return type

    }

    List<Hotel> findHotelByCity(String city) {

        return null;//Check return type
    }

    void bookRoom(long roomId, long userId, long hotelId) {

    }

    void cancelReservation(long roomId, long userId, long hotelId) {

    }

    List<Room> findRoom(Map<String, String> params) {

        return null;
    }
}
