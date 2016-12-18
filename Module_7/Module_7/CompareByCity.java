package Module_7;

import java.util.Comparator;

public class CompareByCity implements Comparator<Order> {

    public int compare(Order o1, Order o2) {
        String city1 = o1.getUser().getCity();
        String city2 = o2.getUser().getCity();

        return city1.compareTo(city2);
    }
}
