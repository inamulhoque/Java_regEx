import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExJava {
    public static void main(String[] args) {
        String name = "+91 9101149275";
        String regex = "\\+\\d\\d+\\s+[\\d]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()){
            System.out.println("Valid");
        } else System.out.println("Invalid");
    }
}
