//complejidad (O(n^2))
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el valor límite para la serie: ");
        int limite = teclado.nextInt();
        
        System.out.println("Serie de Fibonacci hasta el valor " + limite + ":");
        
        int n = 0;
        int terminoActual = calcularFibonacci(n);
        
        // El bucle se ejecuta mientras el valor no supere el limite
        while (terminoActual <= limite) {
            System.out.print(terminoActual + " ");
            n++;
            terminoActual = calcularFibonacci(n); // Calcula el siguiente término
        }
        System.out.println(); 
        
        teclado.close();
    }

    //funcion recursiva
    public static int calcularFibonacci(int n) {
        //Caso base
        if (n == 0) return 0;
        if (n == 1) return 1;
        
       
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
