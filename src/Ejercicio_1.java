/*
* 1. Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
* 2. Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
* 3. Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números
*/
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        //variables, se ajusta el tamaño del array a 5, se declaran las variables para determinar cuál es número son menor y mayor dentro del array
        int[] numeros = new int[5];
        int numeroMenor = numeros[0];
        int numeroMayor = numeros[0];
        int contador = 0;
        double promedio = 0;

        //Se hace captura y se guardan los números al usuario en for
        System.out.println("Ingresar 5 números enteros...");

        //Ciclo de lectura y escritura en el array
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("Ingresa número:");
            Scanner capturaNumeros = new Scanner(System.in);
            int numero = capturaNumeros.nextInt();
            //Antes de que llene al array se van sumando los números capturados
            contador = contador + numero;
            numeros[i] = numero;

            //Se comparan uno a uno los valores para determinar si el menor o mayor y asignar el valor a cada variable según corresponda
            if (numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }

        //Promedio del array
        promedio = (float) contador / numeros.length;

        //Mostrar el array como cadena con los números y cuál es el número menor y mayor dentro del array registrado
        System.out.println("Números registrados son: "+ Arrays.toString(numeros));
        System.out.println("Es el menor: " + numeroMenor + " Es el mayor: " + numeroMayor );
        System.out.println("Suma de todos los números: "+ contador + " el promedio es: "+ promedio);
    }
}