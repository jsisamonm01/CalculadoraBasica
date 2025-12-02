import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Primer numero?");
            int x = sc.nextInt();
            System.out.println("Segundo numero?");
            int y = sc.nextInt();
            System.out.println("Operacion? (+ - / *)");
            char op = sc.next().charAt(0);
            int z;
            switch (op) {
                case '+':
                    z = x + y;
                    break;
                case '-':
                    z = x - y;
                    break;
                case '/':
                    z = x / y;
                    break;
                case '*':
                    z = x * y;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            System.out.println(x + op + y + "=" + z);
        } catch (ArithmeticException e) {
            System.out.println("Error: división por 0");
        } catch (InputMismatchException e) {
            System.out.println("Error: argumento no valido (solo valen numeros)");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: operacion no valida");
        }
    }
} 