public class Employee {
    private String fio;
    private String department;
    private double salary;
    public static int count;
    public int id;

    public Employee(String fio, String department, double salary) {
        id = count++;
        this.fio = fio;
        this.salary = salary;
        this.department = department;

    }

    @Override
    public String toString() {
        return
                "Ф.И.О. : " + fio +
                        ", зарплата :" + salary +
                        " id " + id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
