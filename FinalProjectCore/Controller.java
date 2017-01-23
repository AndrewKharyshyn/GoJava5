package FinalProjectCore;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {

    AbstractDAO abstractDAOImpl = new AbstractDAOImpl();
    private Scanner scanner = new Scanner(System.in);
    boolean isLoggedIn = false; //Global variable for user log in check

    //Method used for scanning input data
    private String getUserInput(String promptMessage, String errorMessage) {
        System.out.println(promptMessage);
        String userInput = scanner.nextLine();
        while (userInput.isEmpty()) {
            System.out.println(errorMessage);
            userInput = scanner.nextLine();
        }
        return userInput;
    }

    //Entrance to the system
    void systemEnter() {
        System.out.println("Welcome to the Hotel Online Booking System!");
        System.out.println("====================================");
        String s1 = getUserInput("Please, enter your name...", "Name can not be left blank. Please, input again...");
        String s2 = getUserInput("Please, enter your last name...", "Last name can not be left blank. Please, input again...");

        //Checking if user exists in the system
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
            actionSelect(true);
        }
    }

    //Signing up new user (if does not exists yet)
    void newUser() {
        System.out.println("User's sign up system");

        String s1 = getUserInput("Please, enter your name...", "Name can not be left blank. Please, input again...");
        String s2 = getUserInput("Please, enter your last name...", "Last name can not be left blank. Please, input again...");

        User newUser = new User(findNewUserID(), s1, s2); //Creating new User

        //System.out.println("User's number:" + findNewUserID());
        abstractDAOImpl.getUsers().add(newUser);//Adding new User to the user list
        //System.out.println(abstractDAOImpl.getUsers());
        System.out.println("New user " + s1 + " " + s2 + " has been registered successfully!");
        actionSelect(true);
    }

    //Used to find the user's max ID in the user list
    long findNewUserID() {
        int max = abstractDAOImpl.getUsers().size();
        return max + 1;
    }

    //Menu to select further user's search action
    void actionSelect(boolean isLoggedIn) {
        logInCheck(true);

        System.out.println("Please, choose the required search type in menu below:" +
                "\n\t1. Search by hotel name." +
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
                actionSelect(true);
                break;
        }
    }

    //Searching the hotel by its name
    List<Hotel> findHotelByName(String name) {
        List<Hotel> foundHotels = abstractDAOImpl.getHotels()
                .stream()
                .filter(m -> m.getHotelName().equals(name))
                .collect(Collectors.toList());
        //outputMap(foundHotels, "hotel");
        return foundHotels;
    }

    //Searching the hotel by its city
    List<Hotel> findHotelByCity(String city) {
        List<Hotel> foundHotels = abstractDAOImpl.getHotels()
                .stream()
                .filter(m -> m.getCity().equals(city))
                .collect(Collectors.toList());
        //outputMap(foundHotels, "city");
        return foundHotels;
    }

    //Creating Map from hotels or cities
    Map<String, String> outputMap(List<Hotel> searchRes, String searchType) {

        Map<String, String> hotelsMap = searchRes
                .stream()
                .collect(Collectors.toMap(, searchType));
        return hotelsMap;
    }

    //Booking selected room
    void bookRoom(long roomId, long userId, long hotelId) {

    }

    //Cancelling reservation of the selected room
    void cancelReservation(long roomId, long userId, long hotelId) {

    }

    //Searching rooms by cities or hotels
    List<Room> findRoom(Map<String, String> params) {
        Collection<Hotel> hotels = abstractDAOImpl.getHotels();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            switch (entry.getKey()) {
                case "city":
                    hotels
                            .stream()
                            .filter(h -> h.getCity().equals(entry.getValue()))
                            .collect(Collectors.toList());
                    break;
                case "hotel":
                    hotels
                            .stream()
                            .filter(h -> h.getHotelName().equals(entry.getValue()))
                            .collect(Collectors.toList());
                    break;
            }
        }
        findRoomByParams(Map.Entry);
        return null;
    }

    //Parametrized search of the rooms
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
                System.exit(0);
            }
        }
    }
}

