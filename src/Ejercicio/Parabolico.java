package Ejercicio;

public class Parabolico {
     private float vInicial;
     private float angulo;
     private double gravedad=9.8;
    int gravedadEntero = (int) gravedad;
    //Constructor vacío y con parámetros
    public Parabolico(float vInicial, float angulo) {
        this.vInicial = vInicial;
        this.angulo = angulo;
    }
    public Parabolico() {
        this.vInicial = 0;
        this.angulo = 0;
    }

    //Setters y getters
    public void setvInicial(float vInicial) {
        this.vInicial = vInicial;
    }
    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
    public float getvInicial() {
        return this.vInicial;
    }
    public float getAngulo() {
        return this.angulo;
    }
    public float calcularComponenteX() {
        return (float) (vInicial * Math.cos(Math.toRadians(angulo)));
    }
    public float calcularComponenteY() {
        return (float) (vInicial * Math.sin(Math.toRadians(angulo)));
    }

    //Metodos para realizar los cálculo
    public double ResultadoX(){
        double resultado = 0 + (calcularComponenteX())*(2.45)+(1/2)*(0)*Math.pow(2.45,2);
        return resultado;
    }
    public double ResultadoY1(){
    double resultado = (Math.pow(calcularComponenteY(),2))/(gravedad*2);
    return resultado;
    }
    public double ResultadoY2(){
        double resultado = (Math.pow(calcularComponenteY(),2))/(gravedadEntero*2);
        return resultado;
    }
}
