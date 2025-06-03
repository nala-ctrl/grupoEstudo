import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String answer;

        System.out.println("Jogo Maior ou Menor?");
        System.out.println("Digite start para comecar o game: ");
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("start")) {
            Game game = new Game();
            game.brain();
        }

    }
}