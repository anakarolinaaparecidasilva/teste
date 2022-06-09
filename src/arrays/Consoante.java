package arrays;


/*
Faça um programa que leia um vetor de 6 caracteres
e diga quantas consoantes foram lidas
imprima as consoantes.
 */

import java.util.Scanner;

public class Consoante {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];

        int quantConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if (! (letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") ) ){

                consoantes[count] = letra;
                quantConsoantes++;
            }

            count++;

        }while (count < consoantes.length);

        System.out.println("Consoantes: ");

        // laço foreach onde lado esquerdo é o tipo do elemento e direito o array
        for (String consoante   : consoantes   ) {
            if (consoante != null)
            System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoante: " + quantConsoantes);
    }
}
