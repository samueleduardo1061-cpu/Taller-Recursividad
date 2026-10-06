//Complejidad O(n)
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero positivo: ");
        int numero = teclado.nextInt();
        
        // Validación para asegurar que el número sea mayor que 0
        if (numero <= 0) {
            System.out.println("Ingrese un numero mayor que 0.");
        } else {
            double resultado = calcularSerieHarmonica(numero);
            // Muestra el resultado en 4 decimales
            System.out.printf("La sumatoria de la serie hasta 1/%d es: %.4f%n", numero, resultado);
        }
        
        teclado .close();
    }

    //Metodo recursivo
    public static double calcularSerieHarmonica(int n) {
        if (n == 1) {
            return 1.0; //caso base
        } else {
            return (1.0 / n) + calcularSerieHarmonica(n - 1); // Llamada recursiva
        }
    }
}
