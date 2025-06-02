package desafio1parte1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("==================================================================");
        System.out.println("\t\t\t\t\tSugeridor de Senhas Inteligente");
        System.out.println("==================================================================");

        System.out.println("coloque sua senha: ");
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();

        System.out.println("\nSenhas sugeridas: ");
        System.out.println("Original: " +  senha);
        System.out.println("Invertida: " +  senhaInvertida(senha));
        System.out.println("Caixa Alta: " +  senha.toUpperCase());
        System.out.println("Sem Vogais: " +  senha.replaceAll("[aeiouAEIOU]","" ));
        System.out.println("Cifrada: " +  senhaCript(senha));

        System.out.println("==================================================================");
        System.out.println("\t\t\t\t\tFim do Programa >.<");
        System.out.println("==================================================================");
    }
    private static String senhaInvertida(String senha) {
        StringBuilder invertida = new StringBuilder();

        for (int i = senha.length() - 1; i >= 0; i--) {
                invertida.append(senha.charAt(i));
        }
        return invertida.toString();
    }
    private static String senhaCript(String senha) {
        return senha.replace("a", "@")
                .replace("i", "!")
                .replace("e", "3")
                .replace("o", "0")
                .replace("u", "-");
    }
}
