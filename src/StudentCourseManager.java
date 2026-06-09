import java.util.HashMap;
import java.util.HashSet;
public class StudentCourseManager {
private HashMap<Integer, Student>students =  new HashMap<>();
private HashMap<String, course>Course = new HashMap<>();
private HashMap<Integer, HashSet<String>>enrollenment  = new HashMap<>();

public void addStudent(int id, String name){
    Student std = new Student(id, name);
    students.put (id, std);
    System.out.println("The Student has been added successfully");
}

public void viewAllStd(){
    if(students.isEmpty()){
        System.out.println("No students has been added ");
        return ;
    }
    for (Student std : students.values()){
        System.out.println(students);
    }
}

public void addCourse(String id , String title){
    course cors = new course(id, title );
    Course.put(id, cors);
    System.out.println("The Course has been added successfully");
}

public void viewAllCourse(){
    if(Course.isEmpty()){
        System.out.println("The Courses has not been added");
        return;
    }

    for (course cors : Course.values()){
        System.out.println(Course);
    }
}

public void enrollStd(int studentId, String courseID){
if(!students.containsKey(studentId)){
    System.out.println("The Student is not found ");
    return ;
}
if(!Course.containsKey(courseID)){
    System.out.println("The course is not found");
    return ;
}
enrollenment.putIfAbsent(studentId, new HashSet<>());
enrollenment.get(studentId).add(courseID);
    System.out.println("Enrollment Successfully");
}

    public void viewEnrollments() {

        if(enrollenment.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }

        for(Integer studentId : enrollenment.keySet()) {

            Student student = students.get(studentId);

            System.out.println("\nStudent: " + student.getName());

            for(String courseID : enrollenment.get(studentId)) {

                course course = Course.get(courseID);

                System.out.println(" - " + course.getCourseName());
            }
        }
    }
}
