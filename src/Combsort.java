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
