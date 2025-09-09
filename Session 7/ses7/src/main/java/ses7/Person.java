package ses7;

//import java.util.ArrayList;
//import java.util.Iterator;

public class Person implements Comparable<Person> {
    private int id;

    //private static ArrayList<Person> personList = new ArrayList<>();
    //private static int listLoc;

    //private static int lastId;
    private String name;
    @Override
    public int compareTo(Person other){
        return Integer.compare(this.id, other.id);
    }
    public Person(String name, int id){
        this.name = name;
        //this.id = ++Person.lastId*10; // Auto sets ID
        this.id = id;

        //personList.add(this);

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDetails(){
        return String.format("Name: %s%nID: %d%n%n%n", this.getName(), this.getId());
    }
    
    //Iterator
    ////@Override
    //public static Person next() {
    //    return personList.get(listLoc++);
    //}
    ////@Override
    //public static boolean hasNext() {
    //    return personList.get(listLoc+1) != null;
    //}

    //iterable

    //@Override
    //public Iterator<Person> iterator() {
    //    return 
    //}


}
