//Complejidad O(n)
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();
        
        int resultado = calcularMultiplicacion(numero1, numero2);
        
        System.out.println("Resultado de " + numero1 + " * " + numero2 + " = " + resultado);
        
        teclado.close();
    }

    //funcion recursiva
    public static int calcularMultiplicacion(int a, int b) {
       
        if (b == 0) {
          return 0; // Caso base
        } else if (b > 0) {
            return a + calcularMultiplicacion(a, b - 1); // suma 'a' un total de 'b' veces
        } else {
            return -calcularMultiplicacion(a, -b); //si b es negativo, invertimos b y resultado invertido
        }
    }
}
