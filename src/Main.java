import Ejercicio.Parabolico;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Parabolico ejercicio1 = new Parabolico();

        try {
            System.out.println("Respolviendo ejercicio de movimiento parabolico");
            System.out.println("Ingrese el valor de la velocidad inicial: ");
            float VInicial = sc.nextFloat();
            ejercicio1.setvInicial(VInicial);
            System.out.println("Ingrese el valor del algulo que se forma al realizar el movimiento: ");
            float angulo = sc.nextFloat();
            ejercicio1.setAngulo(angulo);

            try {
                float velocidadx = ejercicio1.calcularComponenteX();
                float velocidady = ejercicio1.calcularComponenteY();
                System.out.println("El valor de la velocidad inicial en X es: " + velocidadx + "m/s");
                System.out.println("El valor de la velocidad inicial en Y es: " + velocidady + "m/s");
            }catch (Exception e) {
                System.out.println("Error al calcular los componentes de la velocidad"+ e.getMessage());
            }
            try {
                double desplazamientox = ejercicio1.Resultado();
                System.out.println("El desplazamiento horizontal del objeto en un tiempo de 2.45 segundos es:" + desplazamientox + "metros");
            }catch (Exception e) {
                System.out.println("Error al calcular el desplazamiento horizontal"+ e.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Error entrada invalida. Ingrese un numero valido");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Ocurrió algo inesperado."+e.getMessage());
        }
    }
}