public class Main {
    public static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = new Scientific("Плотникова Александра Георгиевна","scientific", 57000);
        employees[1] = new Economic("Минина Аглая Ивановна", "economic",65990);
        employees[2] = new Scientific("Гордеев Лев Олегович", "scientific", 34200);
        employees[3] = new Economic("Фролов Петр Геннадьевич", "economic",123440);
        employees[4] = new Scientific("Титов Илья Семёнович","scientific", 91001);
        employees[5] = new Economic("Воробьева Малика Дмитриевна", "economic",73495);
        employees[6] = new Scientific("Морозов Артём Васильевич","scientific", 80800);
        employees[7] = new Economic("Носов Иван Иванович", "economic",62870);
        employees[8] = new Economic("Пугачев Савелий Тимофеевич", "economic",54000);
        employees[9] = new Economic("Новиков Евгений Владиславович", "economic",102340);

        System.out.println("Список сотрудников : ");
        for (Employee employee : employees) {
            System.out.println(employee.getId());
        }

        //    double sum1 = sumEconomic();

        double sum = sumEmployee();
        System.out.println("Сумма затрат на зарплаты:" + sum);

        double average = sum / employees.length+1;
        System.out.println("Среднее значение зарплат:" + average);

        int numberOfEmployeeMin = minSalary();
        System.out.println("Минимальная зарплата: " + employees[numberOfEmployeeMin].getSalary() +
                " у сотрудника - " + employees[numberOfEmployeeMin].getId() + ".");


        int numberOfEmployeeMax = maxSalary();
        System.out.println("Максимальная зарплата: " + employees[numberOfEmployeeMax].getSalary() +
                " у сотрудника - " + employees[numberOfEmployeeMax].getId() + ".");
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


//    public static double sumEconomic() {
//        double sum1 = 0;
//        for (int i = 0; i < 9 ; i++) { // !!!
//            System.out.println(employees[i].getDepartment());
//
//        }
//        return sum1;
//    }
}
