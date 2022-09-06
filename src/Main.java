public class Main {
    public static Employee[] employees = new Employee[10];


    public static void main(String[] args) {


        employees[0] = new Employee("Плотникова Александра Георгиевна", "scientific", 57000);
        employees[1] = new Employee("Минина Аглая Ивановна", "economic", 65990);
        employees[2] = new Employee("Гордеев Лев Олегович", "scientific", 34200);
        employees[3] = new Employee("Фролов Петр Геннадьевич", "economic", 123440);
        employees[4] = new Employee("Титов Илья Семёнович", "scientific", 91001);
        employees[5] = new Employee("Воробьева Малика Дмитриевна", "economic", 73495);
        employees[6] = new Employee("Морозов Артём Васильевич", "scientific", 80800);
        employees[7] = new Employee("Носов Иван Иванович", "economic", 62870);
        employees[8] = new Employee("Пугачев Савелий Тимофеевич", "economic", 54000);
        employees[9] = new Employee("Новиков Евгений Владиславович", "economic", 102340);


        System.out.println("Зарплата проиндексирована на: " + indexSalary(10) + "%.");

        System.out.println("Список сотрудников : ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFio());
        }


        double sumDepartmentEconomic = sumDepartmentEconomic();
        System.out.println("Сумму затрат на зарплату по отделу \"Экономика\": " + sumDepartmentEconomic);

        System.out.println("Среднее значение зарплат по отделу \"Экономика\":" + averageDepartmentEconomic());

        double sumDepartmentScientific = sumDepartmentScientific();
        System.out.println("Сумму затрат на зарплату по отделу \"Наука\": " + sumDepartmentScientific);

        System.out.println("Среднее значение зарплат по отделу \"Наука\":" + averageDepartmentScientific());

        double sum = sumEmployee();
        System.out.println("Сумма затрат на зарплаты:" + sum);

        double average = sum / employees.length + 1;
        System.out.println("Среднее значение зарплат:" + (float) average);


        int numberOfEmployeeMin = minSalary();
        System.out.println("Минимальная зарплата: " + employees[numberOfEmployeeMin].getSalary() +
                " у сотрудника - " + employees[numberOfEmployeeMin].getFio() + ".");


        int numberOfEmployeeMax = maxSalary();
        System.out.println("Максимальная зарплата: " + employees[numberOfEmployeeMax].getSalary() +
                " у сотрудника - " + employees[numberOfEmployeeMax].getFio() + ".");
    }


    public static int minSalary() {
        double min = employees[0].getSalary();
        int numberOfEmployeeMin = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary(); // check it!
                numberOfEmployeeMin = i;
            }
        }
        return numberOfEmployeeMin;
    }

    public static int maxSalary() {
        double max = employees[0].getSalary();
        int numberOfEmployeeMax = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary(); // check it!
                numberOfEmployeeMax = i;
            }
        }
        return numberOfEmployeeMax;
    }


    public static double sumEmployee() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static double sumDepartmentEconomic() {
        double sumDepartmentEconomic = 0;
        String depart = "economic";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals(depart)) {
                sumDepartmentEconomic += employees[i].getSalary();
            }
        }
        return sumDepartmentEconomic;
    }

    public static double averageDepartmentScientific() {
        double employeeDepartmentScientific = 0;
        double sumDepartmentScientific = 0;
        String depart = "scientific";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals(depart)) {
                sumDepartmentScientific += employees[i].getSalary();
                employeeDepartmentScientific++;
            }
        }
        return sumDepartmentScientific / employeeDepartmentScientific;
    }

    public static double averageDepartmentEconomic() {
        double employeeDepartmentEconomic = 0;
        double sumDepartmentEconomic = 0;
        String depart = "scientific";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals(depart)) {
                sumDepartmentEconomic += employees[i].getSalary();
                employeeDepartmentEconomic++;
            }
        }
        return sumDepartmentEconomic / employeeDepartmentEconomic;
    }

    public static double sumDepartmentScientific() {
        double sumDepartmentScientific = 0;
        String depart = "scientific";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equals(depart)) {
                sumDepartmentScientific += employees[i].getSalary();
            }
        }
        return sumDepartmentScientific;
    }


    public static double indexSalary(double percent) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((employees[i].getSalary() * percent / 100) + employees[i].getSalary());
        }

        return percent;
    }


}



