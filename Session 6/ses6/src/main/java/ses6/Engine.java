package ses6;

abstract class Engine {
    abstract void start(); // abstract method

    void refillTank(){ // concrete method
        System.out.println("Tank refilled");
    }
}
