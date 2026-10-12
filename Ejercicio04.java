import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese los Kwh consumidos: ");
            double Kwh = entrada.nextInt();
            double monto;
            if (Kwh <= 100) {
                monto = Kwh * 0.80;
            } else {
                monto = Kwh * 1.20;
            }
            System.out.println("Monto a pagar : S/" + monto );
        }
    }
}