import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExJava {
    public static void main(String[] args) {
        String name = "Inam";
        String regex = "^[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()){
            System.out.println("Valid");
        } else System.out.println("Invalid");
    }
}
