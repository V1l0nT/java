package lab15;

public class MVCPatternDemo extends MVC {
    public static void main(String[] args) {
        // Получение данных о студенте на основе его номера из базы данных
        Student model = retriveStudentFromDatabase();
        // Создание представления: вывод информации о студенте в консоль
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // Обновление данных модели
        controller.setStudentName("Иван");
        System.out.println("\nПосле обновления, информация о студенте следующая");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Петя");
        student.setRollNo("123456");
        return student;
    }
}