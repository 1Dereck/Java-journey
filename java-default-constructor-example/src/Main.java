public class Main {
    public static void main(String[] args) {

        Data data = new Data();
        Data data1 = new Data(31, 11, 2012);


        System.out.printf("%d/%d/%d", data.dia, data.mes, data.ano);
        System.out.printf("\nVocê nasceu nessa data bagual: %d/%d/%d", data1.dia, data1.mes, data1.ano);

    }
}