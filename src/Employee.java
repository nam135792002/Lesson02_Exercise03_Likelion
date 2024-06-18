public class Employee {
    protected String fullName;
    protected String address;
    protected double salary;
    protected String position;

    protected String evaluate;

    public Employee(String fullName, String address, long salary, String position, String evaluate) {
        this.fullName = fullName;
        this.address = address;
        this.salary = salary;
        this.position = position;
        this.evaluate = evaluate;
    }

    public Employee(){};

    public void bonus(){};
    public void performance(){};
    public void work(){};

}
