package q5_student;

public class StudentMain {
    public static void main(String[] args) {
        Student.setUniversityName("Global University");

        Student student1 = new Student("Hemashree", 101, 'A');
        Student student2 = new Student("Sharmila", 102, 'B');

        Student.displayTotalStudents();

        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();

        StudentService service = new StudentService();
        service.upgradeGrade(student2, 'A');

        System.out.println();
        student2.displayStudentDetails();
    }
}
