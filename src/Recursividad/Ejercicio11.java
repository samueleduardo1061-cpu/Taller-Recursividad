//Complejidad (n)
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Filas y Columnas: ");
        int filas = teclado.nextInt();
        int columnas = teclado.nextInt();

        
        int[][] matriz = new int[filas][columnas];
        System.out.println("Introduzca los datos:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        
        int sumaTotal = sumarMatriz(matriz, 0, 0);
        System.out.println("La suma de la matriz es: " + sumaTotal);
        teclado.close();
    }

    //funcion recursiva
    public static int sumarMatriz(int[][] matriz, int f, int c) {
        // Caso base
        if (f == matriz.length) {
            return 0;
        }
        // Caso base 2
        if (c == matriz[f].length) {
            return sumarMatriz(matriz, f + 1, 0);
        }
        
        return matriz[f][c] + sumarMatriz(matriz, f, c + 1);
    }
}
