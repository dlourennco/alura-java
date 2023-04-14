// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        /* Convenções de código são boas práticas da comunidade que "viraram regras"
        * Ex: - Variáveis sempre em minúsculo
        *     - Classes em maíusculo
        *     - Constantes em maíusculo separadas por underline
        *  */

        /* Tipos de variáveis:
        * int = inteiros
        * boolean = true/false
        * double = decimais
        * */
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento:" + anoDeLancamento);

        //boolean incluidoNoPlano = true;

        //double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                  Filme Top Gun
                  Filme de aventura anos 80
                  Muito bom!
                  Ano de lançamento
                  """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2); //casting é converter um tipo de dado em outro, aqui o resultado seria um double"
        System.out.println(classificacao);
        /*
        *   Exemplo claro de casting:
        *   int x = 10;
        *   double y = x; // casting implícito (forçado pelo compilador)
        *   System.out.println(y); //10.0
        *
        *   double x = 10.5;
        *   int y = (int) x; // casting explícito
        *   System.out.println(y); //10 (decimal descartado)
        *
        */

    }
}