public class Pessoa {

    String nome;
    int numPedido;

    Pessoa(String nome, int numPedido){
        this.nome = nome;
        this.numPedido = numPedido;
    }

    void pedido(Pizzaria pizza) {
        System.out.println("Seja bem vindo a Fratellino!\n");
        System.out.printf("%s a id do seu pedido do numero: %d%n", nome, numPedido);

        System.out.printf("Sua pizza com sabor de %s esta sendo preparado. Voce ganhou borda de brinde ? %b", pizza.sabor, pizza.comBorda);
        System.out.println("\nBom apetite! Até mais...");
    }
}
