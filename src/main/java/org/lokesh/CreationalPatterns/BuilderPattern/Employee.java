public class Employee {

    private final int id;
    private final String name;
    private final String department;
    private final double salary;
    private final String email;

    public Employee(EmployeeBuilder builder) {

        this.id = builder.getId();
        this.name = builder.getName();
        this.department = builder.getDepartment();
        this.salary = builder.getSalary();
        this.email = builder.getEmail();
    }

    // Static builder method
    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + email);
    }
}