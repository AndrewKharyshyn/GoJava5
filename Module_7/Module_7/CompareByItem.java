package Module_7;

import java.util.Comparator;

public class CompareByItem implements Comparator <Order>{

    public int compare(Order o1, Order o2) {
        String item1 = o1.getItemName();
        String item2 = o2.getItemName();

        return item1.compareTo(item2);
    }
}
