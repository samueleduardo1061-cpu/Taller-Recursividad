//Complejidad O(1)
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca el primer número: ");
        int numero1 = teclado.nextInt();
        
        System.out.print("Introduzca el segundo número: ");
        int numero2 = teclado.nextInt();
        
        // Convertimos a valores absoluto por si se digita negativo
        int numeroabsoluto1 = Math.abs(numero1);
        int numeroabsoluto2 = Math.abs(numero2);
        
        // Garantizamos que el primer parámetro sea el mayor o igual (M >= N)
        int resultado;
        if (numeroabsoluto1 >= numeroabsoluto2) {
            resultado = calcularMCD(numeroabsoluto1, numeroabsoluto2);
        } else {
            resultado = calcularMCD(numeroabsoluto2, numeroabsoluto1);
        }
        
        System.out.println("El MCD de " + numero1 + " y " + numero2  + " es: " + resultado);
        
        teclado.close();
    }

    /**
     * Función recursiva para calcular el M.C.D. usando el algoritmo de Euclides
     */
    public static int calcularMCD(int m, int n) {
        // Caso base
        if (n == 0) {
            return m;
        }
        // Llamada recursiva
        return calcularMCD(n, m % n);
    }
}
