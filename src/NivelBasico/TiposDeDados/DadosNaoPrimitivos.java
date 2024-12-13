package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        Dados não primitivos : String , Array, Class, Enum
          Objetivo: Criar um ninja, e atribuir metodos a ele.
         */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase =nome.toUpperCase();
        System.out.println("Texto normal: " + nome);
        System.out.println("Texto em caixa alta: " + nomeUpperCase);

        String aldeia = "Aldeia da Folha";
        System.out.println(aldeia);
        String aldeiaToLowerCase =(aldeia.toLowerCase());
        System.out.println("Aldeia em Lower Case = " + aldeiaToLowerCase);
    }
}
