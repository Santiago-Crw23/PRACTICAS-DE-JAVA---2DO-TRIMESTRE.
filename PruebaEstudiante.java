public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 20, 4.5, 4.0, 4.2);
        estudiante1.mostrarInformacion();

        Estudiante estudiante2 = new Estudiante("María García", 22, 3.8, 4.2, 3.5);
        estudiante2.mostrarInformacion();
    }
}
