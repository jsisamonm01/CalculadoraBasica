import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero?");
        try {
            int x = sc.nextInt();
            System.out.println("Segundo numero?");
            int y = sc.nextInt();
            System.out.println("Operacion? (+/-/*/:/mcm/mcd)");
            String op = sc.next();
            int z = switch (op) {
                case "+"-> x + y;
                case "-" -> x - y;
                case "*" -> x * y;
                case ":" -> x / y;
                case "mcm" -> mcm(x, y);
                case "mcd" -> mcd(x, y);
                default -> throw new InputMismatchException();
            };
            System.out.println(x + op + y + "=" + z);
        } catch (InputMismatchException e) {
            System.out.println("Error: valor no valido!");
        } catch (ArithmeticException e) {
            System.out.println("Error: division por 0!");
        }
    }
    static int mcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int mcm(int a, int b) {
        return a * b / mcd(a, b);
    }
}
