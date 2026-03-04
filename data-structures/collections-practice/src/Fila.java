import java.util.Queue;                   // Interface que define comportamento FIFO (First In, First Out)
import java.util.concurrent.ArrayBlockingQueue; // Fila com LIMITE de tamanho

public class Fila {

    public static void main(String[] args) {

        // Queue<String> fila = new LinkedList<>();
        // OBSERVAÇÃO!!!!
        // LinkedList não tem limite de tamanho, então add() e offer()
        // vão se comportar igual nesse caso.
        // A diferença só aparece em filas com capacidade limitada
        // (como ArrayBlockingQueue).

        Queue<String> fila = new ArrayBlockingQueue<>(10);
        // Fila com limite máximo de 10 elementos

        // ========= ADICIONANDO =========

        // Se passar do limite definido causa um ERROR (IllegalStateException)
        fila.add("Ana");

        // Se passar do limite definido retorna FALSE (não lança erro)
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafael");
        fila.offer("Gui");

        // ========= OLHAR SEM REMOVER =========

        // Peek e Element -> obtêm o próximo elemento da fila (sem remover)

        System.out.println(fila.peek());
        // Mostra o PRIMEIRO da fila
        // Se estiver vazia → retorna null

        System.out.println(fila.peek());
        // Continua mostrando o mesmo, pois não remove

        System.out.println(fila.element());
        // Mostra o PRIMEIRO da fila
        // Se estiver vazia → lança exceção (NoSuchElementException)

        System.out.println(fila.element());
        // Continua mostrando o mesmo


        // ========= TAMANHO =========

        System.out.println(fila.size());
        // Mostra quantos elementos existem na fila


        // ========= REMOVER =========

        System.out.println(fila.poll());
        // Remove o PRIMEIRO da fila e retorna ele
        // Se estiver vazia → retorna null

        System.out.println(fila.remove());
        // Remove o PRIMEIRO da fila e retorna ele
        // Se estiver vazia → lança exceção


        // ========= VERIFICAR SE ESTÁ VAZIA =========

        System.out.println(fila.isEmpty());
        // Retorna true se estiver vazia
        // Retorna false se ainda tiver elementos


        // ========= LIMPAR =========

        fila.clear();
        // Apaga TODOS os elementos da fila

        System.out.println(fila.poll());
        // Como agora está vazia → retorna null

        // System.out.println(fila.remove());
        // Se descomentar isso aqui → vai dar ERRO,
        // porque remove() não aceita fila vazia
    }
}