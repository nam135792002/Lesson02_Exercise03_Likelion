public class Programmer extends Employee{
    public Programmer(String fullName, String address, long salary, String position, String evaluate) {
        super(fullName, address, salary, position, evaluate);
    }

    @Override
    public void bonus() {
        this.salary += 1300;
        System.out.println("Programmer's Bonus: $" + this.salary);
    }

    @Override
    public void performance() {
        System.out.println("Performance report for Programmer " + this.fullName + ": " + this.evaluate);
    }

    @Override
    public void work() {
        System.out.println("Programmer " + this.fullName + " is " + this.position);
    }
}
