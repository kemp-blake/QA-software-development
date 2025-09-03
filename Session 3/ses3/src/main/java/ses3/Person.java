package ses3;

public class Person {
    // fields // setting these to private means only this class can set the values so other classes have to use the public setters
    private int age = -1; // Setting the default to -1 so you know age hasn't been set // this is a magic number and should be avoided if possible
    private String name;
    // get methods
    public String getName(){ // return name
        return name;
    }
    public int getAge(){ // return age
        return age;
    }
    // set methods
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if (age >= 0){ // validation
            this.age = age;
        }
        
    }
    // other methods
    public String toString(){ // to string, converts person object to string for easy printing
        return String.format("Name: %s%nAge: %d%n", getName(), getAge());
    }
    
}
