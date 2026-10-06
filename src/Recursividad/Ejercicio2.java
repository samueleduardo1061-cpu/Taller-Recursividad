//Complejidad O(n)
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Solicitar numero
        System.out.print("Introduzca un número entero: ");
        int numero = teclado.nextInt();
        
        //Validar para numeros negativos
        if (numero < 0) {
            System.out.println("Introduzca un número entero positivo.");
        } else {
            int resultado = calcularSumatoria(numero);
            System.out.println("La sumatoria desde 1 hasta " + numero + " es: " + resultado);
        }
        
        teclado.close();
    }

    //Metodo recursivo
    public static int calcularSumatoria(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calcularSumatoria(n - 1);
    }
}