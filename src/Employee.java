public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) { // employee constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        if (this.salary < 0) {
            this.salary = 0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void raise() {
        System.out.println(this.firstName + " got a raise!");
        this.salary = salary * 1.10;
    }

    public static void main(String[] args) {
        Employee Morten = new Employee("Morten", "Mortensen", 200.00);
        Employee Jens = new Employee("Jens","Jensen", 400.50);
        System.out.println(Morten);
        System.out.println(Jens);
        Morten.raise();
        Jens.raise();
        System.out.println(Morten);
        System.out.println(Jens);
    }
}
