public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Dereck", 75.89);
        Comida c1 = new Comida("Coxinha", 0.521);

        p1.exibir(c1);

        Pessoa p2 = new Pessoa("Cirlete", 67.12);
        p1.exibir(c1);

        Comida c2 = new Comida("Pastel", 0.298);
        p1.exibir(c2);

    }
}