package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem: ");
        System.out.println("1- Naruto Uzumaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");


        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número : " + escolhaDoUsuario);

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno");
            default:
                System.out.println("O usuário não escolheu nenhuma das opções");
                break;
        }

        scanner.close();
    }
}
