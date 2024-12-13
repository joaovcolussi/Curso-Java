package NivelIntermediário;

public class Main {
    public static void main(String[] args) {

        Ninja Sasuke = new Ninja();
        Sasuke.Nome = "Sasuke Uchiha";
        Sasuke.Idade = 19;
        Sasuke.Aldeia = "Aldeia da Folha";

        Ninja Naruto = new Ninja();
        Naruto.Nome = "Naruto Uzumaki";
        Naruto.Idade = 19;
        Naruto.Aldeia= "Aldeia da Folha";

        Ninja Sakura = new Ninja();
        Sakura.Nome = "Sakura Haruno";
        Sakura.Idade = 19;
        Sakura.Aldeia = "Aldeia da Folha";

        Ninja Tsunade = new Ninja();
        Tsunade.Nome = "Tsunade Peituda";
        Tsunade.Idade = 39;
        Tsunade.Aldeia = "Aldeia da Folha";



        Tsunade.detalhesNinjas();
        Sasuke.detalhesNinjas();
        Sasuke.SharinganAtivado();

    }
}
