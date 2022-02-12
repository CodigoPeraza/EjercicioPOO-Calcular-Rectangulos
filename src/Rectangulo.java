import java.util.Scanner;

public class Rectangulo extends Cuadrilatero {
    //atributos

    //métodos
    @Override
    public void calcularArea() {
        setArea(getLado1()*getLado2());
    }
    @Override
    public void calcularPerimetro() {
        setPerimetro(2*(getLado1()+getLado2()));
    }

    public void pedirDatosConsola(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Lado 1: ");
        setLado1(entrada.nextFloat());
        System.out.println("Lado 2: ");
        setLado2(entrada.nextFloat());
    }

    public void mostrarDatosConsola(){
        System.out.println("lado1 = " + getLado1());
        System.out.println("lado2 = " + getLado2());
        System.out.println("perimetro = " + getPerimetro());
        System.out.println("area = " + getArea());
    }
}
