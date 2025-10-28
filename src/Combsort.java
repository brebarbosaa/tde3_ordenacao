// compara elementos que estão distantes por um "gap", que inicialmente é do tamanho do vetor, e troca esses elementos se necessário.
// Reduz o gap usando fator de redução 1.3 até que se torne 1. Ao chegar em 1, o algoritmo se torna um bubble sort.

public class Combsort {
    public static int trocas;
        static void combSort(int tamanho, int[] vetor) {
            trocas = 0;
            int sorted = 0;
            int gap = tamanho;

            while (sorted == 0) {
                gap = (int)(gap / 1.3);

                if (gap <= 1) {
                    gap = 1;
                    sorted = 1;
                }

                // sm = indice do segundo elemento
                for (int i = 0; i < tamanho - gap; i++) {
                    int sm = gap + i;
                    if (vetor[i] > vetor[sm]) {
                        int aux = vetor[sm];
                        vetor[sm] = vetor[i];
                        vetor[i] = aux;
                        sorted = 0;
                        trocas++;
                    }
                }
            }
        }
}
