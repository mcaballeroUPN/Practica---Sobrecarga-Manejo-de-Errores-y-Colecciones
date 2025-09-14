import java.util.InputMismatchException;
import java.util.Scanner;

// Definir una excepción personalizada
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class ManejoExcepcionesMultiples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese un número entero:");

        try {
            // Leer la línea completa como String para manejar el NumberFormatException
            String input = scanner.nextLine();
            int numero = Integer.parseInt(input); // Intenta convertir el String a int

            if (numero < 0) {
                // Si el número es negativo, lanzar nuestra excepción personalizada
                throw new NumeroNegativoException("Error: El número ingresado es negativo.");
            }

            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            // Captura si el usuario ingresó un valor no numérico
            System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero.");
        } catch (NumeroNegativoException e) {
            // Captura nuestra excepción personalizada
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
