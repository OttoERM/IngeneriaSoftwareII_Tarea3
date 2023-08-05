public abstract class Figura {
    public String color;
    private final int cantidadDelados;

    public Figura(String color, int cantidadDelados){
        this.color = color;
        this.cantidadDelados = cantidadDelados;
    }
    public abstract void imprimirFigura();

    public int obtenerCantidadDelados(){
        return cantidadDelados;
    }

}
