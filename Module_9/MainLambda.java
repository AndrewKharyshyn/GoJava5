package Module_9;

import java.util.*;
import java.util.stream.Collectors;

public class MainLambda {
    public static void main(String[] args) {

        Currency currency1 = Currency.getInstance("UAH");
        Currency currency2 = Currency.getInstance("USD");

        System.out.println("=================================================");

        UserLambda user1 = new UserLambda(1, "Andriy", "Mykhailov", "Kyiv", 1700);
        UserLambda user2 = new UserLambda(2, "Olksandr", "Filonenko", "Vinnytsia", 1050);
        UserLambda user3 = new UserLambda(3, "Dmytro", "Sevruk", "Odesa", 780);
        UserLambda user4 = new UserLambda(4, "Inna", "Kulyk", "Poltava", 100);
        UserLambda user5 = new UserLambda(5, "Volodymyr", "Sobko", "Kyiv", 4850);
        UserLambda user6 = new UserLambda(6, "Iryna", "Melnykova", "Rivne", 525);
        UserLambda user7 = new UserLambda(7, "Viktor", "Kryvobok", "Lviv", 2200);
        UserLambda user8 = new UserLambda(8, "Oleksiy", "Ivanov", "Dnipro", 18500);
        UserLambda user9 = new UserLambda(9, "Andriy", "Ivashchenko", "Kyiv", 490);
        UserLambda user10 = new UserLambda(10, "Viktor", "Petrov", "Odesa", 7210);

        OrderLambda order1 = new OrderLambda(1, 1520, currency1, "Guitar", "Rozetka", user1);
        OrderLambda order2 = new OrderLambda(2, 80, currency2, "Lenovo A440", "Fotos", user2);
        OrderLambda order3 = new OrderLambda(3, 550, currency1, "Microphone Philips", "Rozetka", user3);
        OrderLambda order4 = new OrderLambda(4, 150, currency1, "DDR4 memory", "Allo", user4);
        OrderLambda order5 = new OrderLambda(4, 150, currency1, "DDR4 memory", "Allo", user4);
        OrderLambda order6 = new OrderLambda(6, 1200, currency2, "Windshield", "Avtozvuk", user6);
        OrderLambda order7 = new OrderLambda(7, 150, currency2, "Coffee machine Delonghi", "Fotos", user7);
        OrderLambda order8 = new OrderLambda(8, 2250, currency1, "Auto player Kenwood", "Avtozvuk", user8);
        OrderLambda order9 = new OrderLambda(9, 400, currency2, "Photo camera Canon", "Rozetka", user9);
        OrderLambda order10 = new OrderLambda(10, 6500, currency1, "Phone iPhone S6", "Allo", user10);

        List<UserLambda> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);

        List<OrderLambda> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        orderList.add(order7);
        orderList.add(order8);
        orderList.add(order9);
        orderList.add(order10);

        System.out.println("Order list sorted by price (desc.):");
        orderList.sort((OrderLambda o1, OrderLambda o2) -> o1.getPrice() - o2.getPrice());
        orderList.forEach(o -> System.out.println("\t" + "Order ID: " + o.getId() + " Price: " + o.getPrice() +
                " Item: " + o.getItemName()));

        System.out.println("=================================================");

        System.out.println("Order list sorted by price (asc.) and user's city:");
        orderList.sort((OrderLambda o1, OrderLambda o2) -> o2.getPrice() - o1.getPrice());
        orderList.sort((OrderLambda o1, OrderLambda o2) -> o1.getUserLambda().getCity().compareTo(o2.getUserLambda().getCity()));
        orderList.forEach(o -> System.out.println("\t" + "Order ID: " + o.getId() + " Price: " + o.getPrice() +
                " User: " + o.getUserLambda().getLastName() + " User's city: " + o.getUserLambda().getCity()));

        System.out.println("=================================================");

        System.out.println("Order list sorted by item name, by shop and user's city:");
        orderList.sort((OrderLambda o1, OrderLambda o2) -> o1.getItemName().compareTo(o2.getItemName()));
        orderList.sort((OrderLambda o1, OrderLambda o2) -> o1.getShopIdentificator().compareTo(o2.getShopIdentificator()));
        orderList.sort((OrderLambda o1, OrderLambda o2) -> o1.getUserLambda().getCity().compareTo(o2.getUserLambda().getCity()));

        orderList.forEach(o -> System.out.println("\t" + "Order ID: " + o.getId() + " Shop: " + o.getShopIdentificator() +
                " Item name: " + o.getItemName() +
                " User's city: " + o.getUserLambda().getCity()));

        System.out.println("=================================================");

        System.out.println("Order list without duplicated items:");

        List<OrderLambda> orderLambdaStream = orderList
                .stream()
                .sorted(Comparator.comparing(OrderLambda::getId))
                .distinct()
                .collect(Collectors.toList());

        orderLambdaStream.forEach(o -> System.out.println("\t" + "Order ID: " + o.getId() + " Shop: " + o.getShopIdentificator() +
                " Item name: " + o.getItemName() +
                " User's city: " + o.getUserLambda().getCity()));

        System.out.println("=================================================");

        System.out.println("Order list with prices over 1500:");
        List<OrderLambda> orderLambdaStream2 = orderList
                .stream()
                .filter((price) -> price.getPrice() > 1500)
                .collect(Collectors.toList());

        orderLambdaStream2.forEach(o -> System.out.println("\t" + "Order ID: " + o.getId() + " Price: " + o.getPrice() +
                " Item name: " + o.getItemName()));

        System.out.println("=================================================");

        System.out.println("Separated orders (USD/UAH):");

        List<OrderLambda> listUAH = orderList
                .stream()
                .filter(u -> u.getCurrency().equals(Currency.getInstance("UAH")))
                .collect(Collectors.toList());

        System.out.println("UAH order list:");

        listUAH.forEach(o -> System.out.println("\t" + "Order ID: " + o.getId() +
                " Item Name: " + o.getItemName() + " Price: " + o.getPrice() + " " + o.getCurrency()));

        List<OrderLambda> listUSD = orderList
                .stream()
                .filter(u -> u.getCurrency().equals(Currency.getInstance("USD")))
                .collect(Collectors.toList());

        System.out.println("USD order list:");

        listUSD.forEach(o -> System.out.println("\t" + "Order ID: " + o.getId() +
                " Item Name: " + o.getItemName() + " Price: " + o.getPrice() + " " + o.getCurrency()));

        System.out.println("=================================================");
        System.out.println("Order list after USD orders deleted:");

        List<OrderLambda> listUAHOnly = orderList
                .stream()
                .filter(u -> !u.getCurrency().equals(Currency.getInstance("USD")))
                .collect(Collectors.toList());

        listUAHOnly.forEach(o -> System.out.println("\t" + "Order ID: " + o.getId() +
                " Item Name: " + o.getItemName() + " Price: " + o.getPrice() + " " + o.getCurrency()));

        System.out.println("=================================================");
        System.out.println("Searching for surname 'Petrov'...");

        boolean findPetrov = orderList
                .stream()
                .anyMatch(u -> u.getUserLambda().getLastName().equals("Petrov"));
        if (findPetrov) {
            System.out.println("User Petrov has been found in the list");
        } else {
            System.out.println("User Petrov not found");
        }
    }
}

