package ses8.Factories.SimpleFactory;

public class MealFactory {
    static Meal getMeal(String type){

        switch (type.toLowerCase()) {
            case "pizza":
                return new Pizza();

            case "burger":
                return new Burger();

            default:
                throw new IllegalArgumentException("Invalid meal type.");
        }

    }
}

/*
 * Simple Factory
 * 
 * switch (type.toLowerCase()) {
 *           case "pizza":
 *               return new Pizza(); *
 *           case "burger":
 *               return new Burger(); *
 *           default:
 *               throw new IllegalArgumentException("Invalid meal type.");
 *         }
 */
