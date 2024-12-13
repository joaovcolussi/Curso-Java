package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Numero_Max = 10;
        String[] ninjas = new String[Numero_Max];

        int ninjascadastrados = 0;
        int opcoes = 0;

        while (opcoes != 3){

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Deletar ninja");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcoes = scanner.nextInt();
            scanner.nextLine();

            switch (opcoes){
                case 1:
                    if (ninjascadastrados < Numero_Max){
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String Nomeninja = scanner.nextLine();
                        ninjas[ninjascadastrados] = Nomeninja;
                        ninjascadastrados++;
                        System.out.println("Ninja Cadastrado com sucesso!");
                    }else {
                        System.out.println("Quantidade máxima de ninjas cadastrados!");
                        System.out.println("O máximo de cadastro são: " + Numero_Max);
                    }
                    break;
                case 2:
                    if (ninjascadastrados == 0){
                        System.out.println("Nenhum ninja cadastrado");
                    }else {
                        System.out.println("========== Lista de Ninjas ==========");
                        for (int i = 0; i < ninjas.length ; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o index que o ninja está para deletar");
                    for (int i = 0; i <Numero_Max ; i++) {

                    }
                    break;

                default:
                    System.out.println("Opção não é valida, saindo do sistema...");
                    break;
            }

        }


    }


}
