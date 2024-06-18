public class Developer extends Employee{
    public Developer(String fullName, String address, long salary, String position) {
        super(fullName, address, salary, position);
    }

    @Override
    public void bonus() {
        this.salary += 1200;
        System.out.println("Developer's Bonus: $" + this.salary);
    }
}
