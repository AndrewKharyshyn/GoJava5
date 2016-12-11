package Module_7;

import java.util.*;

public class Main {

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
        User user7 = new User(7, "Viktor", "Kryvobok", "Lviv", 2200);
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

        List<User> userList = new ArrayList<>();
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

        List<Order> orderList = new ArrayList<>();
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
        CompareByPrice byPrice = new CompareByPrice();
        Collections.sort(orderList, byPrice);

        for (Order i : orderList) {
            System.out.println("Order ID: " + i.getId() + " Price: " + i.getPrice() +
                    " Item: " + i.getItemName());
        }
        System.out.println("=================================================");

        System.out.println("Order list sorted by price (asc.) and user's city:");
        CompareByCity byCity = new CompareByCity();
        Collections.sort(orderList, byCity);

        Collections.sort(orderList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int price1 = o1.getPrice();
                int price2 = o2.getPrice();

                if (price1 > price2) {
                    return 1;
                }
                if (price2 > price1) {
                    return -1;
                }
                return 0;
            }
        });

        for (Order i : orderList) {
            System.out.println("Order ID: " + i.getId() + " Price: " + i.getPrice() +
                    " User: " + i.getUser().getLastName() + " User's city: " + i.getUser().getCity());
        }
        System.out.println("=================================================");

        System.out.println("Order list sorted by item name, by shop and user's city:");
        CompareByItem byItemName = new CompareByItem();
        CompareByShop byShop = new CompareByShop();
        Collections.sort(orderList, byItemName);
        Collections.sort(orderList, byShop);
        Collections.sort(orderList, byCity);
        for (Order i : orderList) {
            System.out.println("Order ID: " + i.getId() + " Shop: " + i.getShopIdentificator() +
                    " Item name: " + i.getItemName() +
                    " User's city: " + i.getUser().getCity());
        }

        System.out.println("=================================================");

        System.out.println("Order list without duplicated items:");
        Iterator<Order> iterator = orderList.iterator();
        while (iterator.hasNext()) {
            Order o = iterator.next();
            if (o.equals(iterator.next())) {
                iterator.remove();
            }
        }

        for (Order i : orderList) {
            System.out.println("Order ID: " + i.getId() + " Shop: " + i.getShopIdentificator() +
                    " Item name: " + i.getItemName() +
                    " User's city: " + i.getUser().getCity());
        }

        System.out.println("=================================================");
        System.out.println("Order list with prices over 1500:");
        Collections.sort(orderList, byPrice);
        while (iterator.hasNext()) {
            Order o = iterator.next();
            if (o.getPrice() > 1500) {
                iterator.remove();
            }
        }

        for (Order i : orderList) {
            System.out.println("Order ID: " + i.getId() + " Price: " + i.getPrice() +
                    " Item name: " + i.getItemName());
        }

        System.out.println("=================================================");

        System.out.println("Separated orders (USD/UAH):");
        List<Order> orderListUAH = new ArrayList<>();
        List<Order> orderListUSD = new ArrayList<>();
        for (Order i : orderList) {
            if (i.getCurrency().equals(Currency.getInstance("USD"))) {
                orderListUSD.add(i);
            }
            if (i.getCurrency().equals(Currency.getInstance("UAH"))) {
                orderListUAH.add(i);
            }
        }

        System.out.println("UAH order list:");

        for (Order i : orderListUAH) {
            System.out.println("Order ID: " + i.getId() +
                    " Item Name: " + i.getItemName() + " Price: "+i.getPrice() + " " + i.getCurrency());
        }

        System.out.println("USD order list:");

        for (Order i : orderListUSD) {
            System.out.println("Order ID: " + i.getId() +
                    " Item Name: " + i.getItemName() + " Price: "+i.getPrice() + " " + i.getCurrency());
        }
    }
}

