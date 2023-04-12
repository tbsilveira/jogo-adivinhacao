import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(50);
        int numeroDigitado = 0;
        int tentativas = 0;
        System.out.println("""
                    ************************************
                            JOGO DE ADIVINHAÇÃO
                      você terá 5 chances para acertar
                    ************************************
                    """);

        while(tentativas < 5) {

            System.out.println(tentativas + 1 +"ª jogada: Digite um número entre 0 e 50: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, acertou o número secreto na " + tentativas +"º jogada! :)");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Errou, o número secreto é MAIOR" + "\n");
            } else {
                System.out.println("Errou, o número secreto é MENOR" + "\n");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("===  G A M E  O V E R  ===");
            System.out.println("Você teve " + tentativas + " chances para acertar mas não conseguiu");
            System.out.println("O número secreto era: [ " + numeroGerado + " ]");
        }
    }
}