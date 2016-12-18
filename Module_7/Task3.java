package Module_7;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        Currency currency1 = Currency.getInstance("UAH");
        Currency currency2 = Currency.getInstance("USD");

        System.out.println("=================================================");

        User user1 = new User(1, "Andriy", "Mykhailov", "Kyiv", 1700);
        User user2 = new User(2, "Olksandr", "Filonenko", "Vinnytsia", 1050);
        User user3 = new User(3, "Dmytro", "Sevruk", "Odesa", 780);
        User user4 = new User(4, "Inna", "Kulyk", "Poltava", 100);
        User user5 = new User(5, "Volodymyr", "Petrov", "Kyiv", 4850);
        User user6 = new User(6, "Iryna", "Melnykova", "Rivne", 525);
        User user7 = new User(6, "Iryna", "Melnykova", "Rivne", 525);
        User user8 = new User(8, "Oleksiy", "Ivanov", "Dnipro", 18500);
        User user9 = new User(9, "Andriy", "Ivashchenko", "Kyiv", 490);
        User user10 = new User(10, "Viktor", "Sobko", "Odesa", 7210);

        Order order1 = new Order(1, 1520, currency1, "Guitar", "Rozetka", user1);
        Order order2 = new Order(2, 80, currency2, "Lenovo A440", "Fotos", user2);
        Order order3 = new Order(3, 550, currency1, "Microphone Philips", "Rozetka", user3);
        Order order4 = new Order(4, 150, currency1, "DDR4 memory", "Allo", user4);
        Order order5 = new Order(4, 150, currency1, "DDR4 memory", "Allo", user4);
        Order order6 = new Order(6, 1200, currency2, "Windshield", "Avtozvuk", user6);
        Order order7 = new Order(7, 150, currency2, "Coffee machine Delonghi", "Fotos", user7);
        Order order8 = new Order(8, 2250, currency1, "Auto player Kenwood", "Avtozvuk", user8);
        Order order9 = new Order(9, 400, currency2, "Photo camera Canon", "Rozetka", user9);
        Order order10 = new Order(10, 6500, currency1, "Phone iPhone S6", "Allo", user10);

        Set<User> userSet = new TreeSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);
        userSet.add(user6);
        userSet.add(user7);
        userSet.add(user8);
        userSet.add(user9);
        userSet.add(user10);

        SortedSet<Order> orderSet = new TreeSet<>(new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                }
                if (o2.getPrice() < o1.getPrice()) {
                    return 1;
                }
                return 0;
            }
        });

        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order4);
        orderSet.add(order5);
        orderSet.add(order6);
        orderSet.add(order7);
        orderSet.add(order8);
        orderSet.add(order9);
        orderSet.add(order10);

        for (Order i : orderSet) {
            System.out.println("Order ID: " + i.getId() + " Price: " + i.getPrice() +
                    " Item: " + i.getItemName());
        }
        System.out.println("=================================================");
        for (User i : userSet) {
            System.out.println("User ID: " + i.getId() + " Name: " + i.getFirstName() +
                    " Last name: " + i.getLastName());
        }

        System.out.println("=================================================");
        System.out.println("Searching for surname 'Petrov'...");

        boolean found = false;
        Iterator<Order> iterator = orderSet.iterator();
        while (iterator.hasNext()) {
            Order o = iterator.next();
            if (o.getUser().getLastName().equals("Petrov")) {
                found = true;
            }
        }
        if (found) {
            System.out.println("The Order List contains user 'Petrov'");
        } else {
            System.out.println("No 'Petrov'");
        }

        System.out.println("=================================================");
        System.out.println("Order with largest price: ");
        System.out.println("ID: " + orderSet.last().

                getId()

                + ". Price: " + orderSet.last().

                getPrice()

                + " " + orderSet.last().

                getCurrency()

        );

        System.out.println("=================================================");
        System.out.println("Orders in UAH only: ");

        Iterator<Order> iterator2 = orderSet.iterator();
        while (iterator2.hasNext())

        {
            Order o = iterator2.next();
            if (o.getCurrency().equals(Currency.getInstance("USD"))) {
                iterator2.remove();
            }
        }

        for (
                Order i
                : orderSet)

        {
            System.out.println("Order ID: " + i.getId() + " Price: " + i.getPrice() +
                    " " + i.getCurrency());
        }
    }
}

