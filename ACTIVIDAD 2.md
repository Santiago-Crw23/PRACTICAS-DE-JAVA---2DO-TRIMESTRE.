# Comparación: Programación Estructurada y Programación Orientada a Objetos (POO)

---

## Diferencias principales

| Aspecto | Programación Estructurada | Programación Orientada a Objetos |
|----------|---------------------------|----------------------------------|
| **Enfoque** | Se basa en funciones o procedimientos que ejecutan pasos específicos. | Se centra en objetos que representan entidades del mundo real. |
| **Organización del código** | El código se divide en funciones o bloques lógicos. | El código se organiza en clases que agrupan atributos y métodos. |
| **Datos y operaciones** | Los datos y las funciones están separados. | Los datos y las operaciones se integran dentro de los objetos. |
| **Reutilización** | Se reutilizan funciones. | Se reutilizan clases y se extienden mediante herencia. |
| **Encapsulamiento** | No hay un control estricto sobre los datos. | Los datos se protegen mediante encapsulación (atributos privados). |
| **Ejemplo mental** | “Sigue estos pasos para preparar el café.” | “Pídele al objeto *Café* que se prepare a sí mismo.” |

---

## Ejemplo en el manejo de una bebida

### 1. Programación Estructurada

En la programación estructurada, la información se maneja con variables sueltas y funciones, por ello  el código se centra en los pasos a seguir.

```java
// Datos del producto:
String nombreBebida = "Mocaccino";
String tamaño = "Grande";
double precioBase = 8000;
String tipo = "Caliente";

// Función para calcular el precio final:
double calcularPrecio(double base, String tamaño) {
    if (tamaño.equals("Mediano")) {
        base += 1000;
    } else if (tamaño.equals("Grande")) {
        base += 2000;
    }
    return base;
}

// Ejecución
System.out.println("Bebida: " + nombreBebida);
System.out.println("Precio final: $" + calcularPrecio(precioBase, tamaño));



Ejemplo en Programación Orientada a Objetos (POO)

En este enfoque, la información y las acciones se agrupan dentro de una **clase**.  
Cada objeto creado a partir de esa clase representa una bebida específica con sus propios valores.

```java
// Clase Bebida:
public class Bebida {
    // Atributos
    String nombre;
    String tamaño;
    double precioBase;
    String tipo;

    public Bebida(String nombre, String tamaño, double precioBase, String tipo) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precioBase = precioBase;
        this.tipo = tipo;
    }

    // Método: calcular el precio final según el tamaño
    public double calcularPrecio() {
        double total = precioBase;
        if (tamaño.equals("Mediano")) {
            total += 1000;
        } else if (tamaño.equals("Grande")) {
            total += 2000;
        }
        return total;
    }

    // Método: mostrar información de la bebida
    public void mostrarInfo() {
        System.out.println("Bebida: " + nombre);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio final: $" + calcularPrecio());
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        //Creación de un objeto (instancia de la clase Bebida)
        Bebida mocaccino = new Bebida("Mocaccino", "Grande", 8000, "Caliente");

        mocaccino.mostrarInfo();
    }
}

