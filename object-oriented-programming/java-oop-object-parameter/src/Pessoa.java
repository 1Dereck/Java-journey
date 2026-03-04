public class Pessoa {
    String pessoa;
    double peso;


    Pessoa (String pessoa, double peso) {
        this.pessoa = pessoa;
        this.peso = peso;
    }

    void exibir (Comida comida) {

        System.out.printf("Vocë comeu %s%n", comida.comida);
        System.out.printf("Peso inicial: %.2f%n", peso);
        this.peso = peso + comida.pesoComida;
        System.out.printf("Sua refeição após a janta te deixou com o peso de: %.2f%n", this.peso);

    }
}
