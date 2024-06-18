public class Developer extends Employee{
    public Developer(String fullName, String address, long salary, String position, String evaluate) {
        super(fullName, address, salary, position, evaluate);
    }

    @Override
    public void bonus() {
        this.salary += 1200;
        System.out.println("Developer's Bonus: $" + this.salary);
    }

    @Override
    public void performance() {
        System.out.println("Performance report for Developer " + this.fullName + ": " + this.evaluate);
    }

    @Override
    public void work() {
        System.out.println("Developer " + this.fullName + " is " + this.position);
    }
}
