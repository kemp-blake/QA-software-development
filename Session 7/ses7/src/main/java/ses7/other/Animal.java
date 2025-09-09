package ses7.other;

public interface Animal {
    default void sleep() {
        System.out.println("Sleeping"); // concrete default - doesn't need to be implemented
    }
    void eat(); // must implement the abstract
}
