public class User {
    String name;
    String password;


    String login(){
        return "Logged In";
    }

    String register(){
        if (name.equals("") & password.equals("")){
            System.out.println("Cannot be empty")
        }
        else {
           return "Registered Successfully";
        }
    }
}