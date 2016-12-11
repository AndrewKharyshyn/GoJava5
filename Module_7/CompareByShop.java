package Module_7;

import java.util.Comparator;

public class CompareByShop implements Comparator <Order>{

    public int compare(Order o1, Order o2) {
        String shop1 = o1.getShopIdentificator();
        String shop2 = o2.getShopIdentificator();

        return shop1.compareTo(shop2);
    }
}
