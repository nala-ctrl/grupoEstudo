import java.util.Random;
import java.util.Scanner;

public class Game {
    public void brain() {
        Random random = new Random(); // criei o objeto/ instaciar
        int currentNum = random.nextInt(0, 100);
        // criei a variavel randomNUm e atribui um valor aleatorio entre 0 e 100

        int points = 0;

        while (true){

            System.out.println("Numero atual: " + currentNum);

            System.out.println("Próximo número será maior ou menor? ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            int newNum = random.nextInt(0, 100); // novo numberrandom

            switch (answer) {
                case "maior":
                    if (newNum > currentNum) {
                        points++;
                        System.out.printf("✅ Acertou! Pontuação: %d\n", points );
                    } else {
                        System.out.printf("❌ Errou. Pontuação: %d\n", points);
                    }
                    currentNum = newNum; // independente de o user acertar o atual recebe o valor de newnum para o seguimento do game,
                    break;
                case "menor":
                    if (newNum < currentNum) {
                        points++;
                        System.out.printf("✅ Acertou! Pontuação: %d\n", points);
                    } else {
                        System.out.printf("❌ Errou. Pontuação: %d\n", points);
                    }
                    currentNum = newNum;
                    break;
                case "sair":
                    System.out.printf("Você saiu do jogo com  %d ponto(s). Até a próxima!\n", points);
                    return;
                default:
                    System.out.println("Respostas validas: 'maior' ou 'menor'!\n");
            }

        }
    }
}
