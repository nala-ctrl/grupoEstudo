package desafio1Parte2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tempo disponivel: ");
        String input = scanner.nextLine().trim().toLowerCase();

        // extracao do numero e unidade
        String numeroStr = input.replaceAll("[^0-9.]", "");
        if (numeroStr.isEmpty()) {
            System.out.println("Formato invalido! use '90min' ou '1.5horas'");
            return;
        }

        double tempo = Double.parseDouble(numeroStr);
        double minutos;

        if (input.endsWith("h") || input.endsWith("horas") || input.endsWith("hs") || input.endsWith("hora")) {
            minutos = tempo * 60; // Converte horas para minutos
        } else if (input.endsWith("min") && !input.endsWith("minutos")) {
            minutos = tempo;
        } else {
            System.out.println("Unidade invalida! Use 'h' ou 'min.'");
            return;
        }

        // parte II: sugeridor de tarefas com base no tempo

        System.out.printf("\nVoce tem %.0f minutos disponiveis. Sugestoes:\n", minutos);

        int[] duracoes = {90, 45, 20, 10, 5};

        int tempoRestante = (int) minutos;

        for (int duracao : duracoes) {
            while (tempoRestante >= duracao) {
                sugerirAtividade(duracao); // chama o metodo de sugestao
                tempoRestante -= duracao; // reduz o tempo restante
            }
        }

        //se sobrar tempo menos de 5 minutos
        if (tempoRestante > 0) {
            System.out.println("- " + tempoRestante + "min: tempo livre \uD83C\uDF1F");
        }
    }

    public static void sugerirAtividade(int duracao) {
        switch (duracao) {
            case 90:
                System.out.println("- " + duracao + "min: Projeto pessoal ou estudo aprofundado 🎯");
                break;
            case 45:
                System.out.println("- " + duracao + "min: Estudar um módulo ou escrever um texto ✍️");
                break;
            case 20:
                System.out.println("- " + duracao + "min: Videoaula ou caminhada curta 🚶");
                break;
            case 10:
                System.out.println("- " + duracao + "min: Ler artigo ou meditar ☕");
                break;
            case 5:
                System.out.println("- " + duracao + "min: Beber água e alongar 💧");
                break;
        }
    }
}