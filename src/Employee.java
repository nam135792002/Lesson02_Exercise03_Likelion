public class Employee {
    protected String fullName;
    protected String address;
    protected double salary;
    protected String position;

    public Employee(String fullName, String address, long salary, String position) {
        this.fullName = fullName;
        this.address = address;
        this.salary = salary;
        this.position = position;
    }

    public Employee(){}

    public void bonus(){}

    public void performance(String evaluate) {
        System.out.println("Performance report for " + this.position + " " + this.fullName + ": " + evaluate);
    }

    public void work(String working) {
        System.out.println(this.position + " " + this.fullName + " is " + working + ".");
    }

}
