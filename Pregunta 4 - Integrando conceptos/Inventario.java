import java.util.ArrayList;

class Producto {
    String nombre;
    double precio;
    int cantidad;

    // Constructor con nombre, precio y cantidad
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Constructor con nombre y precio
    public Producto(String nombre, double precio) {
        this(nombre, precio, 0); // Llama al constructor principal con cantidad 0
    }

    // Constructor solo con nombre
    public Producto(String nombre) {
        this(nombre, 0.0, 0); // Llama al constructor principal con precio y cantidad 0
    }
    
    @Override
    public String toString() {
        return "Producto{" + "nombre='" + nombre + '\'' + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
}

public class Inventario {
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    // Método para agregar producto con nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        // Manejo de errores para precios y cantidades negativas
        if (precio < 0 || cantidad < 0) {
            System.out.println("Error: El precio y la cantidad no pueden ser negativos. Producto no agregado.");
            return;
        }
        listaProductos.add(new Producto(nombre, precio, cantidad));
    }

    // Método sobrecargado para agregar producto con nombre y precio
    public void agregarProducto(String nombre, double precio) {
        // Llama al método principal con cantidad 0
        agregarProducto(nombre, precio, 0); 
    }

    // Método sobrecargado para agregar producto solo con nombre
    public void agregarProducto(String nombre) {
        // Llama al método principal con precio y cantidad 0
        agregarProducto(nombre, 0.0, 0);
    }
    
    public void mostrarInventario() {
        System.out.println("\nInventario actual:");
        listaProductos.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        // Demostración de los métodos sobrecargados y manejo de errores
        inventario.agregarProducto("Laptop");
        inventario.agregarProducto("Mouse", 25.50);
        inventario.agregarProducto("Teclado", 50.00, 10);
        inventario.agregarProducto("Monitor", -100.00, 5); // Este no se agregará por error
        
        inventario.mostrarInventario();
    }
}
