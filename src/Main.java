import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float ladoA,ladoB;

        Scanner entradaT = new Scanner(System.in);
        OperacionGeometrica objCuadrilatero;

        System.out.println("digite el lado A: ");
        ladoA = entradaT.nextFloat();
        System.out.println("digite el lado B: ");
        ladoB = entradaT.nextFloat();
        //si es cuadrado
        if (ladoA == ladoB) objCuadrilatero = new OperacionGeometrica(ladoA);
        //si es rectangulo
        else objCuadrilatero = new OperacionGeometrica(ladoA, ladoB);

        System.out.println("el perimetro de su cuadrilatero es: " + objCuadrilatero.getPerimetro());
        System.out.println("el area de su cuadrilatero es: " + objCuadrilatero.getArea());

    }
}
