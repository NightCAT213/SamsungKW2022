import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String n1 = "I";
        String n2 = "II";
        String n3 = "III";
        String n4 = "IV";
        String n5 = "V";
        String n6 = "VI";
        String n7 = "VII";
        String n8 = "VIII";
        String n9 = "IX";

        String n10 = "X";
        String n20 = "XX";
        String n30 = "XXX";
        String n40 = "XL";
        String n50 = "L";
        String n60 = "LX";
        String n70 = "LXX";
        String n80 = "LXXX";
        String n90 = "XC";
        String n100 = "C";

        String c1 = "", c2 = "";

        switch (x) {
            case 1: System.out.println("I"); break;
            case 2: System.out.println("II"); break;
            case 3: System.out.println("III"); break;
            case 4: System.out.println("IV"); break;
            case 5: System.out.println("V"); break;
            case 6: System.out.println("VI"); break;
            case 7: System.out.println("VII"); break;
            case 8: System.out.println("VIII"); break;
            case 9: System.out.println("IX"); break;
        }
        if (x > 9 && x < 100) {
            switch (x % 10) {
                case 1:
                    c1 = "I";
                    break;
                case 2:
                    c1 = "II";
                    break;
                case 3:
                    c1 = "III";
                    break;
                case 4:
                    c1 = "IV";
                    break;
                case 5:
                    c1 = "V";
                    break;
                case 6:
                    c1 = "VI";
                    break;
                case 7:
                    c1 = "VII";
                    break;
                case 8:
                    c1 = "VIII";
                    break;
                case 9:
                    c1 = "IX";
                    break;
            }
            switch (x / 10) {
                case 1:
                    c2 = "X";
                    break;
                case 2:
                    c2 = "XX";
                    break;
                case 3:
                    c2 = "XXX";
                    break;
                case 4:
                    c2 = "XL";
                    break;
                case 5:
                    c2 = "L";
                    break;
                case 6:
                    c2 = "LX";
                    break;
                case 7:
                    c2 = "LXX";
                    break;
                case 8:
                    c2 = "LXXX";
                    break;
                case 9:
                    c2 = "XC";
                    break;
            }
            System.out.println(c2 + c1);
        }
        if (x == 100) {
            System.out.println("C");
        }
    }
}
