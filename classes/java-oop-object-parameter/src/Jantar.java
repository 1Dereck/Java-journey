public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Dereck", 75.45);
        //p1.comer(new Comida("Taco", 0.83));

        Comida c1 = new Comida("Taco", 0.88);

        p1.exibir(c1);
    }
}
