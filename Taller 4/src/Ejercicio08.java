
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        double netflix, youtube, dropbox, spotify, valor_mensual, valor_menor30, edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo mensual del netflix: ");
        netflix = teclado.nextDouble();
        System.out.println("Ingrese el costo mensual del youtube premium: ");
        youtube = teclado.nextDouble();
        System.out.println("Ingrese el costo mensual del spotify premium: ");
        spotify = teclado.nextDouble();
        valor_mensual = netflix + youtube + spotify;
        valor_menor30 = valor_mensual - (valor_mensual * 0.20);
        System.out.println("Ingrese su edad");
        edad = teclado.nextDouble();
        if (edad < 30) {
            System.out.println("El valor mensual total a pagar es = " + valor_menor30);
        } else {
            System.out.println("El valor mensual total a pagar es = " + valor_mensual);
        }
    }

}
