package Questao_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ClinicoGeral clinicoGeral = new ClinicoGeral();
        Cirurgiao cirurgiao = new Cirurgiao();
        String repetir;
        int opcao;

        do {

            System.out.println("Escolha uma opção: \n1- Cadastrar Clinico Geral; \n2- Cadastrar Cirurgião\n3- Sair;");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    do {

                        System.out.println("O médico trabalho em hospital? (true or false)");
                        clinicoGeral.setTrabalhaNoHospital(scanner.nextBoolean());
                        scanner.nextLine();

                        System.out.println("O médico atende em casa? (true or false)");
                        clinicoGeral.setAtendeEmCasa(scanner.nextBoolean());
                        scanner.nextLine();

                        clinicoGeral.tratarPaciente();

                        clinicoGeral.receitar();

                        System.out.println("Deseja cadastrar outro médico? ?(S ou N)");
                        repetir = scanner.nextLine();

                    }while (repetir.equalsIgnoreCase("s"));
                    break;

                case 2:
                    do {
                        System.out.println("O médico trabalho em hospital? (true or false)");
                        cirurgiao.setTrabalhaNoHospital(scanner.nextBoolean());
                        scanner.nextLine();

                        cirurgiao.tratarPaciente();

                        cirurgiao.fazerIncisao();

                        System.out.println("Deseja cadastrar outro médico? ?(S ou N)");
                        repetir = scanner.nextLine();

                    } while (repetir.equalsIgnoreCase("s"));
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
