
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la base:");
        base = teclado.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = teclado.nextDouble();
        area = (base * altura) / 2;
        System.out.println("area del triangulo es = " + area);
    }

}
