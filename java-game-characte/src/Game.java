public class Game {
    public static void main(String[] args) {

        Personagem personagem1 = new Personagem("Dereck", 100, 50);

        // Mostrar status de personagem inicial
        personagem1.mostrarStatusInicial();

        //Atacar é energia base - energia gasta
        personagem1.atacar(21);

        // Sofrer dano é vida - dano
        personagem1.sofrerDano(8);

        // Curar é vida atual + valor (valor que vai aumentar no numero de vida)
        personagem1.curar(0);

        // Mostra status do personagem
        personagem1.mostrarStatus();
    }
}