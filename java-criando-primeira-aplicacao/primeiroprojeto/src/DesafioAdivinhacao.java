import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero = new Random().nextInt(100);
        int tentativas = 1;
        int palpite = 0;

        System.out.println(numero); // cheat xD

        while (tentativas < 5) {
            System.out.println("Escolha um número: ");
            palpite = leitura.nextInt();

            if (palpite == numero) {
                System.out.println("Você ganhou!");
                break;
            } else if (palpite < numero) {
                System.out.println("O número é maior");
                tentativas++;
            } else if (palpite > numero) {
                System.out.println("O número é menor");
                tentativas++;
            }
        }

        if (tentativas == 5) {
            System.out.println("Você gastou todas as suas tentativas! O número era " + numero);
        }
    }
}
