public class Employee {
    private int id;
    private String fullName;
    private int department;
    private double salary;
    private static int idId;


    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = getIdId();
        idId++;
    }

    public static int getIdId() { return idId; }

    public int getId() { return id; }

    public double getSalary() { return salary; }

    public int getDepartment() { return department; }

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public void setSalary(double salary) { this.salary = salary; }

    public void setDepartment(int department) { this.department = department; }

    @Override
    public String toString() {
        return "Ф.И.О. сотрудника: " + fullName + " Отдел: " + department + " Зарплата: " + salary + " id: " + id;
    }

}