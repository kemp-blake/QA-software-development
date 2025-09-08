package lab8polyp2;

import java.util.ArrayList;

public class Manager extends Employee {
    ArrayList<Employee> employees = new ArrayList<>();

    public Manager(String name, String jobTitle) {
        super(name, jobTitle);
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    @Override
    public String getInfo(){
        String info;

        info = super.getInfo() + "Delegates: \n";

        for (Employee employee : employees){
            info = info + employee.getInfo();
        }

        return info;
    }
    

    
}
