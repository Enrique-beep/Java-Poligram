/*
    Clase hija: Triangulo
    17 - Marzo - 2020
*/
public class Triangulo extends Poligono {
    //---ATRIBUTOS---------------------
    private double lado1;
    private double lado2;
    private double lado3;

    //---CONSTRUCTORES-----------------
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //---ENCAPSULAMIENTO---------------
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    //---METODOS-----------------------
    @Override
    public String toString() {
        return "Triangulo:\n"+super.toString()+"\nLado 1: " + lado1 + "\nLado 2: " + lado2 + "\nLado 3: " + lado3;
    }

    @Override
    public double area(){
        // Formuia de Heron 
        double p = (lado1 + lado2 + lado3)/2;
        return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
    }
}