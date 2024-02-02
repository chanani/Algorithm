
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        String s = "asdf123!!///";
        for (char x : s.toCharArray()) {
        }

        String n = s.replaceAll("[]", "");
        System.out.println(n);

    }
}