import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese el sueldo: ");
            double sueldo = entrada.nextInt();
            double prestamoMaximo;
            if (sueldo >= 3000) {
                prestamoMaximo = sueldo * 5;
            } else {
                prestamoMaximo = sueldo * 2;
            }
            System.out.println("Puede solicitar un prestamo de hasta S/" + prestamoMaximo);
        }
    }
}