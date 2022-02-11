import java.util.Scanner;

public class Rectangulo extends Cuadrilatero {
    //atributos
    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    //métodos
    @Override
    public void calcularArea() {
        area = lado1*lado2;
    }
    @Override
    public void calcularPerimetro() {
        perimetro = 2*(lado1+lado2);
    }

    public void pedirDatosConsola(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Lado 1: ");
        lado1 = entrada.nextFloat();
        System.out.println("Lado 2: ");
        lado2 = entrada.nextFloat();}
    public void mostrarDatosConsola(){
        System.out.println("lado1 = " + lado1);
        System.out.println("lado2 = " + lado2);
        System.out.println("perimetro = " + perimetro);
        System.out.println("area = " + area);
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
}
