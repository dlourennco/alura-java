public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2000;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        String tipoPlano = "normal";

        if(anoDeLancamento >= 2022) {
            System.out.println("Lançamento do momento!");
        } else {
            System.out.println("Filme retro que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Pague a locação!");
        }
    }
}
