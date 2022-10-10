import java.io.PrintStream;
import java.util.Scanner;
 
public class MyProgram {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
 
    public static void main(String[] args) {
        int x1, x2;
        x1 = in.nextInt();
        if (x1 > 9 && x1 < 100) { // Число двузначное?
            x2 = x1 % 10; // вторая цифра
            x1 = x1 / 10; // первая цифра
            System.out.println(x1 + "; " + x2);
            if (x1 == x2) 
                System.out.println("В числе одинаковые цифры");
            else if (x2 < x1) 
                System.out.println("Первая цифра больше ");
                else 
                System.out.println("Вторая цифра больше ");
        }else // Число не двузначное
            System.out.println("Введенное число не двузначное");
        
        
        
        int n = in.nextInt();
        switch (n){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Try again");
                break;
        }
    }
}
