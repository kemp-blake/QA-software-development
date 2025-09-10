package ses8.Factories.AbstractFactory;

public class MealService {
    final MealFactoryInterface factory;
    public MealService(MealFactoryInterface factory) {
        this.factory = factory;
    }
    public void fullset(){
        factory.createMain().serve();
        factory.createDrink().serve();
        factory.createDessert().serve();
    }
    
}
