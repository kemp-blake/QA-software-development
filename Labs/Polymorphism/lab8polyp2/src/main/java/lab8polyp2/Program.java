package lab8polyp2;

public class Program {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", "Customer Service Team Leader");

        Employee emp1 = new Employee("James Brook", "Customer Service Advisor");
        Employee emp2 = new Employee("Julie Sinclair", "Customer Service Advisor");
        Employee emp3 = new Employee("Martin Hunt", "Customer Service Advisor");

        SkilledWorker skilledWorker = new SkilledWorker("Justin Breem", "Key Accounts Advisor");
        skilledWorker.addSkill("Sales");
        skilledWorker.addSkill("Customer Service");

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);
        manager.addEmployee(skilledWorker);

        Manager headSales = new Manager("Earl Carlton", "Head of Customer Service");
        headSales.addEmployee(manager);

        System.out.println(headSales.getInfo());
    }
}