/*
    Clase hija: Rectangulo
    17 - Marzo - 2020
*/

public class Rectangulo extends Poligono {
    //---ATRIBUTOS---------------------
    private double lado1;
    private double lado2;

    //---CONSTRUCTORES-----------------
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
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

    //---METODOS-----------------------
    @Override
    public String toString() {
        return "Rectangulo"+super.toString()+"\nLado 1: " + lado1 + "\nLado 2: " + lado2;
    }

    @Override
    public double area(){
        return lado1 * lado2;
    }
}