package Module_7;

import java.util.Comparator;

public class CompareByPrice implements Comparator <Order>{

    public int compare(Order o1, Order o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();

        if(price1>price2){
            return -1;
        }
        if (price2>price1){
            return 1;
        }
        return 0;
    }
}
