import java.util.regex.Pattern;

public class Regexp {
    public static void main(String[] args) {
        boolean res = Pattern.matches("q{2,5}va", "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqva");

        if(res==true)
        {
            System.out.println("Pattern Matched");
        }
        else {
            System.out.println("Pattern Not Matched");

        }
    }
}
