package ses8.Factories.FactoryMethod;


public class BurgerRestaurant extends Restaurant {
    @Override
    Meal createMeal(){
        return new Burger();
    }
    
}
