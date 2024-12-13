package NivelIntermediário;

public class Ninja {
    String Nome;
    String Aldeia;
    int Idade;

    public void SharinganAtivado(){
        System.out.println("O sharingan Ativou!");
    }

    public String euSouumNinja(){
        return "Oi, eu sou um ninja!";
    }

    public int anosParaSeTornarHokage(int idadeMinHokage){
        return idadeMinHokage - Idade;
    }

    void detalhesNinjas(){
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Aldeia);
        System.out.println("Aldeia: " + Idade);
    }


}
