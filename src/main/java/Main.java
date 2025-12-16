import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Primer numero?");
        try {
            int x = sc.nextInt();
            System.out.println("¿Segundo numero?");
            int y = sc.nextInt();
            System.out.println("¿A qué operación vas a someter a los pobres numeritos? (+/-)");
            String op = sc.next();
            int z = switch (op) {
                case "+"-> x + y;
                case "-" -> x - y;
                default -> throw new InputMismatchException();
            };
            System.out.println(x + op + y + "=" + z + ". Maravilloso resultado :D");
        } catch (InputMismatchException e) {
            System.out.println("Error: valor no valido!");
        }
    }
}
