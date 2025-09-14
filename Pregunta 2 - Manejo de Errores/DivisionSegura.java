import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero:");
        int num2 = scanner.nextInt();

        try {
            int resultado = num1 / num2; // Se intenta realizar la división
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Se captura la excepción si el segundo número es cero
            System.out.println("Error: división entre cero no permitida");
        }
        
        scanner.close();
    }
}
