package lab15;

public class SalaryPatternDemo extends Salary{
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Иван");
        System.out.println("\nПосле обновления, информация о студенте следующая");
        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Петя");
        employee.setHourlyRate(500);
        employee.setHoursWorked(120);
        return employee;
    }
}
