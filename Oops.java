// ================= Interface =================
interface Vehicle {

    void start();
}

// ================= Abstract Class =================
abstract class Person {

    protected String name;

    Person(String name) {
        this.name = name;
    }

    abstract void work();

    void displayPerson() {
        System.out.println("Person Name : " + name);
    }
}

// ================= Parent Class =================
class Employee extends Person {

    // Encapsulation
    private int empId;

    // Static Variable
    static String company = "Cloud Code Tech";

    // Final Variable
    final String country = "India";

    // Constructor
    Employee(String name, int empId) {
        super(name);              // Super Constructor
        this.empId = empId;       // this keyword
    }

    // Getter
    public int getEmpId() {
        return empId;
    }

    // Setter
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Concrete method of Abstract Class
    @Override
    void work() {
        System.out.println(name + " is Working");
    }

    // Method Overloading
    void salary(int amount) {
        System.out.println("Salary : " + amount);
    }

    void salary(int amount, int bonus) {
        System.out.println("Salary : " + (amount + bonus));
    }

    void showEmployee() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Company : " + company);
        System.out.println("Country : " + country);
    }
}

// ================= Child Class =================
class Developer extends Employee implements Vehicle {

    String technology;

    Developer(String name, int empId, String technology) {
        super(name, empId);
        this.technology = technology;
    }

    // Method Overriding
    @Override
    void work() {
        System.out.println(name + " develops " + technology + " applications");
    }

    // Interface Method
    @Override
    public void start() {
        System.out.println("Developer starts coding...");
    }

    void showDeveloper() {
        System.out.println("Technology : " + technology);
    }
}

// ================= Main Class =================
public class Oops{

    public static void main(String[] args) {

        // Object Creation
        Developer d1 = new Developer("Hrushikesh",101,"Java");

        System.out.println("===== OOPS DEMO =====");

        // Abstract Class Method
        d1.displayPerson();

        // Overridden Method
        d1.work();

        // Interface Method
        d1.start();

        // Child Method
        d1.showDeveloper();

        // Parent Method
        d1.showEmployee();

        // Method Overloading
        d1.salary(50000);
        d1.salary(50000,10000);

        // Encapsulation
        d1.setEmpId(201);
        System.out.println("Updated Employee ID : " + d1.getEmpId());

        // Upcasting
        Employee e = new Developer("Rahul",102,"Python");
        e.work();

        // Downcasting
        Developer d2 = (Developer)e;
        d2.start();

        // Static Variable
        System.out.println("Company Name : " + Employee.company);

        System.out.println("===== Program End =====");
    }
}