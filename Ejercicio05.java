import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            int n1 = entrada.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int n2 = entrada.nextInt();
            System.out.print("Ingrese el tercer número: ");
            int n3 = entrada.nextInt();
            int mayor, menor;
            if (n1 >= n2 && n1 >= n3) {
                mayor = n1;
            } else if (n2 >= n1 && n2 >= n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
            if (n1 <= n2 && n1 <= n3) {
                menor = n1;
            } else if (n2 <= n1 && n2 <= n3) {
                menor = n2;
            } else {
                menor = n3;
            }
            int diferencia = mayor - menor;
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
            System.out.println("La diferencia entre ambos es: " + diferencia);
        }
    }
}