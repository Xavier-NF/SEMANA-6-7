import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese el peso del paquete: ");
            double peso = entrada.nextDouble();
            double exceso = peso - 50;
            if (peso >= 50) {
                System.out.println("El paquete excede el limite. Sobrepasa por: " + exceso + " kg");
            } else {
                System.out.println("El paquete es aceptado");
            }
        }
    }
}