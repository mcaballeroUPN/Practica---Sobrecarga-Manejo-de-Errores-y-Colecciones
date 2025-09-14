import java.util.ArrayList;

public class GestionEstudiantes {

    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres de estudiantes
        ArrayList<String> nombresEstudiantes = new ArrayList<>();

        // Agregar al menos 5 nombres a la lista
        nombresEstudiantes.add("Ana");
        nombresEstudiantes.add("Luis");
        nombresEstudiantes.add("Maria");
        nombresEstudiantes.add("Carlos");
        nombresEstudiantes.add("Sofia");

        // Mostrar la lista completa
        System.out.println("Lista completa de estudiantes: " + nombresEstudiantes);

        // Eliminar el tercer nombre (índice 2, ya que los índices comienzan en 0)
        if (nombresEstudiantes.size() >= 3) {
            nombresEstudiantes.remove(2); // Elimina "Maria"
        }

        System.out.println("\n--- Después de eliminar el tercer nombre ---");
        // Recorrer la lista nuevamente e imprimir los nombres restantes
        for (String nombre : nombresEstudiantes) {
            System.out.println(nombre);
        }
    }
}
