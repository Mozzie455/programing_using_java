package encapsulation;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int salary;
    private int bonus;
    private int jobLevel;

    // Public getter and setter methods
    public String getEmployeeId() {
         return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }


    public void calculateSalary() {
        if (this.jobLevel >= 4) {
            this.bonus = 100;
        } else {
            this.bonus = 50;
        }
        this.salary += this.bonus;
    }
}

class Tester {

    public static void main(String[] args) {
        // Creating object of Customer class
        Employee employee = new Employee();

        // Setting values of the instance variables using setter methods
        employee.setEmployeeId("C101");
        employee.setEmployeeName("Steve");
        employee.setSalary(650);
        employee.setJobLevel(4);

        employee.calculateSalary(); // Just call the method
        int totalSalary = employee.getSalary(); // Get the updated salary


        // Displaying values of the instance variables using getter methods
        System.out.println("Employee Details");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + totalSalary);

    }
}
