import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        double lado_cuadrado, ancho_rec, area_total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        lado_cuadrado = teclado.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo");
        ancho_rec = teclado.nextDouble();
        area_total = (((lado_cuadrado * ancho_rec)/2)*3)+(lado_cuadrado * lado_cuadrado) + (lado_cuadrado * ancho_rec); 
        System.out.println("El Area total del poligono es = " + area_total);
    }
}
