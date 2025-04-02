package main.java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // 1. Leitura dos dados do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Massa (kg): ");
        float massa = scanner.nextFloat();

        System.out.print("Digite a Altura (m): ");
        float altura = scanner.nextFloat();

        scanner.close(); // Fechar o Scanner após a leitura

        // 2. Criação do objeto CorpoHumano e cálculo do IMC
        CorpoHumano corpo = new CorpoHumano();
        corpo.setMassa(massa);
        corpo.setAltura(altura);

        double imc = corpo.calcularIMC();

        // 3. Exibição do resultado
        System.out.println("IMC calculado: " + imc);
    }
}