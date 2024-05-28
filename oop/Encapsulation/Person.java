package Encapsulation;

public class Person {
    String name;
    String password;
    String matric_number;
    String schoolName;
    int staffNo;
    String matricNumber;

    Person(String schoolName,String name, String password, String matricNumber, int staffNo){
        this.name = name;
        this.matricNumber = matricNumber;
        this.schoolName = schoolName;
        this.password = password;
        this.staffNo = staffNo;

        
    }

     

    String getName(){
        return name;
    }
    void setName(String name){
          this.name = name;
    }
    void setPassword(String password){
        this.password = password;
    }


}
