package ses7;

import java.util.Iterator;
import java.util.List;

public class PersonIterator implements Iterator<Person> {
    private int currentIndex;
    private final List<Person> list;

    public PersonIterator(List<Person> list) {
        this.list = list;
    }
    @Override
    public boolean hasNext(){
        return currentIndex <= list.size() -1;
    }
    @Override
    public Person next(){
        return list.get(currentIndex++);
    }
}   
