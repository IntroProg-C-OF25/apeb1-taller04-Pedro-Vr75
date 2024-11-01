
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        double hijo1, hijo2, hijo3, gastos;
        System.out.print("Ingrese el gasto de su primer hijo: ");
        Scanner teclado = new Scanner(System.in);
        hijo1 = teclado.nextDouble();
        System.out.print("Ingrese el gasto de su segundo hijo: ");
        hijo2 = teclado.nextDouble();
        System.out.println("Ingrese el gasto de su tercer hijo: ");
        hijo3 = teclado.nextDouble();
        gastos = hijo1 + hijo2 + hijo3;
        System.out.println("Los gastos totales de sus hijos son= " + gastos);

    }
}
