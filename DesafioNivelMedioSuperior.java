import java.util.Scanner;
public class DesafioNivelMedioSuperior {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese las horas trabajadas: ");
            int horasTrabajadas = entrada.nextInt();
            System.out.print("Ingrese el pago por hora (S/): ");
            double pagoPorHora = entrada.nextDouble();
            // 1. Calcular salario bruto inicial (asumiendo tarifa normal por hora o según requerimiento)
            double salarioBruto = horasTrabajadas * pagoPorHora;
            // 2. Calcular impuesto según el salario bruto
            double impuesto;
            if (salarioBruto > 2500) {
                impuesto = salarioBruto * 0.12;
            } else {
                impuesto = salarioBruto * 0.07;
            }
            // 3. Evaluar bono si trabajó más de 48 horas
            double bono = 0;
            if (horasTrabajadas > 48) {
                bono = 300.0;
            }
            // 4. Calcular salario neto: Salario Bruto - Impuestos + Bono
            double salarioNeto = salarioBruto - impuesto + bono;
            // Mostrar resultados
            System.out.println("\n--- BOLETA DE PAGO ---");
            System.out.println("Salario bruto: S/" + salarioBruto);
            System.out.println("Impuesto aplicado: S/" + impuesto);
            System.out.println("Bono por horas extras (>48h): S/" + bono);
            System.out.println("Salario neto final: S/" + salarioNeto);
        }
    }
}