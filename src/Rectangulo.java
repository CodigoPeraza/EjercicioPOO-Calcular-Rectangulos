public class Rectangulo extends Cuadrilatero {
    //atributos
    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    //métodos
    @Override
    public void CalcularArea() {
        area = lado1*lado2;
    }
    @Override
    public void CalcularPerimetro() {
        perimetro = 2*(lado1+lado2);
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
