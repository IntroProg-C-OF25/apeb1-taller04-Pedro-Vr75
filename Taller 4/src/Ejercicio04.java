import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        double costo_minuto, cantidad_minutos, valor;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el costo por minuto: ");
        costo_minuto = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de minutos: ");
        cantidad_minutos = teclado.nextDouble();
        valor = costo_minuto * cantidad_minutos;
        System.out.println("El valor de la planilla es = " + valor);
    }
}
