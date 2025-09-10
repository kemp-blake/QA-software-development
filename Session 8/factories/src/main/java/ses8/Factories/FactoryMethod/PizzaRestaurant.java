package ses8.Factories.FactoryMethod;

public class PizzaRestaurant extends Restaurant {
    @Override
    Meal createMeal(){
        return new Pizza();
    }
    
}
