
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        double prestamo, interes_m, pago_mensual;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto del prestamo: ");
        prestamo = teclado.nextDouble();
        System.out.println("Ingrese el interes mensual: ");
        interes_m = teclado.nextDouble();
        pago_mensual = (prestamo / 12) + ((prestamo / 12) * interes_m / 100);
        System.out.println("El pago mesual que tiene que hacer por el prestamo es = " + pago_mensual);
    }

}
