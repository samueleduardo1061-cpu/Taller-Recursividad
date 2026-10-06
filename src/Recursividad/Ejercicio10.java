import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¿Cuántos números enteros desea ingresar? : ");
        int tamaño = teclado.nextInt();
        
        // Validación: El tamaño del arreglo debe ser mayor a cero
        if (tamaño <= 0) {
            System.out.println("Ingrese un tamaño superior a 0");
        } else {
            //Crear el arreglo con el tamaño especificado por teclado
            int[] vector = new int[tamaño];
            
            //Leer y almacenar los valores en el arreglo
            System.out.println("Ingrese los " + tamaño + " valores enteros:");
            for (int i = 0; i < tamaño; i++) {
                System.out.print("Elemento [" + i + "]: ");
                vector[i] = teclado.nextInt();
            }
            
            
            int sumaTotal = calcularSumaVector(vector);
            
           
            System.out.println("\nLa suma de los elementos del vector es: " + sumaTotal);
        }
        
        teclado.close();
    }

    //funcion recursiva
    public static int calcularSumaVector(int[] arreglo) {
        // Caso base
        if (arreglo.length == 0) {
            return 0;
        }
        
        // Caso recursivo, sumar el primer elemento y llamar a la función con el resto del arreglo
        int primerElemento = arreglo[0];
        int[] restoDelArreglo = new int[arreglo.length - 1];
        System.arraycopy(arreglo, 1, restoDelArreglo, 0, arreglo.length - 1);
        
        return primerElemento + calcularSumaVector(restoDelArreglo);
    }
      
    
}
