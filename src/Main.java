/*
* Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
*/
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //variables, se ajusta el tamaño del array a 5
        int[] numeros = new int[5];

        //Se hace captura y se guardan los números al usuario en for
        System.out.println("Ingresar 5 números enteros...");

        //Ciclo de lectura y escritura en el array
        for (int i = 0; i <numeros.length ; i++) {
            System.out.println("Ingresa número:");
            Scanner capturaNumeros = new Scanner(System.in);
            int numero = capturaNumeros.nextInt();
            numeros[i] = numero;
        }

        //Método para mostrar el array números-
        System.out.println("Números registrados: "+ Arrays.toString(numeros));
    }
}