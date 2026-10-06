//Complejidad O(n)
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca la base: ");
        int base = teclado.nextInt();
        
        System.out.print("Introduzca el exponente entero no negativo: ");
        int exponente = teclado.nextInt();
        
        if (exponente < 0) {
            System.out.println("Solo exponentes positivos");
        } else {
            int resultado = calcularPotencia(base, exponente);
            System.out.println("Resultado: " + base + "^" + exponente + " = " + resultado);
        }
        
        teclado.close();
    }

    //funcion recursiva
    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) { //Caso base
            return 1;
        }
        
        return base * calcularPotencia(base, exponente - 1);
    }
}
