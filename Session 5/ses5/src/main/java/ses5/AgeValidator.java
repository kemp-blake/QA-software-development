package ses5;

public class AgeValidator {
    public void validateAge(int age) throws InvalidAgeException{
        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or over.");
        }
        System.out.println("Age passed validation.");
    }
}
