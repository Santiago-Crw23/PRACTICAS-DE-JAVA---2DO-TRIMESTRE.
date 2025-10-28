public class Beverage {
    // Atributos
    private String nombre;
    private String tamanio;
    private double precio;

    // Constructor
    public Beverage(String nombre, String tamanio, double precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio = precio;
    }

    // Método para mostrar información
    public void showInfo() {
        System.out.println("Bebida: " + nombre);
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Valor: $" + precio);
        System.out.println("\n");
    }

    // Método principal (punto de entrada del programa)
    public static void main(String[] args) {
        // Crear un objeto de tipo Beverage
        Beverage bebida1 = new Beverage("Jugo de naranja", "Mediano", 4500);

        // Mostrar su información
        bebida1.showInfo();
    }
}
