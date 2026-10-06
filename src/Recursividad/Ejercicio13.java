import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el valor de m: ");
        int m = teclado.nextInt();
        
        System.out.print("Introduce el valor de n: ");
        int n = teclado.nextInt();
        
        // Validación para evitar números negativos
        if (m < 0 || n < 0) {
            System.out.println("Los valores de m y n deben ser enteros no negativos.");
        } else {
            System.out.println("Calculando... Por favor espera.");
            int resultado = ackermann(m, n);
            System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado);
        }
        
        teclado.close();
    }


    //funcion recursiva
    public static int ackermann(int m, int n) {
        
        if (m == 0) {
            return n + 1;
        }
        
        
        if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        }
        
        
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
