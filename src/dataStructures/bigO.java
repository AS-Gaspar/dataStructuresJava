package dataStructures;
import java.util.Arrays;

public class bigO {
    public static void main(String[] args) {
        bigO exemplos = new bigO();
        int[] array = {1, 8, 3, 10, 5, 7, 2, 9, 6, 4};
        int[] arrayOrdenado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("--- Exemplo O(1) ---");
        exemplos.acessarPrimeiroElemento(array);

        System.out.println("\n--- Exemplo O(n) ---");
        exemplos.encontrarElemento(array, 7);

        System.out.println("\n--- Exemplo O(n^2) ---");
        exemplos.imprimirPares(array);

        System.out.println("\n--- Exemplo O(log n) ---");
        exemplos.buscaBinaria(arrayOrdenado, 9);

        System.out.println("\n--- Exemplo O(n log n) ---");
        exemplos.ordenarArray(array);
    }

    /**
     * O(1) - Complexidade Constante
     * O tempo de execução não depende do tamanho do array. Acessar um elemento
     * por seu índice é uma operação direta e leva o mesmo tempo para um array
     * de 10 ou 10 milhões de elementos.
     */
    public void acessarPrimeiroElemento(int[] array) {
        if (array.length > 0) {
            System.out.println("O primeiro elemento é: " + array[0]);
        }
    }

    /**
     * O(n) - Complexidade Linear
     * O tempo de execução é diretamente proporcional ao número de elementos (n).
     * No pior caso (elemento no final ou não existente), o laço `for` percorrerá
     * todos os 'n' elementos do array uma vez.
     */
    public void encontrarElemento(int[] array, int valor) {
        for (int elemento : array) {
            if (elemento == valor) {
                System.out.println("Elemento " + valor + " encontrado!");
                return;
            }
        }
        System.out.println("Elemento " + valor + " não encontrado.");
    }

    /**
     * O(n^2) - Complexidade Quadrática
     * Ocorre quando temos um laço aninhado dentro de outro. Para cada elemento
     * do array (n), percorremos o array novamente (n). Isso resulta em n * n = n^2
     * operações. O tempo de execução cresce exponencialmente com o tamanho da entrada.
     */
    public void imprimirPares(int[] array) {
        System.out.println("Imprimindo todos os pares possíveis:");
        for (int i : array) {      // Este laço executa n vezes
            for (int j : array) {  // Este laço executa n vezes para CADA iteração do laço externo
                System.out.print("(" + i + ", " + j + ") ");
            }
        }
        System.out.println();
    }

    /**
     * O(log n) - Complexidade Logarítmica
     * A cada iteração, o algoritmo reduz o tamanho do problema pela metade.
     * A busca binária é o exemplo clássico. Ela só funciona em um array ORDENADO.
     * Mesmo que o array dobre de tamanho, o número de iterações aumenta apenas em 1.
     */
    public void buscaBinaria(int[] arrayOrdenado, int valor) {
        int baixo = 0;
        int alto = arrayOrdenado.length - 1;

        while (baixo <= alto) {
            int meio = baixo + (alto - baixo) / 2;
            if (arrayOrdenado[meio] == valor) {
                System.out.println("Elemento " + valor + " encontrado no índice " + meio);
                return;
            }
            if (arrayOrdenado[meio] < valor) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }
        System.out.println("Elemento " + valor + " não encontrado.");
    }

    /**
     * O(n log n) - Complexidade Linearítmica
     * Esta é a complexidade dos algoritmos de ordenação eficientes (Merge Sort,
     * Quick Sort, etc.). Em vez de reinventar um, podemos simplesmente usar o método
     * nativo do Java, `Arrays.sort()`, que tem essa complexidade. Ele é muito mais
     * rápido que um algoritmo O(n^2) para grandes volumes de dados.
     */
    public void ordenarArray(int[] array) {
        System.out.println("Array original: " + Arrays.toString(array));
        // O algoritmo de ordenação do Java (Timsort) tem complexidade O(n log n)
        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
