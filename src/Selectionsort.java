// Compara um elemento com todos e encontrar o maior/menor enquanto caminha pelo vetor

public class Selectionsort {
    public static int trocas;

    static void selectionSort(int tamanho, int[] vetor){
        trocas = 0;
        for (int i = 0; i < tamanho - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < tamanho; j++){
                if (vetor[j] < vetor[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                int temporario = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temporario;
                trocas++;
            }
        }
    }
}

