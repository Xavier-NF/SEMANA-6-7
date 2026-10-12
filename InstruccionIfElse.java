import java.util.Scanner;
public class InstruccionIfElse {
public static void main(String[] args) {

try (Scanner estrada = new Scanner(System.in)) {
    System.out.print("Ingrese una edad: ");
    int edad = estrada.nextInt();
    if( edad >= 18 ){
    System.out.println("Mayor de edad");
    }else{
    System.out.println("Menor de edad");
    }
}


System.out.println("Adiós!");
} // Fin del método main
} // Fin de la clase InstruccionIfElse>