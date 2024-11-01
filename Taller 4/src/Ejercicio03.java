import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        double numero, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero entre el 2 y 6: ");
        numero = teclado.nextDouble();
        if (numero >= 2 && numero <= 6) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                resultado = numero * i;
                System.out.println(numero + " * " + i + " = " + resultado);
            }
        } else {
            System.out.println("El número debe estar entre 2 y 6.");
        }
        
    }
}
