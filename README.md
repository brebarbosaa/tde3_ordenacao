# Algoritmos de Ordenação - TDE 3

## Autor
Brenda Gabrielli Barbosa

---

## Descrição do Projeto

Este projeto é referente a disciplina de Resolução de Problemas Estruturados em Computação, do curso de Ciência da Computação na PUCPR.
O código implementa seis algoritmos de ordenação em Java, aplicados a três vetores diferentes.  

---

## Algoritmos implementados

1. **Bubble Sort** – Algoritmo de comparação simples, que troca elementos adjacentes repetidamente até o vetor estar ordenado.
2. **Selection Sort** – Seleciona o menor elemento e troca com o primeiro não ordenado.
3. **Cocktail Sort** – Variante do Bubble Sort que percorre o vetor em ambas as direções.
4. **Comb Sort** – Aperfeiçoamento do Bubble Sort usando gaps maiores para diminuir inversões rapidamente.
5. **Gnome Sort** – Ordenação baseada em pequenas trocas, movendo elementos para frente ou para trás.
6. **Bucket Sort** – Distribui os elementos em buckets, ordena cada bucket usando Bubble Sort e depois junta os resultados.

---

## Vetores testados

| **Vetor 1** | 12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28 |
| **Vetor 2** | 5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32 |
| **Vetor 3** | 99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6 |

---

## Comparativo de Trocas

| Algoritmo       | Vetor 1 | Vetor 2 | Vetor 3 |
|-----------------|:-------:|:-------:|:-------:|
| **Bubble Sort**  | 78      | 0      | 190      |
| **Cocktail Sort** | 78     | 0      | 190      |
| **Gnome Sort**  | 78      | 78      | 268      |
| **Selection Sort**     | 18     | 0      | 10      |
| **Bucket Sort**    | 13      | 0      | 63      |
| **Comb Sort**   | 22      | 0      | 18      |

---

## Análise

- Como podemos observar, em todos os testes para os 3 vetores, o algoritmo mais eficiente foi o Selection Sort, fazendo 18, 0  e 10 trocas para os vetores 1, 2 e 3, respectivamente.
- É possível notar que o algoritmo Gnome Sort é o único que faz trocas para um vetor já ordenado, como o vetor 2 nesse caso. Isso acontece por que esse algoritmo faz pequenas trocas, comparando os elementos e avançando posição quando a ordem está correta, e trocando os elementos de lugar e voltando uma posição se a ordem estiver errada. Dessa maneira, pode acontecer voltas e trocas de posição sem necessidade.
---

## Como rodar

1. Compile todos os arquivos `.java` no mesmo diretório:  
```bash
javac Main.java Bubblesort.java Selectionsort.java Gnomesort.java Cocktailsort.java Combsort.java Bucketsort.java
