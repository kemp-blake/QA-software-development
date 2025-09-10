package ses8.Factories;

import ses8.Factories.AbstractFactory.JapaneseMealFactory;
import ses8.Factories.AbstractFactory.MealService;

public class Main {
    public static void main(String[] args) {
        MealService service = new MealService(new JapaneseMealFactory());
        service.fullset();
    }

}



/*
 * Simple Factory ----
 * Meal meal = MealFactory.getMeal("PizzA");
 *     meal.serve();
 * 
 * Factory Method ----
 * Restaurant restaurant = new PizzaRestaurant();
 *     restaurant.serving();
 * 
 * Abstract Method ----
 * MealService service = new MealService(new JapaneseMealFactory());
 *     service.fullset();
*/