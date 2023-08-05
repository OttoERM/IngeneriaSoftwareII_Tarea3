public class Main {
    public static void main(String[] args) {
        Cuadrado cuadradoTest = new Cuadrado("Rojo", 4, 5);
        cuadradoTest.imprimirFigura();

        Circulo circuloTest = new Circulo("Amarillo", 1, 13, true);
        circuloTest.imprimirFigura();
    }
}