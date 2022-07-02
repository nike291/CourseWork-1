public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov0", 1, 10000);
        employee[1] = new Employee("Ivanov1", 2, 15000);
        employee[2] = new Employee("Ivanov2", 3, 20000);
        employee[3] = new Employee("Ivanov3", 4, 25000);
        employee[4] = new Employee("Ivanov4", 5, 30000);
        employee[5] = new Employee("Ivanov5", 1, 35000);
        employee[6] = new Employee("Ivanov6", 2, 17000);
        employee[7] = new Employee("Ivanov7", 3, 18000);
        employee[8] = new Employee("Ivanov8", 4, 19000);
        employee[9] = new Employee("Ivanov9", 5, 19000);

        printEmployee(employee);
        System.out.println(" ");
        sumSalaryMonth(employee);
        System.out.println(" ");
        minSalaryEmployee(employee);
        System.out.println(" ");
        maxSalaryEmployee(employee);
        System.out.println(" ");
        middleSalary(employee);
        System.out.println(" ");
        nameEmployee(employee);

    }

    //Список сотрудников со всеми данными
    private static void printEmployee(Employee[] employees) {
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

    //Сумма затрат на З/П в месяц
    private static void sumSalaryMonth(Employee[] employees) {
        double sumSalaryMonth = 0;
        for (Employee employee : employees) {
            sumSalaryMonth = sumSalaryMonth + employee.getSalary();
        }
        System.out.println("Сумма затрат на З/П в месяц: " + sumSalaryMonth);
    }

    //Сотрудник с минимальной З/П
    private static void minSalaryEmployee(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (minSalary.getSalary() > employee.getSalary()) {
                minSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной З/П:");
        System.out.println(minSalary);
    }

    //Сотрудник с максимальной З/П
    private static void maxSalaryEmployee(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной З/П:");
        System.out.println(maxSalary);
    }

    //Средняя З/П
    private static void middleSalary(Employee[] employees) {
        double sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary = sumSalary + employee.getSalary();
        }
        System.out.println("Средняя З/П: " + sumSalary / employees.length);
    }

    //Список Ф.И.О. сотрудников
    private static void nameEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}