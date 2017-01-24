package FinalProjectCore;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {

    AbstractDAO abstractDAOImpl = new AbstractDAOImpl();

    Scanner scanner = new Scanner(System.in);

    //Method used for scanning input data
    private String getUserInput(String promptMessage, String errorMessage) {
        System.out.println(promptMessage);
        String userInput = scanner.nextLine();
        while (userInput.isEmpty() || userInput.length() < 4) {
            System.out.println(errorMessage);
            userInput = scanner.nextLine();
        }
        return userInput;
    }

    //Entrance to the system
    void systemEnter() {
        abstractDAOImpl.addUserRoom();
        abstractDAOImpl.addHotels();
        abstractDAOImpl.addUsersToDB();

        System.out.println("Welcome to the Hotel Online Booking System!" +
                "\n====================================");
        String s1 = getUserInput("\tPlease, enter your name...", "\tField is blank or less then 4 symbols. Please, input again...");
        String s2 = getUserInput("\tPlease, enter your last name...", "\tField is blank or less then 4 symbols. Please, input again...");

        //Checking if user exists in the system
        List<User> users = abstractDAOImpl.getUsers()
                .stream()
                .filter(u -> u.getUserName().contains(s1) && u.getUserLastName().contains(s2))
                .collect(Collectors.toList());

        if (users.isEmpty()) {
            System.out.println("User does not exist. Please, register your account to enable search" +
                    "\n\tRedirecting to the registration server..." +
                    "\n\t====================================");
            createNewUser();
        }
        if (!users.isEmpty()) {
            System.out.println("User " + s1 + " " + s2 + " has been logged in.");
            actionSelect(true);
        }
    }

    //Signing up new user (if does not exists yet)
    private void createNewUser() {
        System.out.println("\tUser's sign up system" +
                "\n\t====================================");

        String s1 = getUserInput("\tPlease, enter your name...", "\tField is blank or less then 4 symbols. Please, input again...");
        String s2 = getUserInput("\tPlease, enter your last name...", "\tField is blank or less then 4 symbols. Please, input again...");

        User newUser = new User(findNewUserID(), s1, s2); //Creating new User

        abstractDAOImpl.addingNewUser(newUser);//Adding new User to the user list
        System.out.println("New user " + s1 + " " + s2 + " has been registered successfully!" +
                "\n\tNow you can proceed to Room Search System..." +
                "\n");
        actionSelect(true);
    }

    //Used to find the user's max ID in the user list
    private long findNewUserID() {
        return abstractDAOImpl.getUsers().size() + 1;
    }

    //Menu to select further user's search action
    private void actionSelect(boolean isLoggedIn) {

        System.out.println("Please, choose the required search type in the menu below:" +
                "\n\t1. Search by hotel name;" +
                "\n\t2. Search hotel by city.");

        try {
            Integer s = scanner.nextInt();
            switch (s) {
                case 1:
                    String s1 = getUserInput("Please, enter the hotel name...", "The field is blank or less than 4 symbols. Please, enter your request.");
                    findHotelByName(s1);
                    break;
                case 2:
                    String s2 = getUserInput("Please, enter the city name...", "The field is blank or less than 4 symbols. Please, enter your request.");
                    findHotelByCity(s2);
                    break;
                default:
                    System.out.println("You have entered incorrect number. Please, retry...");
                    actionSelect(true);
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("You have to enter choice from 1 to 3. Retry selection...");
            actionSelect(true);
        } catch (Exception e) {
            System.err.println("XP");
        }
    }

    //Searching the hotel by its name
    private List<Hotel> findHotelByName(String name) {
        List<Hotel> foundHotels = abstractDAOImpl.getHotels()
                .stream()
                .filter(m -> m.getHotelName().contains(name))
                .collect(Collectors.toList());
        if (foundHotels.isEmpty()) {
            System.out.println("Hotels with name '" + name + "' not found. Please, check spelling and retry.");
            actionSelect(true);
        }
        if (!foundHotels.isEmpty()) {
            System.out.println("List of hotels available:");
            foundHotels.forEach(c -> System.out.println("Hotel '" + c.getHotelName() + "'" + " /" + c.getCity() + "/"));

            System.out.println("Please, press Enter to show rooms in this hotel...");
            String enterKey = scanner.nextLine();

            System.out.println("Rooms available in this hotel:");
            foundHotels.forEach(c -> System.out.println("Rooms:" + c.getRooms()));
        }
        return foundHotels;
    }

    //Searching hotels by its city
    private List<Hotel> findHotelByCity(String city) {
        List<Hotel> foundHotels = abstractDAOImpl.getHotels()
                .stream()
                .filter(m -> m.getCity().contains(city))
                .collect(Collectors.toList());
        if (foundHotels.isEmpty()) {
            System.out.println("Hotels in '" + city + "' not found. Please, check information and retry.");
            actionSelect(true);
        }
        if (!foundHotels.isEmpty()) {
            System.out.println("List of hotels available in " + city);
            foundHotels.forEach(c -> System.out.println("Hotel '" + c.getHotelName() + "'"));

            System.out.println("Please, press ENTER to show rooms in these hotels...");
            String enterKey = scanner.nextLine();

            System.out.println("Rooms in '" + city + "':");
            foundHotels.forEach(c -> System.out.println("Rooms:" + c.getRooms()));

            variantSelect();

            Map<String, String> byCityParam = new HashMap<>();
            byCityParam.put("byCity", )
        }
        return foundHotels;
    }

    private void variantSelect() {
        System.out.println("Do you want to book the room by number?" +
                "\n\t1. Book the room" +
                "\n\t2. Go to search by parameters");
        Integer input = scanner.nextInt();
        while (input == null || input != 1 || input != 2) {
            System.out.println("Please, choose the correct variant!");
            input = scanner.nextInt();
        }
        switch (input) {
            case 1:
                System.out.println("Enter room number from the list");
                Integer roomNumberInput = scanner.nextInt();
                while (roomNumberInput == null) {
                    System.out.println("Please, choose the room from the list");
                    roomNumberInput = scanner.nextInt();
                }
                if ()
                bookRoom();
            case 2:
                findRoomByParams();
        }

    }

    //Booking selected room
    private void bookRoom(long roomId, long userId, long hotelId) {

    }

    //Cancelling reservation of the selected room
    private void cancelReservation(long roomId, long userId, long hotelId) {

    }

    //Searching rooms by cities or hotels
    private List<Room> findRooms(Map<String, String> params) {
        for (Map.Entry<String, String> entry : params.entrySet()) {
            switch (entry.getKey()) {
                case "byCity":
                    hotels
                            .stream()
                            .filter(h -> h.getCity().equals(entry.getValue()))
                            .collect(Collectors.toList());
                    break;
                case "byHotel":
                    hotels
                            .stream()
                            .filter(h -> h.getHotelName().equals(entry.getValue()))
                            .collect(Collectors.toList());
                    break;
            }
        }
        //   findRoomByParams(Map.Entry);
        return null;
    }

    //Parametrized search of the rooms
    private Map<String, String> findRoomByParams(List<Room> roomList) {
        System.out.println("You can filter rooms by parameters here:" +
                "\nPlease, enter the required points where necessary:"
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

    private void logInCheck(boolean isLoggedIn) {
        if (!isLoggedIn) {
            System.out.println("User not registered." +
                    "\n\tDo you want to continue?" +
                    "\n\tPress 'Y' to register or press 'N' to exit.");
            String input = scanner.nextLine();
            while (input.isEmpty() || !input.equals("N") || !input.equals("Y")) {
                System.out.println("Please, choose the correct variant!");
                input = scanner.nextLine();
            }
            if (input.equals("Y")) {
                createNewUser();
            }
            if (input.equals("N")) {
                System.out.println("Thank you for using Book Online System!");
                System.exit(0);
            }
        }
    }

}

