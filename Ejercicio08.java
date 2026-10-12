import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese el promedio (0-20): ");
            int promedio = entrada.nextInt();
            if (promedio < 11) {
                System.out.println("Desaprobado");
            } else if (promedio >= 11 && promedio <= 14) {
                System.out.println("Regular");
            } else if (promedio >= 15 && promedio <= 17) {
                System.out.println("Bueno");
            } else if (promedio >= 18 && promedio <= 20) {
                System.out.println("Excelente");
            } else {
                System.out.println("Promedio no válido");
            }
        }
    }
}