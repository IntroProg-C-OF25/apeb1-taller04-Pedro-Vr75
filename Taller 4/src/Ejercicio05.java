
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        double cpu, tecladopc, pantalla, raton, costo_total;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo del CPU: ");
        cpu = teclado.nextDouble();
        System.out.print("Ingrese el costo del teclado: ");
        tecladopc = teclado.nextDouble();
        System.out.println("Ingrese el costo de la pantalla: ");
        pantalla = teclado.nextDouble();
        System.out.println("Ingrese el costo del ratón: ");
        raton = teclado.nextDouble();
        costo_total = cpu + tecladopc + pantalla + raton;
        System.out.println("El costo total del computador es = " + costo_total);

    }
}
