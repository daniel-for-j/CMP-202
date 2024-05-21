public class Student extends User{
 String matric_no;
 int admission_no;

 public static void  registerCourse(String courseName, int courseCode, int courseUnit){
    System.out.println("Course Name: " + courseName);
    System.out.println("Course Code: " + courseCode);
    System.out.println("Course Unit: " + courseUnit);

    System.out.println("Course registered Successfully. See Details Above");

 }   

 public static void checkResult(String matric_no){
    Student newStudent = new Student();
    if(newStudent.login().equals("Logged In")){
       System.out.println("Open results");
    }
    else {
       System.out.println("Incorrect Info");
    }
 }
}