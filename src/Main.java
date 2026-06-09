import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentCourseManager manager =
                new StudentCourseManager();

        int choice;

        do {

            System.out.println("\n-----MENU---- ");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. View Courses");
            System.out.println("5. Enroll Student");
            System.out.println("6. View Enrollments");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Student Name: ");
                    String name = sc.nextLine();

                    manager.addStudent(id, name);
                    break;

                case 2:
                    manager.viewAllStd();
                    break;

                case 3:
                    System.out.print("Course Code: ");
                    String code = sc.nextLine();

                    System.out.print("Course Title: ");
                    String title = sc.nextLine();

                    manager.addCourse(code, title);
                    break;

                case 4:
                    manager.viewAllCourse();
                    break;

                case 5:
                    System.out.print("Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Course ID: ");
                    String courseCode = sc.nextLine();

                    manager.enrollStd(studentId, courseCode);
                    break;

                case 6:
                    manager.viewEnrollments();
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 7);

        sc.close();
    }
}