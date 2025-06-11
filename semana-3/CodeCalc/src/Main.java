import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] allowedOperation = {"+", "-", "*", "/"};

        String answer;
        do {

            System.out.println("== CALCULADORA BÁSICA ==");
            System.out.print("""
                    Digite uma operação!
                    adição          +
                    subtração       -
                    multiplicação   *
                    divisão         /
                    >>>\s""");

            String operation = scanner.nextLine();

            if (!Arrays.asList(allowedOperation).contains(operation)) {
                System.out.println("Operação inválida, reinicie o programa");
                return;
            }

            System.out.print("Digite o primeiro número: ");
            double firstNumber = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Digite o segundo número: ");
            double secondNumber = scanner.nextDouble();
            scanner.nextLine();

            // ← AQUI VOCÊS INSEREM O switch-case E COMPLETAM A LÓGICA

            switch (operation) {
                case "+":
                    double result = firstNumber + secondNumber;
                    System.out.println("Resultado da soma: " + result);
                    break;

                case "-":
                    double resultsub = firstNumber - secondNumber;
                    System.out.println("Resultado da subtracao: " + resultsub);
                    break;

                case "*":
                    double resultmult = firstNumber * secondNumber;
                    System.out.println("Resultado multiplicacao: " + resultmult);
                    break;

                case "/":
                    if (secondNumber != 0) {
                        double resultdiv = firstNumber / secondNumber;
                        System.out.println("Resultado divisao: " + resultdiv);
                    } else {
                        System.out.println("Operacao invalida! O segundo numero nao pode ser 0");
                    }
                    break;
            }

            System.out.println("Deseja fazer outra operação? (sim/nao): ");
            answer = scanner.nextLine().toLowerCase();

            if (answer.equals("nao")) {
                System.out.println("Programa encerrado. Até a próxima!");
            }

        } while (answer.equals("sim"));
    }
}