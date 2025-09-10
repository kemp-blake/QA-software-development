package ses8.Factories.AbstractFactory;

public class JapaneseMealFactory implements MealFactoryInterface {
    @Override
    public MainCourse createMain() {
        return new Ramen();
    }
    @Override
    public Drink createDrink() {
        return new Sake();

    }
    @Override
    public Dessert createDessert() {
        return new Mochi();
    }
}
