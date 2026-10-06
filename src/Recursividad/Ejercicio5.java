//Complejidad O(n)
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero: ");
        int numero = teclado.nextInt();
        
        int sumaTotal = calcularSumaDigitos(numero);
        
        System.out.println("Entrada: " + numero + " -> Resultado: " + sumaTotal);
        
        teclado.close();
    }

    //Metodo recursivo
    public static int calcularSumaDigitos(int numero) {
        // Caso base
        if (numero == 0) {
            return 0;
        }
        
        //sumar el último dígito y llamar a la función con el resto del número
        return (numero % 10) + calcularSumaDigitos(numero / 10);
    }
}
