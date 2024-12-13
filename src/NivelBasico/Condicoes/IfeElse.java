package Condicoes;

public class IfeElse {
    public static void main(String[] args) {
        /*
        IF e ElSE = Condicoes
        Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
         */

        //Ninja Naruto
        String Nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;

        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println(Nome +" Rank: Chunnin");
        }else if(numeroDeMissoes>=20){
            System.out.println(Nome + " Rank: Jounin");
        }else{
            System.out.println(Nome + "Gennim");
        }
    }


}
