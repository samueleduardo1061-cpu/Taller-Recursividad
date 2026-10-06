//Complejidad O()  

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Solicitar numero
        System.out.print("Introduzca un número entero: ");
        int numero = teclado.nextInt();
        
        // Validación para evitar números negativos
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            double resultado = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
        
        teclado.close();
    }

    
    //Funcion recursiva

    public static double calcularFactorial(double n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }
}

