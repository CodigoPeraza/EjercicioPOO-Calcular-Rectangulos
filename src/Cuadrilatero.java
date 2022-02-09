public class Cuadrilatero {
    private float lado1;
    private float lado2;

    //constructores
    public Cuadrilatero(float lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //getter y setters

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
