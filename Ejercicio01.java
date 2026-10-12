import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese las horas trabajadas: ");
            int horas = entrada.nextInt();
            double salario;
            if (horas > 40) {
                int horasExtras = horas - 40;
                salario = (40 * 20) + (horasExtras * 40);
            } else {
                salario = horas * 20;
            }
            System.out.println("El salario total es: S/" + salario);
        }
    }
}