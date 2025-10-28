public class main {
    public static void main(String[] args) {
        Beverage bebida1 = new Beverage("Capuccino", "pequeño", 4500);
        Beverage bebida2 = new Beverage("Espresso", "unico", 5000);
        Beverage bebida3 = new Beverage("jugo de naranja", "mediano", 4500);

        bebida1.showInfo();
        bebida2.showInfo();
        bebida3.showInfo();
    }
}
