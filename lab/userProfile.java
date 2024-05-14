package lab;

public class userProfile {
    private int userid , age;
    private String email, name , password , id;
    private String jpg , png , pdf;

    public int get_user_id(int userid){
        return userid; // somethin
    }
    public int get_password(int password){
        return password;
    }
    public String get_name(String name){
        return name ;
    }
    public int get_age(int age){
        return age;
    }
    public String get_email(String email){
        return email;
    }
    public void editprofile(){
        //...
    }
    public void show_documents(){
        //...
    }

    
}
class user {
    public void login ( int user_id , int password ){
        //...
    }
    public void recoverPassword(){
        //...
    }
    public void log_out(){
        //...

    }
}
class customer extends user {
    private boolean verification_status ; // false or true u get it 

    public boolean get_verfication(){
        return false ;
    }
    public String apply_verification (String docs ){
        return docs ;
    }
}
