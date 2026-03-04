public class Pessoa {

    String nomePessoa;
    double pesoInicial;
    double pesoFinal;

    Pessoa(String nomePessoa, double pesoInicial) {
        this.nomePessoa = nomePessoa;
        this.pesoInicial = pesoInicial;
    }

    void exibir(Comida refeicao) {

        System.out.printf("Seja bem vindo %s, seu peso atual é de %.2f%n", this.nomePessoa, this.pesoInicial);
        System.out.printf("Após comer %s e essa refeição ter peso de %.2fkg%n", refeicao.comida, refeicao.pesoComida);
        pesoFinal = pesoInicial + refeicao.pesoComida;

        System.out.printf("Seu peso após a refeição chegou aos incríveis %.2fkg!%n\n", pesoFinal);
        pesoInicial = pesoFinal;
    }
}