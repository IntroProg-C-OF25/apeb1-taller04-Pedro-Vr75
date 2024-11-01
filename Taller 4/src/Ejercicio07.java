
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        double costo_kvhora, kilovatio_consum, edad, valor, valor_mayoredad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo del kilovatio por hora: ");
        costo_kvhora = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de kilovatios consumidos al mes: ");
        kilovatio_consum = teclado.nextDouble();
        valor = kilovatio_consum * costo_kvhora;
        valor_mayoredad = valor - (valor * 0.10);
        System.out.println("Inngrese su edad: ");
        edad = teclado.nextDouble();
        if (edad >= 65) {
            System.out.println("El valor de la planilla de luz es = " + valor_mayoredad);
        } else {
            System.out.println("El valor de la planilla de luz es = " + valor);
        }
    }

}
