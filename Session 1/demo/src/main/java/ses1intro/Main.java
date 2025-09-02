package ses1intro;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.add(4, 6);
        System.out.println(subtract(7, 4));

        m.greet();
        m.greet("Bob");

    }
    private void add(int a, int b) {
        System.out.println(a+b);
    }
    protected static int subtract(int a, int b) {
        return a - b;
    }
    public void greet(String name){
        System.out.println(name);
    }
    public void greet() {
        System.out.println("Blake");
    }
}
