public class Client {

    public static void main(String[] args) {

        Employee emp = Employee.builder()
                .setId(101)
                .setName("Lokesh")
                .setDepartment("Development")
                .setSalary(40000)
                .setEmail("lokesh@gmail.com")
                .build();

        emp.display();
    }
}