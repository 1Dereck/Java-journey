// Classe principal responsável por executar os testes
public class Main {
    public static void main(String[] args) {

        // ================================
        // PARTE 1 — TIPOS PRIMITIVOS
        // ================================

        // 'a' recebe o valor 5
        int a = 5;

        // 'b' recebe uma CÓPIA do valor de 'a'
        // Aqui ocorre cópia de VALOR, não existe ligação entre as variáveis
        int b = a;

        System.out.println("A = " + a + " - B = " + b);

        // Alteramos apenas o valor de 'a'
        // Isso NÃO afeta 'b', pois são variáveis independentes
        a -= 4;

        System.out.println("A = " + a + " - B = " + b);


        // ================================
        // PARTE 2 — OBJETOS E REFERÊNCIAS
        // ================================

        // Criamos um novo objeto da classe Exemplo
        // 'p1' NÃO guarda o objeto em si, mas sim uma REFERÊNCIA para ele
        Exemplo p1 = new Exemplo();

        // Alteramos o atributo do objeto referenciado por 'p1'
        p1.exemp = 31;

        System.out.println("P1 = " + p1.exemp);

        // Aqui NÃO é criado um novo objeto
        // 'p2' recebe a MESMA referência de 'p1'
        // Agora p1 e p2 apontam para o MESMO objeto na memória
        Exemplo p2 = p1;

        // Modificamos o objeto usando a referência 'p2'
        // Como o objeto é o mesmo, 'p1' também verá essa mudança
        p2.exemp = 43;

        System.out.println("P2 modifica valor e muda p1 tambem e: " + p2.exemp);
        System.out.println(p1.exemp); // Também imprime 43


        // ================================
        // PARTE 3 — MÚLTIPLAS REFERÊNCIAS
        // ================================

        // 'p3' recebe a mesma referência de 'p2'
        // Agora p1, p2 e p3 apontam para o MESMO objeto
        Exemplo p3 = p2;

        // Alteração feita por p3 afeta o mesmo objeto compartilhado
        p3.exemp = 99;

        // Todos acessam o mesmo valor, pois é o mesmo objeto
        System.out.println(p1.exemp); // 99
        System.out.println(p3.exemp); // 99
    }
}
