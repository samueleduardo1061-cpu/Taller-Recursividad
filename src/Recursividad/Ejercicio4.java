//Complejidad O(n)
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero: ");
        int numero = teclado.nextInt();
        
        int numeroInvertido = invertir(numero);
        
        System.out.println("Entrada: " + numero + " -> Salida: " + numeroInvertido);
        
        teclado.close();
    }

    //Metodo recursivo
    public static int invertir(int numero) {
       if (numero < 10) {
            return numero; // Caso base
        } else {
            // Llamada recursiva: se toma el último dígito y se construye el número invertido
            int ultimoDigito = numero % 10;
            int restoDelNumero = numero / 10;
            int cantidadDeDigitos = (int) Math.log10(restoDelNumero) + 1; // Cantidad de dígitos restantes
            
            return ultimoDigito * (int) Math.pow(10, cantidadDeDigitos) + invertir(restoDelNumero);
        }
    }
}
