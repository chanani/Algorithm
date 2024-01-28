import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String s = "pPoooyY";
        int p = 0, y = 0;

        for(char x : s.toLowerCase().toCharArray()){
            if(x == 'p') p++;
            else if(x == 'y') y++;
        }

        System.out.println("p : " + p);
        System.out.println("y : " + y);
        if(p != y) System.out.println("false");
        else System.out.println("true");
    }
}