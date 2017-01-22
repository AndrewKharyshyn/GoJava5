package FinalProjectCore;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {

    AbstractDAO abstractDAOImpl = new AbstractDAOImpl();

    private Scanner scanner = new Scanner(System.in);

    private String getUserInput(String promptMessage, String errorMessage) {
        System.out.println(promptMessage);
        String userInput = scanner.nextLine();
        while (userInput.isEmpty()) {
            System.out.println(errorMessage);
            userInput = scanner.nextLine();
        }
        return userInput;
    }

    void systemEnter() {
        System.out.println("Welcome to the Hotel Booking System!");
        System.out.println("====================================");
        System.out.println();
        String s1 = getUserInput("Please, input your name...", "Name can not be left blank. Please, input again...");
        String s2 = getUserInput("Please, input your last name...", "Last name can not be left blank. Please, input again...");

        List<User> users = abstractDAOImpl
                .getUserList()
                .stream()
                .filter(u -> u.getUserName().equals(s1) && u.getUserLastName().equals(s2))
                .collect(Collectors.toList());

        System.out.println(users);

        if (users == null) {
            System.out.println("User does not exist. Please, register your account to enable search");
            System.out.println("Redirecting to the registration server...");
            newUser();
        }
        if (users != null) {
            System.out.println("User " + s1 + " " + s2 + " has been logged in.");
            actionSelect();
        }
    }

    void newUser() {
        System.out.println("User's sign up system");
        System.out.println("Please, enter your name...");

        String s1 = getUserInput("Please, input your name...", "Name can not be left blank. Please, input again...");
        String s2 = getUserInput("Please, input your last name...", "Last name can not be left blank. Please, input again...");

        User newUser = new User(findNewUserID(), s1, s2); //Creating new User
        abstractDAOImpl.getUserList().add(newUser);//Adding new User to the user list
    }

    long findNewUserID() {//Used to find the user's max ID in the list
        int max = abstractDAOImpl.getUserList().size();
        return max + 1;
    }

    void actionSelect() {
        System.out.println("Please, choose the required search type in menu below:");
        System.out.println("\t1. Search by hotel name." +
                "\n\t2. Search hotel by city" +
                "\n\t3. Search room by parameters");
        Integer s = scanner.nextInt();
        switch (s) {
            case 1:
                System.out.println("Please, enter the hotel name...");
                String s1 = scanner.nextLine();
                findHotelByName(s1);
                break;
            case 2:
                System.out.println("Please, enter the city...");
                String s2 = scanner.nextLine();
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
        List<Hotel> foundHotels = abstractDAOImpl.getHotels()
                .stream()
                .filter(m -> m.getHotelName().equals(name))
                .collect(Collectors.toList());
       // hotelMap(foundHotels, "hotel");
        return foundHotels;
    }

    List<Hotel> findHotelByCity(String city) {
        List<Hotel> foundHotels = abstractDAOImpl.getHotels()
                .stream()
                .filter(m -> m.getCity().equals(city))
                .collect(Collectors.toList());
       // hotelMap(foundHotels, "city");
        return foundHotels;
    }

//    Map<String, String> hotelMap(List<Hotel> searchRes, String searchType) {
//        Map<String, String> hotelsMap = searchRes
//                .stream()
//                .collect(Collectors.toMap("s", searchType));
//        return hotelsMap;
//    }

    void bookRoom(long roomId, long userId, long hotelId) {

    }

    void cancelReservation(long roomId, long userId, long hotelId) {

    }


    //        System.out.println(params);
//        System.out.println("To find rooms, please, choose the city...");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        List<String> filteredByCity = params
//                .keySet()
//                .stream()
//                .filter(c -> c.equals(s))
//                .collect(Collectors.toList());
//        List<Room> foundRooms = abstractDAOImpl.getHotels()
//                .stream()
//                .filter(m -> m.getHotelName())
//                .collect(Collectors.toList());
//        return foundRooms;
//
//        System.out.println(foundRooms);
//        System.out.println("Please, choose the next step...");
//        System.out.println("\t1. Book room from the list above." +
//                "\n\t2. Filter room by parameters.");
//        Scanner var = new Scanner(System.in);
//        int select = var.nextInt();
//        if (select != 1 || select != 2) {
//            System.out.println("Selected incorrect variant. Please, try again...");
//        }
    List<Room> findRoom(Map<String, String> params) {
        Collection<Hotel> hotels = abstractDAOImpl.getHotels();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            switch (entry.getKey()) {
                case "city":
                    hotels.stream().filter(h -> h.getCity().equals(entry.getValue()));
                    break;
                case "hotel":
                    hotels.stream().filter(h -> h.getHotelName().equals(entry.getValue()));
                    break;
            }
        }
        return null;

//        List<Room> rooms = new ArrayList<>();
//        hotels.stream().forEach(h -> rooms.addAll(h.getRooms()));
//        for (Map.Entry<String, String> entry : params.entrySet()) {
//            switch (entry.getKey()) {
//                case "city":
//                    hotels.stream().filter(h -> h.getCity().equals(entry.getValue()));
//                    break;
//                case "hotel":
//                    hotels
//                            .stream()
//                            .filter(h -> h.getHotelName().equals(entry.getValue()));
//                    break;
//            }
//        }
//        return rooms;


//    List<Room> findRoomByParams(List<Room> roomList) {
//        System.out.println("You can filter rooms by parameters here:");
//
//
//        return;
//
//    }
    }
}

