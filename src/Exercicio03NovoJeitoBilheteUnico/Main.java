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
                case 2 -> carregar();
                case 3 -> ConsultarSaldo();
                case 4 -> PassarNaCatraca();
                case 5 -> System.out.println("Até breve!");
                default -> System.out.println("Opção inválida");
            }
            System.out.println("#####################################");
        } while (opcao != 5);
    }

    private static void PassarNaCatraca() {
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null) {

            if (!bilheteUnico.passarNaCatraca()) {
                System.out.println("Saldo insificiente");
            }

            System.out.println("Saldo atual: " + bilheteUnico.saldo);
        }
    }

    private static void ConsultarSaldo() {
        BilheteUnico bilheteUnico = pesquisar();

        if (bilheteUnico != null) {
            System.out.println("Saldo atual: " + bilheteUnico.saldo);
        }
    }

    private static void carregar() {

        double valor;
        BilheteUnico bilheteUnico = pesquisar();

        if (bilheteUnico != null) {

            System.out.println(" Digite o valor da recarga: ");
            valor = sc.nextDouble();
            bilheteUnico.carregar(valor);
        }
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
            Bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, TipoTarifa));
            index++;
        }
    }

    public static BilheteUnico pesquisar() {

        long cpf;
        System.out.println("CPF para pesquisar: ");
        cpf = sc.nextLong();

        for (int i = 0; i < index; i++) {
            if (Bilhete[i].usuario.cpf == cpf) {

                return Bilhete[i];
            }
        }

        System.out.println("Bilhete não encontrado!!");
        return null;
    }

    public static void ChecarSaldo() {

    }
}
