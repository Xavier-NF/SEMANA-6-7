import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese los kilómetros recorridos: ");
            double km = entrada.nextDouble();
            double tarifa;
            if (km <= 3) {
                tarifa = 8.0;
            } else {
                tarifa = 8.0 + ((km - 3) * 2.50);
            }
            System.out.println("La tarifa total del taxi es: S/" + tarifa);
        }
    }
}