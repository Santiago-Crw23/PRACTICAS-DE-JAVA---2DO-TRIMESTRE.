public class Estudiante {
    private String nombre;
    private int edad;
    private double nota1, nota2, nota3;

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 3.0;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + (aprobo() ? "Aprobado" : "Reprobado"));
        System.out.println("---------------------------");
    }
}
