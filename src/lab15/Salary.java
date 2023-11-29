package lab15;

public class Salary {
    public static class Employee {
        private String name;
        private int hourlyRate;
        private int hoursWorked;

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getHourlyRate() {
            return this.hourlyRate;
        }
        public void setHourlyRate(int hourlyRate) {
            this.hourlyRate = hourlyRate;
        }
        public int getHoursWorked() {
            return this.hoursWorked;
        }
        public void setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
        }
        public int calculateSalary() {
            return hourlyRate * hoursWorked;
        }
    }
    public static class EmployeeView {
        public void printEmployeeDetails(String name, double hourlyRate, int hoursWorked, int salary) {
            System.out.println("Информация о сотруднике:");
            System.out.println("Имя: " + name);
            System.out.println("Часовая ставка: " + hourlyRate);
            System.out.println("Отработанные часы: " + hoursWorked);
            System.out.println("Заработная плата: " + salary);
        }
    }
    public static class EmployeeController {
        private Employee model;
        private EmployeeView view;
        public EmployeeController(Employee model, EmployeeView view) {
            this.model = model;
            this.view = view;
        }
        public void setEmployeeName(String name) {
            model.name = name;
        }
        public void setEmployeeHourlyRate(int hourlyRate) {
            model.hourlyRate = hourlyRate;
        }
        public void setEmployeeHoursWorked(int hoursWorked) {
            model.hoursWorked = hoursWorked;
        }
        public String getEmployeeName() {
            return this.model.name;
        }
        public int getEmployeeHourlyRate() {
            return this.model.hourlyRate;
        }
        public int getEmployeeHoursWorked() {
            return this.model.hoursWorked;
        }
        public void updateView() {
            view.printEmployeeDetails(model.getName(), model.getHourlyRate(), model.getHoursWorked(), model.calculateSalary());
        }
    }
}
