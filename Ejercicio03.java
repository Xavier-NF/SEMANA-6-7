import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de computadoras: ");
            int cantidad = entrada.nextInt();
            double precioUnitario = 2500;
            double importe = cantidad * precioUnitario;
            double descuento;
            if (cantidad >= 5) {
                descuento = importe * 0.12;
            } else {
                descuento = importe * 0.05;
            }
            double total = importe - descuento;
            System.out.println("Importe: S/" + importe );
            System.out.println("Descuento: S/" + descuento );
            System.out.println("Total: S/" + total );
        }
    }
}