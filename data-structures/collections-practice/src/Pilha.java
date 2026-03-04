import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        // Usamos push() para representar operação de pilha (LIFO).
        // Embora add() também funcione, push() torna a intenção do código mais clara.
        livros.add("O Padrão Bitcoin");
        livros.push("Entendendo Algoritmos");
        livros.push("Código Limpo");
        livros.push("O Programador Pragmático");

        // Se estiver vazio retorna null
        System.out.println(livros.peek());

        // Se estiver vazio gera "erro"
        System.out.println(livros.element());

        // ao remover retorna o item removido.
        // Se estiver vazio retorna "erro"
        System.out.println(livros.pop());

        // remove topo (retorna null se vazio)
        // ao remover retorna o item removido.
        System.out.println(livros.poll());

        // Retorna a quantidade de elementos na estrutura.
        // Tipo de retorno: String
        System.out.println(livros.size());

        // Verifica se os elementos existem
        System.out.println(livros.contains("O Padrão Bitcoin"));

        // Limpa TODOS os elementos
        livros.clear();

        // Retorna true ou false verificando se está vazia
        System.out.println(livros.isEmpty());
    }
}
