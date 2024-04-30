public class Main {



        String username = "JaneDoe";
        String password = "password";

        String login(){
            if(username.equals("JaneDoe") && password.equals("password")){
                 return "sucess";
            }
            else {
                return "failed";
            }
        }
    

    //   public static void main(String[] args){
    //     Main jane = new Main();
    //     String user = jane.login();
    //    System.out.println(user);
      
    //  }

     public static void main(String[] args){
   CMP202 user = new CMP202();
   user.printUserDetails();

}


}