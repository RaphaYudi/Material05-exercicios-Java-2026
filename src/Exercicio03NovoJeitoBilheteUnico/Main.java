package Exercicio03NovoJeitoBilheteUnico;

import java.util.Scanner;

public class Main {
    static BilheteUnico[] Bilhete = new BilheteUnico[3];
    static Scanner sc = new Scanner(System.in);
    static int index = 0;

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("[1] Cadastrar bilhete");
            System.out.println("[2] Carregar bilhete");
            System.out.println("[3] Consultar saldo");
            System.out.println("[4] Passar na catraca");
            System.out.println("[5] Finalizar");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> cadastrar();
            }

        } while (opcao != 5);


    }

    private static void cadastrar() {

        String nome;
        long cpf;
        String TipoTarifa;

        if (index < Bilhete.length) {
            System.out.println("Nome do usuario ");
            nome = sc.next();

            System.out.println("CPF: ");
            cpf = sc.nextLong();

            System.out.println("Tipo de tarifa (Estudante | Professor | Comum): ");
            TipoTarifa = sc.next();
        }
    }
}
