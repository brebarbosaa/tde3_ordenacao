public class Main {

    static void imprimir(String titulo, int[] v, int tamanho){
        System.out.println(titulo);
        int i = 0;
        while (i < tamanho){
            System.out.println(v[i] + " ");
            i++;
        }
        System.out.println("\n");
    }

    static void copiar(int[] origem, int[] destino, int tamanho){
        int i = 0;
        while (i < tamanho){
            destino[i] = origem[i];
            i++;
        }
    }

    static int minimo(int[] v, int tamanho){
        int i = 1;
        int min = v[0];
        while (i < tamanho){
            if (v[i] < min) min = v[i];
            i++;
        }
        return min;
    }

    static int maximo(int[] v, int tamanho){
        int i = 1;
        int max = v[0];
        while (i < tamanho){
            if (v[i] > max) max = v[i];
            i++;
        }
        return max;
    }


    static void testar(String nome, int tamanho, int[] vetorOriginal) {
        int[] copia = new int[tamanho];
        copiar(vetorOriginal, copia, tamanho);

        imprimir("Vetor original:", copia, tamanho);

        if (nome == "Bubble Sort") {
            Bubblesort.bubbleSort(tamanho, copia);
            System.out.println("Trocas: " + Bubblesort.trocas);
        } else if (nome == "Selection Sort") {
            Selectionsort.selectionSort(tamanho, copia);
            System.out.println("Trocas: " + Selectionsort.trocas);
        } else if (nome == "Gnome Sort") {
            Gnomesort.gnomeSort(tamanho, copia);
            System.out.println("Trocas: " + Gnomesort.trocas);
        } else if (nome == "Cocktail Sort") {
            Cocktailsort.cocktailSort(tamanho, copia);
            System.out.println("Trocas: " + Cocktailsort.trocas);
        } else if (nome == "Comb Sort") {
            Combsort.combSort(tamanho, copia);
            System.out.println("Trocas: " + Combsort.trocas);
        } else if (nome == "Bucket Sort") {
            Bucketsort.bucketSort(copia, tamanho, minimo(copia, tamanho), maximo(copia, tamanho));
            System.out.println("Trocas: " + Bucketsort.trocas);
        }

        imprimir("Vetor ordenado por " + nome + ":", copia, tamanho);
    }



    public static void main(String[] args) {
        int[] vetor = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int[][] vetores = {vetor, vetor2, vetor3};

        int tamanho = 20;

        String[] algoritmos = {"Bubble Sort", "Cocktail Sort", "Gnome Sort", "Selection Sort", "Bucket Sort", "Comb Sort"};

        int i = 0;
        while (i < 3) {
            System.out.println("Teste do vetor: " + (i + 1) + "\n");
            int j = 0;
            while (j < 6) {
                testar(algoritmos[j], tamanho, vetores[i]);
                j++;
            }
            i++;
        }
    }
}

