package FinalProjectCore;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {

    AbstractDAO abstractDAOImpl = new AbstractDAOImpl();

    private Scanner scanner = new Scanner(System.in);
    boolean isLoggedIn = false;

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
        String s1 = getUserInput("Please, input your name...", "Name can not be left blank. Please, input again...");
        String s2 = getUserInput("Please, input your last name...", "Last name can not be left blank. Please, input again...");

        List<User> users = abstractDAOImpl.getUsers()
                .stream()
                .filter(u -> u.getUserName().equals(s1) && u.getUserLastName().equals(s2))
                .collect(Collectors.toList());

        if (users.isEmpty()) {
            System.out.println("User does not exist. Please, register your account to enable search");
            System.out.println("Redirecting to the registration server...");
            System.out.println("====================================");
            newUser();
        }
        if (!users.isEmpty()) {
            System.out.println("User " + s1 + " " + s2 + " has been logged in.");
            isLoggedIn = true;
            actionSelect();
        }
    }

    void newUser() {
        System.out.println("User's sign up system");

        String s1 = getUserInput("Please, input your name...", "Name can not be left blank. Please, input again...");
        String s2 = getUserInput("Please, input your last name...", "Last name can not be left blank. Please, input again...");

        User newUser = new User(findNewUserID(), s1, s2); //Creating new User
        System.out.println("User's number:" + findNewUserID());
        abstractDAOImpl.getUsers().add(newUser);//Adding new User to the user list
        System.out.println(abstractDAOImpl.getUsers());
        System.out.println("New user " + s1 + " " + s2 + " has been registered successfully!");
        isLoggedIn = true;
        actionSelect();
    }

    long findNewUserID() {//Used to find the user's max ID in the list
        int max = abstractDAOImpl.getUsers().size();
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
        //outputMap(foundHotels, "hotel");
        return foundHotels;
    }

    List<Hotel> findHotelByCity(String city) {
        List<Hotel> foundHotels = abstractDAOImpl.getHotels()
                .stream()
                .filter(m -> m.getCity().equals(city))
                .collect(Collectors.toList());
        //outputMap(foundHotels, "city");
        return foundHotels;
    }

//    Map<String, String> outputMap(List<Hotel> searchRes, String searchType) {
//
//        Map<String, String> hotelsMap = searchRes
//                .stream()
//                .collect(Collectors.toMap(Hotel::getHotelName, searchType));
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
        //  findRoomByParams();
        return null;
    }

    List<Room> findRoomByParams(List<Room> roomList) {
        System.out.println("You can filter rooms by parameters here:");
        System.out.println("Please, enter the required points where necessary:"
                + "\n\t1. Number of persons."
                + "\n\t2. Price."
                + "\n\t3. Additional services in the room (Please, enter 'Y' or 'N')");
        String s1 = scanner.nextLine(); //persons
        String s2 = scanner.nextLine();//price
        String s3 = scanner.nextLine();//services

        int s1Num = Integer.parseInt(s1);
        int s2Num = Integer.parseInt(s2);

        switch (s3) {
            case "Y":
                boolean s3Bool = Boolean.parseBoolean("true");
                break;
            case "N":
                s3Bool = Boolean.parseBoolean("false");
                break;
        }

        List<Room> finalRes = roomList
                .stream()
                .filter(m -> m.getPersons() <= s1Num || s1Num == 0
                        && m.getPrice() <= s2Num
                        && m.isHasAdditionalService())
                .collect(Collectors.toList());

        return null;
    }

    void logInCheck(boolean isLoggedIn) {
        if (!isLoggedIn) {
            System.out.println("User not registered." +
                    "\n\tDo you want to continue?" +
                    "\n\tPress 'Y' to register or press 'N' to exit.");
            String input = scanner.nextLine();
            while (input.isEmpty() || !input.equals("N") || !input.equals("Y")) {
                System.out.println("Please, choose the correct variant");
                input = scanner.nextLine();
            }
            if (input.equals("Y")) {
                newUser();
            }
            if (input.equals("N")) {
                System.out.println("Thank you for using Book Online System!");
                System.exit(1);
            }
        }
    }
}

