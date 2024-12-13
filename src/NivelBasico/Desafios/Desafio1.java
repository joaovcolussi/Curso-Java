package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja = 15;
        String Missao = "Encontrar o Bandido";
        String StatusDaMissao = "Em Andamento";
        char NivelDamissao = 'A';

        System.out.println("Nome do ninja: "+ nomeNinja1 + " tem "+ idadeNinja + " anos "+ " missão "+ Missao + " status da missão " + StatusDaMissao + " nivel " + NivelDamissao);
        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 14;
        String Missao2 = "Reconhecimento da Aldeida";
        String StatusDaMissao2 = "Em Andamento";
        char NivelDamissao2 = 'A';
        System.out.println("Nome do ninja: "+ nomeNinja2 + " tem "+ idadeNinja2 + " anos "+ " missão "+ Missao2 + " status da missão " + StatusDaMissao2 + " nivel " + NivelDamissao2);
        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 15;
        String Missao3 = "Curar Feridos";
        String StatusDaMissao3 = "Em Andamento";
        char NivelDamissao3 = 'B';
        System.out.println("Nome do ninja: "+ nomeNinja3 + " tem "+ idadeNinja3 + " anos "+ " missão "+ Missao3 + " status da missão " + StatusDaMissao3 + " nivel " + NivelDamissao3);

        if (idadeNinja < 15) {
            if (NivelDamissao == 'C' || NivelDamissao == 'D'){
                StatusDaMissao = "Concluida";
            }else {
                StatusDaMissao = "Não Concluida";
            }
        }else {
            StatusDaMissao = "Conclúida";
        }
    }
}
