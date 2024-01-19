import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "+1234";

        if(s.matches("[0-9]+")) System.out.println(s);
        else if (s.charAt(0) == '+') System.out.println(s.substring(1, s.length()));
        else if (s.charAt(0) == '-') System.out.println(s);;

    }
}