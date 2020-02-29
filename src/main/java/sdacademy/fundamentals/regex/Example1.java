package sdacademy.fundamentals.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as"));
        System.out.println(Pattern.matches(".t", "dt"));
        System.out.println(Pattern.matches(".d", "odt"));
        System.out.println(Pattern.matches(".d", "oodt"));
        System.out.println(Pattern.matches("..t", "odt"));

        //El.pasto validacija
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)$");
        Matcher emailMatcher = emailPattern.matcher("t.vest*@gmail.com");
        System.out.println(emailMatcher.matches());//true

    }
}
