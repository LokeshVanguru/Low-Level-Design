public class EmployeeBuilder {

    private int id;
    private String name;
    private String department;
    private double salary;
    private String email;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public Employee build() {
        return new Employee(this);
    }
}