package FinalProjectCore;

import sun.security.pkcs11.wrapper.Functions;

import java.util.ArrayList;
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
        System.out.println("Please, choose the required search type in menu below:");
        System.out.println("\t1. Search by hotel name." +
                "\n\t2. Search hotel by city" +
                "\n\t3. Search room by parameters");
        Scanner sc = new Scanner(System.in);
        Integer s = sc.nextInt();
        switch (s) {
            case 1:
                System.out.println("Please, enter the hotel name...");
                Scanner sc1 = new Scanner(System.in);
                String s1 = sc.nextLine();
                findHotelByName(s1);
                break;
            case 2:
                System.out.println("Please, enter the city...");
                Scanner sc2 = new Scanner(System.in);
                String s2 = sc2.nextLine();
                findHotelByCity(s2);
                break;
            case 3:
                //findRoom(abstractDAOImpl.addHotelMap());
                break;
            default:
                System.out.println("You have entered incorrect number. Please, retry...");
                actionSelect();
                break;
        }
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

    /*List<Room> findRoom(Map<String, String> params) {
        System.out.println(params);
        System.out.println("To find rooms, please, choose the city...");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> filteredByCity = params
                .keySet()
                .stream()
                .filter(c -> c.equals(s))
                .collect(Collectors.toList());
        /*List<Room> foundRooms = abstractDAOImpl.hotels
                .stream()
                .filter(m -> m.getHotelName().equals())
                .collect(Collectors.toList());
        return foundRooms;*/
}

