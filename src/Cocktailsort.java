public class Cocktailsort {
    public static int trocas;
    static void cocktailSort(int tamanho, int[] vetor){
        trocas = 0;
        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temporario;

        while (trocou){
            trocou = false;

            for (int i = inicio; i < fim; i++){
                if (vetor[i] > vetor[i + 1]){
                    temporario = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temporario;
                    trocou = true;
                    trocas++;
                }
            }

            if (!trocou){
                break;
            }

            trocou = false;
            fim--;

            for (int i = fim; i > inicio; i--){
                if (vetor[i] < vetor[i - 1]){
                    temporario = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temporario;
                    trocou = true;
                    trocas++;
                }
            }

            inicio++;
        }

    }
}
