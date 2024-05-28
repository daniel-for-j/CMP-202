public class Admin extends User{
String staffNo;

String uploadResult(String course,float score){
    String output = course + " " + score;
    return output;
}

}