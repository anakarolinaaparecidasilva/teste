package arrays;

/*
Crie um vetor de 6 numeros inteiros
e mostre-os na ordem inversa.
 */

public class OrdemInversa {
    public static void main(String[] args) {

        // vetor unidimensional (6 elementos e 5 posições)
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        // System.out.println(vetor.length);
        //System.out.println(vetor);
        System.out.print("Vetor: ");

        int count = 0;

        //length retorna o tamanho do array

        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;


        }
        System.out.print("\nVetor: ");

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");

        }
    }
}
