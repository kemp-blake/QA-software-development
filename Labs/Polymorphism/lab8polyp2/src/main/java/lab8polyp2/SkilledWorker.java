package lab8polyp2;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
    ArrayList<String> skills = new ArrayList<>();
    public SkilledWorker(String name, String jobTitle){
        super(name, jobTitle);
    }

    public void addSkill(String skill){
        skills.add(skill);
    }

    
}
