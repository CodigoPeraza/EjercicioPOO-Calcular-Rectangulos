import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float ladoA,ladoB;

        Scanner entradaT = new Scanner(System.in);
        Cuadrilatero objCuadrilatero;

        System.out.println("digite el lado A: ");
        ladoA = entradaT.nextFloat();
        System.out.println("digite el lado B: ");
        ladoB = entradaT.nextFloat();
        //si es cuadrado
        if (ladoA == ladoB) objCuadrilatero = new Cuadrilatero(ladoA);
        //si es rectangulo
        else objCuadrilatero = new Cuadrilatero(ladoA, ladoB);

        System.out.println("el perimetro de su cuadrilatero es: " + objCuadrilatero.getPerimetro());
        System.out.println("el area de su cuadrilatero es: " + objCuadrilatero.getArea());

    }
}
