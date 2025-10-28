// Gnome sort: percorre o array da esquerda para a direita, comparando os elementos adjacentes.\
// Avança se estào na ordem correta, se estão na ordem errada troca os elementos e volta uma posição.

public class Gnomesort {
    public static int trocas;

    static void gnomeSort(int tamanho, int[] vetor){
        int i = 0;

        while (i < tamanho){
            if (i == 0 || vetor[i - 1] <= vetor[i]){
                i++;
            } else {
                int temporario = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[--i] = temporario;
                trocas++;
            }

        }
    }
}
