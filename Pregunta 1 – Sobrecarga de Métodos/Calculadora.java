public class Calculadora {

    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método sobrecargado para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sobrecargado para sumar dos números decimales (double)
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Demostración de los métodos sobrecargados
        System.out.println("Suma de dos enteros: " + calc.sumar(5, 10)); // Llama al primer método
        System.out.println("Suma de tres enteros: " + calc.sumar(5, 10, 15)); // Llama al segundo método
        System.out.println("Suma de dos decimales: " + calc.sumar(5.5, 10.5)); // Llama al tercer método
    }
}
