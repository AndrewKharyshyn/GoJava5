package Module_9;

import java.util.Currency;

public class OrderLambda {

        private long id;
        private int price;
        private Currency currency;
        private String itemName;
        private String shopIdentificator;
        private UserLambda userLambda;

        public OrderLambda(long id, int price, Currency currency, String itemName, String shopIdentificator, UserLambda userLambda) {
            this.id = id;
            this.price = price;
            this.currency = currency;
            this.itemName = itemName;
            this.shopIdentificator = shopIdentificator;
            this.userLambda = userLambda;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderLambda that = (OrderLambda) o;

        if (id != that.id) return false;
        if (price != that.price) return false;
        if (!currency.equals(that.currency)) return false;
        if (!itemName.equals(that.itemName)) return false;
        if (!shopIdentificator.equals(that.shopIdentificator)) return false;
        return userLambda.equals(that.userLambda);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + currency.hashCode();
        result = 31 * result + itemName.hashCode();
        result = 31 * result + shopIdentificator.hashCode();
        result = 31 * result + userLambda.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "OrderLambda{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", userLambda=" + userLambda +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public UserLambda getUserLambda() {
        return userLambda;
    }

    public void setUserLambda(UserLambda userLambda) {
        this.userLambda = userLambda;
    }
}
