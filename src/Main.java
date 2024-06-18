public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Avril Aroldo", "British",
                11000, "managing a project.", "Excellent");

        Developer developer = new Developer("Iver Dipali", "USA",
                6000, "writing code in Java.", "Good");

        Programmer programmer = new Programmer("Yaron Gabriel", "UK",
                7820, "debugging code in Python", "Excellent");

        manager.bonus();
        developer.bonus();
        programmer.bonus();

        manager.performance();
        developer.performance();
        programmer.performance();

        manager.work();
        developer.work();
        programmer.work();
    }
}