public class Manager extends Employee{

    public Manager(String fullName, String address, long salary, String position){
        super(fullName, address, salary, position);
    }

    @Override
    public void bonus() {
        this.salary += 1000;
        System.out.println(this.position + "'s Bonus: $" + this.salary);
    }
}
