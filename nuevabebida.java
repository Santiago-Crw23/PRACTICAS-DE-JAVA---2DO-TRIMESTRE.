public class nuevabebida {
    public static void main(String[] args) {
        Beverage bebida1 = new Beverage("Capuccino", "pequeño", 4500);
        Beverage bebida2 = new Beverage("Espresso", "unico", 5000);
        Beverage bebida3 = new Beverage("Te Chai", "grande", 10500);
        Beverage bebida4 = new Beverage("jugo de naranja", "mediano", 4500);
        Beverage bebida5 = new Beverage("Chocolate en leche", "grandde", 10000);

        bebida1.showInfo();
        bebida2.showInfo();
        bebida3.showInfo();
        bebida4.showInfo();
        bebida5.showInfo();
    }
}
