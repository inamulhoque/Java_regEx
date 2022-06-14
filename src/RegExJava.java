import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExJava {
    public static void main(String[] args) {
        String name = "inam007@hotmail.com";
        String regex = "^[a-z\\d+_.-]+@[a-z\\d.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()){
            System.out.println("Valid");
        } else System.out.println("Invalid");
    }
}
