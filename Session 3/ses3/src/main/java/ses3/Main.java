package ses3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        // modify the fields
        person.setName("Blake");
        person.setAge(23);
        System.out.println(person.toString());
    }
}
