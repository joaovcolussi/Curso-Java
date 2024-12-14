package NivelIntermediário;

public class Main {
    public static void main(String[] args) {


        Uchiha Sasuke = new Uchiha();
        Sasuke.Nome = "Sasuke Uchiha";
        Sasuke.Idade = 29;
        Sasuke.Aldeia = "Aldeia da Folha";
        Sasuke.SharinganAtivado();

        Uzumaki Naruto = new Uzumaki();
        Naruto.Nome = "Naruto Uzumaki";
        Naruto.Idade = 19;
        Naruto.Aldeia = "Aldeia da Folha";
        Naruto.ModoSabioAtivado();

        Haruno Sakura = new Haruno();
        Sakura.Nome = "Sakura Haruno";
        Sakura.Idade = 19;
        Sakura.Aldeia = "Aldeia da Folha";
        Sakura.ativarCura();

        Ninja Tsunade = new Ninja();
        Tsunade.Nome = "Tsunade Peituda";
        Tsunade.Idade = 39;
        Tsunade.Aldeia = "Aldeia da Folha";

        String chamandoMetodo = Tsunade.euSouumNinja();
        System.out.println(chamandoMetodo);
        Sasuke.SharinganAtivado();
      int quantoTempoFalta=  Sasuke.anosParaSeTornarHokage(50);
        System.out.println("Você tem " +Sasuke.Idade + " então falta no mínimo " + quantoTempoFalta + " anos para voce se tornar hokage");
    }
}
