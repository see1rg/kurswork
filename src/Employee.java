public class Employee {

    private String fio;
    private String department;
    private double salary;
    public static int id = 0;

   public static int count=0;




    public Employee(String fio, String department, double salary) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
//         this.id = count();

    }

    public static int count(){
        count++;
        return count;
    }
    public static int getId() {
        return id;
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
