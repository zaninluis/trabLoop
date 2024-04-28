import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int maxTent = 10;
        int numeroComputador = r.nextInt(max - min + 1) + min;
        int tentativas = 0;
        int palpite;

        System.out.println("JOGO DA ADIVIHAÇÃO, CHUTE UM NÚMERO DE 1 A 100!");

        while (tentativas < maxTent) {
            System.out.println("Tentativa número " + tentativas + "Digite um número");
            palpite= sc.nextInt();
            tentativas++;

            if(palpite == numeroComputador) {
                System.out.println("Parabéns você acertou!" + numeroComputador);
                break;
            } else if (palpite < numeroComputador) {
                System.out.println("Tente um número maior");
            } else {
                System.out.println("Tente um número menor");
            }

            if(tentativas < maxTent){
                int resta = maxTent - tentativas;
                System.out.println("Você ainda tem " + resta + " tentativas!");
            }

            if (tentativas == maxTent) {
                System.out.println("Você não tem mais tentativas!");
            }
        }
    }
}