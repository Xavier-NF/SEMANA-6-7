import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de piezas producidas: ");
            int piezas = entrada.nextInt();
            double importeBase = piezas * 5.0;
            double incentivo;
            if (piezas > 1000) {
                incentivo = importeBase * 0.15;
            } else {
                incentivo = importeBase * 0.08;
            }
            double total = importeBase + incentivo;
            System.out.println("Importe base: S/" + importeBase);
            System.out.println("Incentivo: S/" + incentivo);
            System.out.println("Total a recibir: S/" + total);
        }
    }
}