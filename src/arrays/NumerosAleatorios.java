package arrays;

/*
Faça um programa que leia 20 números inteiros aleatorios (entre 0 e 100)
armazena-os num vetor
ao final mostre os numeros e seus sucessores
 */


import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        // random classe para gerar numeros aleatorios
        Random random = new Random();

        int numerosAleatorios[] = new int [20];

        for (int i = 0 ; i< numerosAleatorios.length;i++ ) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Numeros aleatorios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");

        }

        System.out.print("\nSucessores dos Numeros aleatorios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero + 1 ) + " ");

        }

        System.out.print("\nAntecessores dos Numeros aleatorios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero - 1 ) + " ");

        }
    }
}
