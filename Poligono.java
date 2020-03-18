/*
    Clase padre: Poligono
    17 - Marzo - 2020
*/

public abstract class Poligono {
    //---ATRIBUTOS---------------------
    protected int numeroLados;

    //---CONSTRUCTOR-------------------
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    //---ENCAPSULAMIENTO---------------
    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    //---METODOS-----------------------
    @Override
    public String toString() {
        return "Numero de lados: " + numeroLados;
    }

    public abstract double area();
}