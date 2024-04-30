public class CMP202 {
int age;
float height;
String name;
String password;

void printUserDetails() {
    age = 23;
    height = 170;
    name = "Daniel";
    name.length();

    password = "123456";
    if(password.contains("123456") || password.contains("abcdef")){
        System.out.println("This Password is too easy");
    }
    
}



}