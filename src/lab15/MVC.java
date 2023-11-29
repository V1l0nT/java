package lab15;

public class MVC {
    public static class Student {
        private String rollNo;
        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRollNo() {
            return this.rollNo;
        }

        public void setRollNo(String rollNo) {
            this.rollNo = rollNo;
        }
    }
    public static class StudentView {
        public void printStudentDetails(String rollNo, String name) {
            System.out.println("Информация о студенте: ");
            System.out.println("Идентификационный номер: " + rollNo);
            System.out.println("Имя: " + name);
        }

    }
    public static class StudentController {
        private final Student model;
        private final StudentView view;
        public StudentController(Student model, StudentView view) {
            this.model = model;
            this.view = view;
        }
        public void setStudentName(String name) {
            this.model.name = name;
        }
        public String getStudentName() {
            return this.model.name;
        }
        public void setStudentRollNo(String rollNo) {
            this.model.rollNo = rollNo;
        }
        public String getStudentRollNo() {
            return this.model.rollNo;
        }
        public void updateView() {
            view.printStudentDetails(model.getRollNo(), model.getName());
        }
    }
}