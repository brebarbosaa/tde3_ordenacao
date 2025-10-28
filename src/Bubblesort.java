// O conjunto de dados é percorrido n - 1 vezes. Cada vez,
// compara o elemento i com seu sucessor. Se o sucessor é menor do que
//i então os elementos são trocados.
//

public class Bubblesort {
    public static int trocas;

    static void bubbleSort(int tamanho, int[] vetor) {
        trocas = 0;
        int temporario = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 1; j < tamanho; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    temporario = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temporario;
                    trocas++;
                }
            }
        }
    }
}
