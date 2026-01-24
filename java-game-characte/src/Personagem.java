public class Personagem {

    String nome;
    int vida;
    int energia;

    public Personagem(String nome, int vida, int energia) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
    }

    void atacar(int energiaGasta) {
        this.energia -= energiaGasta;
    }

    void sofrerDano(int dano) {
        this.vida -= dano;
    }

    void curar(int valor) {
        this.vida += valor;
    }

    void mostrarStatus() {
        System.out.println("\n\n-------------------- Personagem após 1 round... --------------------");
        System.out.printf("Nome: %s%nVida: %d%nEnergia: %d%n", nome, vida, energia);
    }

    void mostrarStatusInicial() {
        System.out.println("\n--------------- Jogo vai começar! ------------------");
        System.out.println("Status inicial de personagem...");
        System.out.printf("Nome: %s%nVida: %d%nEnergia: %d%n", nome, vida, energia);
    }
}
