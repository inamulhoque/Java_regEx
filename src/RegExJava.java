import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExJava {
    public static void main(String[] args) {
        String name = "Assam@123";
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()){
            System.out.println("Valid");
        } else System.out.println("Invalid");
    }
}
