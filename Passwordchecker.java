class Passowrd{
    private final String password;
    public Passowrd(String password){
        this.password = password;
    }
    public String getStrength(){

        int length = password.length();
        if(length < 6){
            return "Weak";
        } else if (length < 10){
            return "Moderate";
        } else {
            return "Strong";
        }
    }
}
public class Passwordchecker {
    public static void main(String[] args) {
        Passowrd p = new Passowrd("mysecretpassword");
        System.out.println("Password strength: " + p.getStrength());
    }
}