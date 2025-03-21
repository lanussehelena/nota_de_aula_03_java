package Questao_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cavalo cavalo = new Cavalo();
        Leao leao = new Leao();
        String repetir;
        int opcao;

        do {
            System.out.println("Digite um número para escolher uma opção: \n1 - Cadastrar um cavalo; \n2- Cadastrar um leão; \n3- Sair;");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    do {
                        System.out.println("Digite qual o tamanho do cavalo: (em metros)");
                        cavalo.setTamanho(scanner.nextFloat());
                        scanner.nextLine();

                        System.out.println("Digite qual a cor do cavalo:");
                        cavalo.setCor(scanner.nextLine());

                        System.out.println("Digite a raça do cavalo:");
                        cavalo.setRaca(scanner.nextLine());

                        cavalo.comer();

                        cavalo.fugir();

                        System.out.println("Deseja cadastrar mais um cavalo? S/N");
                        repetir = scanner.nextLine();

                    } while (repetir.equalsIgnoreCase("s"));
                    break;

                case 2:
                    do{
                        System.out.println("Digite qual o tamanho do leão: (em metros)");
                        leao.setTamanho(scanner.nextFloat());
                        scanner.nextLine();

                        System.out.println("Digite qual a cor do leão:");
                        leao.setCor(scanner.nextLine());

                        System.out.println("Digite se o leão tem um juba ou não: (true or false)");
                        leao.setJuba(scanner.nextBoolean());
                        scanner.nextLine();

                        leao.comer();
                        leao.cacar();

                        System.out.println("Deseja cadastrar mais um leão? S/N");
                        repetir = scanner.nextLine();

                    }while (repetir.equalsIgnoreCase("s"));
                    break;

                case 3:
                    System.out.println("Sair do programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
        } while (opcao != 3);
        scanner.close();
    }
}