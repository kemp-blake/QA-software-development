package ses8.Factories.AbstractFactory;

public class ItalianMealFactory implements MealFactoryInterface {
    @Override
    public MainCourse createMain() {
        return new Pasta();
    }
    @Override
    public Drink createDrink() {
        return new Wine();

    }
    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
