public class DataTeste {

    int dia;
    int mes;
    int ano;

    void diaMesAno() {
        System.out.printf("Os dados preenchidos sao: %d/%d/%d%n", dia, mes, ano);
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d%n", dia, mes, ano);
    }

}
