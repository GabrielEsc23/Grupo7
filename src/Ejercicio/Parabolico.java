package Ejercicio;

public class Parabolico {
     private float vInicial;
     private float angulo;
    public Parabolico() {
        this.vInicial = 0;
        this.angulo = 0;
    }
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
    public double Resultado(){
        double resultado=0 + (calcularComponenteX())*(2.45)+(1/2)*(0)*Math.pow(2.45,2);
        return resultado;
    }
}
