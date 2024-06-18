public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Avril Aroldo", "British", 11000, "Manager");

        Developer developer = new Developer("Iver Dipali", "USA", 6000, "Developer");

        Programmer programmer = new Programmer("Yaron Gabriel", "UK", 7820, "Programmer");

        manager.bonus();
        developer.bonus();
        programmer.bonus();

        manager.performance("Excellent");
        developer.performance("Good");
        programmer.performance("Excellent");

        manager.work("managing a project");
        developer.work("writing code in Java");
        programmer.work("debugging code in Python");
    }
}