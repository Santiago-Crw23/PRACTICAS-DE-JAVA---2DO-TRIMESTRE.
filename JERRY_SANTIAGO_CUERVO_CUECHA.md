# Semana 01 - Introducción al Paradigma Orientado a Objetos

**Estudiante:** Jerry Santiago Cuervo Cuecha  
**Ficha:** 3228973B  
**Dominio Asignado:** Cafetería "Café Aroma"

---

## 📋 Contexto del Dominio

**Tipo de Negocio:** Cafetería Especializada  
**Nombre Comercial:** Café Aroma  
**Ubicación:** Bogotá, Zona G  
**Especialidad:** Café de especialidad, repostería artesanal y desayunos gourmet

### Descripción Breve
Café Aroma es una cafetería especializada en café de origen colombiano, repostería artesanal y desayunos. Cuenta con 7 baristas y personal de cocina, atiende aproximadamente 120 clientes al día.

---

## 🎯 Objetivos de la Semana 01

Al finalizar esta semana, deberás ser capaz de:

1. Identificar objetos del mundo real en el contexto de una cafetería
2. Comprender las diferencias entre programación estructurada y POO
3. Reconocer los conceptos fundamentales: clase, objeto, atributo, método
4. Crear tu primera clase simple en Java aplicada al dominio

---

## 📝 Actividades Obligatorias

### Actividad 1: Identificación de Objetos (Ejercicio 01)

**Instrucciones:**
- Lee el material teórico de la semana sobre conceptos fundamentales de POO
- Identifica **5 objetos principales** que existen en una cafetería
- Para cada objeto, describe:
  - ¿Qué es? (definición)
  - ¿Qué características tiene? (atributos)
  - ¿Qué puede hacer? (comportamientos/métodos)

**Ejemplo:**
```
Objeto: Bebida
- ¿Qué es?: Un producto del menú de bebidas
- Características: nombre, tamaño, precio, tipo (caliente/frío), ingredientes
- Comportamientos: calcular precio según tamaño, agregar extras, preparar
```

**Entregable:** Documento con la identificación de 5 objetos del dominio de la cafetería.

---

### Actividad 2: Comparación de Paradigmas (Ejercicio 02)

**Instrucciones:**
- Investiga las diferencias entre programación estructurada y POO
- Escribe un ejemplo conceptual de cómo se manejaría la información de una bebida en:
  1. **Programación estructurada** (usando variables sueltas y funciones)
  2. **Programación orientada a objetos** (usando una clase)

**Entregable:** Documento comparativo con ejemplos explicados.

---

### Actividad 3: Primera Clase Simple (Ejercicio 03)

**Instrucciones:**
Crea tu primera clase en Java llamada `Beverage` (Bebida) con:
- **3 atributos** (ej: `name`, `size`, `price`)
- **1 constructor** que inicialice los atributos
- **1 método** que muestre la información de la bebida

**Código de ejemplo:**

```java
public class Beverage {
    // Atributos
    String name;
    String size;
    double price;
    
    // Constructor
    public Beverage(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
    
    // Método para mostrar información
    public void showInfo() {
        System.out.println("Bebida: " + name);
        System.out.println("Tamaño: " + size);
        System.out.println("Precio: $" + price);
    }
}
```

**Instrucciones adicionales:**
1. Crea una clase `Main` con el método `main`
2. Instancia **3 objetos diferentes** de tipo `Beverage`
3. Llama al método `showInfo()` para cada objeto

**Entregable:** Archivo `Beverage.java` y `Main.java` funcionando correctamente.

---

### Actividad 4: Múltiples Objetos (Ejercicio 04)

**Instrucciones:**
Amplía el ejercicio anterior:
- Crea al menos **5 objetos** de tipo `Beverage` con datos diferentes
- Cada bebida debe tener información coherente con una cafetería real
- Muestra la información de todas las bebidas

**Ejemplo de datos:**
- Cappuccino, Grande, $8500
- Latte, Mediano, $7500
- Espresso, Pequeño, $5000
- Mocha, Grande, $9500
- Americano, Mediano, $6000

**Entregable:** Código Java con 5 instancias de `Beverage` y su salida en consola.

---

## 🎓 Criterios de Evaluación

| Criterio | Peso | Descripción |
|----------|------|-------------|
| **Identificación de objetos** | 25% | Objetos identificados son relevantes al dominio de la cafetería |
| **Comprensión conceptual** | 25% | Demuestra entender diferencias entre paradigmas |
| **Implementación de clase** | 30% | Clase `Beverage` implementada correctamente con atributos, constructor y método |
| **Instanciación de objetos** | 20% | Crea múltiples objetos con datos coherentes |

---

## 📚 Recursos de Apoyo

### Material Teórico (Carpeta `1-teoria/`)
- `01-historia-evolucion-poo.md`
- `02-paradigmas-programacion.md`
- `03-conceptos-fundamentales-poo.md`
- `04-primer-programa-poo.md`

### Ejercicios Guiados (Carpeta `2-practica/`)
- `ejercicio-01-comparacion-paradigmas/`
- `ejercicio-02-primera-clase/`
- `ejercicio-03-multiples-objetos/`
- `ejercicio-04-modelado-mundo-real/`

### Glosario
Revisa el archivo `3-recursos/glosario.md` para términos clave de esta semana.

---

## 💡 Consejos

1. **No te compliques:** Esta semana es sobre conceptos básicos, no sobre código complejo
2. **Piensa en objetos reales:** Visualiza cómo funciona una cafetería real
3. **Pregunta:** Si tienes dudas sobre el dominio o los conceptos, consulta con el instructor
4. **Compila y prueba:** Asegúrate de que tu código compile antes de entregar

---

## 📅 Fecha de Entrega

**Entrega:** Según calendario definido por el instructor  
**Formato:** Código fuente (.java) y documentos en formato Markdown o PDF

---

**Nota Importante:** Este es tu dominio personal para todo el bootcamp. Todas las actividades futuras seguirán en el contexto de la cafetería Café Aroma. No compartas tu código directamente con otros estudiantes, ya que cada uno tiene un dominio diferente.
