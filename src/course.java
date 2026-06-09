public class course {

    private String courseID;
    private String courseName;

    public course(String courseID, String courseName){
        this.courseID= courseID  ;
        this.courseName = courseName;
    }

    public String getCourseID(){
        return courseID;
    }

    public String getCourseName(){
        return courseName;
    }

@Override
public String toString(){
        return "Course Id " +courseID+ ",Course Name: " +courseName;
}
}
