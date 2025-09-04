package queue;

import java.util.ArrayDeque;

public class Program {
    public static void main(String[] args) {
        ArrayDeque<ShoppingBasket> baskets = new ArrayDeque<>();

        ShoppingBasketItem toiletRoll = new ShoppingBasketItem("Toilet Roll", 1, 4.50);
        ShoppingBasketItem salmon  = new ShoppingBasketItem("Salmon", 2, 7.80);
        ShoppingBasketItem eggs = new ShoppingBasketItem("Eggs", 12, 6.30);

        ShoppingBasket basket1 = new ShoppingBasket(eggs);
        basket1.add(salmon);
        basket1.add(toiletRoll);


        ShoppingBasket basket2 = new ShoppingBasket(eggs);

        ShoppingBasket basket3 = new ShoppingBasket(salmon);
        basket3.add(toiletRoll);

        baskets.addFirst(basket1);
        baskets.addFirst(basket2);
        baskets.addFirst(basket3);


        processBaskets(baskets);
    }

    public static void processBaskets(ArrayDeque<ShoppingBasket> baskets){
        for(ShoppingBasket basket : baskets){
            for(ShoppingBasketItem item : basket.basketContents){
                System.out.println(item.getDetails());

            }
        }
    }
}