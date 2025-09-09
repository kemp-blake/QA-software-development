package ses7.other;

public class IntegerContainer implements Container<Integer> {
    private int item;

    @Override
    public void add(Integer item){
        this.item = item;
    }
    @Override
    public Integer get(){
        return item;
    }
    
}
