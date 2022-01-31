import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        //  String target="bjjjzcjzczkjzaZbbibb";
        String target2 = "97974567478ffhdf7484587684yu584855475667547675747564   q87*&ab";
        // Pattern p2=Pattern.compile("[b]+");
        Pattern p = Pattern.compile("(0|91)?[0-9]{10}");
        //  Pattern p1=Pattern.compile("(0|91)?[0-9]{10}");
        Matcher m = p.matcher(target2);
        int ctr = 0;
        while (m.find()) {
            ctr++;
            System.out.println(m.start() + "    " + m.end() + "      " + m.group());

        }
        System.out.println(ctr);
        String s1 = "02345678911";
        System.out.println(s1.matches("(0|91)?[0-9]{10}"));
    }
}