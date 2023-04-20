import java.util.Scanner; //importando o scanner

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        /* System.in significa que queremos ler a entrada do usuário
        *  Scanner le dados de entrada em arquivos, fluxos de entrada, Strings e até mesmo a entrada do usuário através do teclado
        * */

        System.out.println("Qual seu filme favorito?");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual sua nota?");
        double avaliacao = leitura.nextDouble(); //para cada tipo de variavel existe um next

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
