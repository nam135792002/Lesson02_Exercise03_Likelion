public class Manager extends Employee{

    public Manager(String fullName, String address, long salary, String position, String evaluate){
        super(fullName, address, salary, position, evaluate);
    }

    @Override
    public void bonus() {
        this.salary += 1000;
        System.out.println("Manager's Bonus: $" + this.salary);
    }

    @Override
    public void performance() {
        System.out.println("Performance report for Manager " + this.fullName + ": " + this.evaluate);
    }

    @Override
    public void work() {
        System.out.println("Manager " + this.fullName + " is " + this.position);
    }
}
