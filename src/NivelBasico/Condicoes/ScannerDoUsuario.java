package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é : " + nomeDoNinja);

        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");
        caixaDeTexto.close();

        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia");
        }else{
            System.out.println("Esse ninja é muito novo ainda, precisa treinar mais antes de sair da vila");
        }
    }
}