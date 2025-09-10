package ses8.Factories.FactoryMethod;


public abstract class Restaurant {


    abstract Meal createMeal();

    public void serving(){
        Meal meal = createMeal();
        meal.serve();
    }
    
}
