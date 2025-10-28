// separa os elementos desordenados em grupos (baldes)
// ordena os elementos desordenados de cada balde separadamente, usando normalmente bubble sort,
// ou então usando recursivamente bucket sort entre os baldes.
// no final, junta os elementos ordenados


public class Bucketsort {
    static final int B = 5;
    public static int trocas;

    static void bucketSort(int[] vetor, int tamanho, int min, int max) {
        trocas = 0;

        int i, j, k;
        int div = (max - min) / B;
        if (div == 0) div = 1;

        int[][] buckets = new int[B][tamanho]; // cada bucket pode ter até 'tamanho' elementos
        int[] contagem = new int[B];

        i = 0;
        while (i < B) {
            contagem[i] = 0;
            i++;
        }

        // distribui elementos nos baldes
        i = 0;
        while (i < tamanho) {
            int indice = (vetor[i] - min) / div;
            if (indice < 0) indice = 0;
            else if (indice >= B) indice = B - 1;
            buckets[indice][contagem[indice]] = vetor[i];
            contagem[indice]++;
            i++;
        }

        // ordena cada bucket com BubbleSort
        i = 0;
        while (i < B) {
            if (contagem[i] > 0) {
                Bubblesort.bubbleSort(contagem[i], buckets[i]);
                trocas += Bubblesort.trocas;
            }
            i++;
        }

        k = 0;
        i = 0;
        while (i < B) {
            j = 0;
            while (j < contagem[i]) {
                vetor[k] = buckets[i][j];
                k++;
                j++;
            }
            i++;
        }
    }
}
