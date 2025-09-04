package queue;

import java.util.ArrayList;

public class ShoppingBasket {
    ArrayList<ShoppingBasketItem> basketContents = new ArrayList<>();

    public void add(ShoppingBasketItem item) {
        basketContents.add(item);
    }

    ShoppingBasket(ShoppingBasketItem item) {
        basketContents.add(item);
    }
}
