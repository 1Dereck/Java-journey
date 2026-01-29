public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Dereck Felipe Maciel Pereira", 7);
        Pizzaria pizza = new Pizzaria("Chocolate", false);

        // Pedido objeto temporário (uso único)
        p1.pedido(new Pizzaria("Frango cremoso", true));

        // Pedido com objeto nomeado (pode reutilizar)
        p1.pedido(pizza);


    }
}
