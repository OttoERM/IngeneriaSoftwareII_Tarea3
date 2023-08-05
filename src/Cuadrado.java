public class Cuadrado extends Figura {
    private int longitudLado;

    public Cuadrado(String color, int cantidadDelados, int longitudLado){
        super(color, cantidadDelados);
        this.longitudLado = longitudLado;
    }

    public void setLongitudLado(int longitudLado){
        this.longitudLado = longitudLado;
    }

    public int getLongitudLado(){
        return longitudLado;
    }

    public int obtenerArea(){
        return longitudLado * longitudLado;
    }

    public void imprimirFigura(){
        System.out.println("Aerea: " + obtenerArea() + " Color: " + super.color +
                " Cantidad de lados: " + super.obtenerCantidadDelados());
    }

}
