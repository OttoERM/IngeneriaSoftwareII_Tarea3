public class Circulo extends Figura {
    private int diametro;
    private boolean imprimirRadio;
    public Circulo(String color, int cantidadDelados, int diametro, boolean imprimirRadio){
        super(color, cantidadDelados);
        this.diametro = diametro;
        this.imprimirRadio = imprimirRadio;
    }

    public void setDiametro(int diametro){
        this.diametro = diametro;
    }

    public void imprimirFigura(){
        if (imprimirRadio)
            System.out.println("Diametro: " + diametro + " Radio: " + ((double) diametro)/2 +
                    " Color: " + super.color + " Cantidad de lados: " + super.obtenerCantidadDelados());
        else
            System.out.println("Diametro: " + diametro + " Color: " + super.color +
                    " Cantidad de lados: " + super.obtenerCantidadDelados());
    }
}
