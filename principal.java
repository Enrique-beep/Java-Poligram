import java.util.ArrayList;
import java.util.Scanner;

/*
    Clase main: principal

    Descripcion:
    programa para calcular el área de Polígonos (Triángulos y Rectángulos) el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, y al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente: 

    - Una super clase llamada Polígono.
    - Una sub clase llamada Rectángulo.
    - Una sub clase llamada Triángulo.

    17 - Marzo - 2020
*/

public class principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>(); // Arreglo dinamico
    static Scanner buffer = new Scanner(System.in); 
    public static void main(String[] args) {
        // Llenado de datos
        llenarPoligono();

        // Muestra lod datos de los poligonos
        mostrarResultados();
    }

    public static void llenarPoligono(){
        int condition;
        char request;
        do {
            do {
                System.out.print("\nSelecciona un poligono: \n[1] Rectangulo\n[2] Triangulo \nOpcion: ");
                condition = buffer.nextInt(); buffer.nextLine();
            } while (condition<1 || condition>2); 

            switch (condition) {
                case 1: llenarRectangulo();
                    break;
                case 2: llenarTriangulo();
                    break;
                default:
                    break;
            }

            System.out.println("Desea otro poligono(?) (s/n): ");
            request = buffer.next().charAt(0);
            System.out.println();
        } while (request == 's' || request == 'S');
    }

    public static void llenarTriangulo(){
        System.out.print("\nIntroduzca el lado 1: ");
        double lado1 = buffer.nextDouble(); buffer.nextLine();
        System.out.print("Introduzca el lado 2: ");
        double lado2 = buffer.nextDouble(); buffer.nextLine();
        System.out.print("Introduzca el lado 3: ");
        double lado3 = buffer.nextDouble(); buffer.nextLine();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);
    }

    public static void llenarRectangulo(){
        System.out.print("\nIntroduzca el lado 1: ");
        double lado1 = buffer.nextDouble(); buffer.nextLine();
        System.out.print("Introduzca el lado 2: ");
        double lado2 = buffer.nextDouble(); buffer.nextLine();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
    }

    public static void mostrarResultados() {
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.area()+"\n");
        }
    }
}