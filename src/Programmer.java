public class Programmer extends Employee{
    public Programmer(String fullName, String address, long salary, String position) {
        super(fullName, address, salary, position);
    }

    @Override
    public void bonus() {
        this.salary += 1300;
        System.out.println("Programmer's Bonus: $" + this.salary);
    }
}
