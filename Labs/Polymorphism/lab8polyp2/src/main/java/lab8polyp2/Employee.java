package lab8polyp2;

public class Employee {

    private String name;
    private String jobTitle;
    private int id;
    protected static int idCount;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }

    public Employee(String name, String jobTitle) {
        setId(++Employee.idCount*10);
        setName(name);
        setJobTitle(jobTitle);
    }

    public String getInfo() {
        return String.format("Name: %s%nJob Title: %s%nEmployee ID: %d%n", getName(), getJobTitle(), getId());
    }

}
