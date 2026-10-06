//Complejidad O(n)
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca el dividendo: ");
        int dividendo = teclado.nextInt();
        
        System.out.print("Introduzca el divisor: ");
        int divisor = teclado.nextInt();
        
        // Valida para que no se pueda dividir entre 0
        if (divisor == 0) {
            System.out.println("Error: La división por cero no está definida.");
        } else if (dividendo < 0 || divisor < 0) {
            System.out.println("Solo positivos");
        } else {
            int cociente = calcularCociente(dividendo, divisor);
  
            
            System.out.println("Resultado de " + dividendo + " / " + divisor + ":");
            System.out.println("Cociente:" + cociente);

        }
        
        teclado.close();
    }

    //funcion recursiva
    public static int calcularCociente(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0; //Caso base
        } 
            return 1 + calcularCociente(dividendo - divisor, divisor); 
        
    }
}
