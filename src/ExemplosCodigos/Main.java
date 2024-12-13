package ExemplosCodigos;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int Soma = calc.somar(5,3);
        int subtracao = calc.subtrair(3,2);
        int multiplicacao = calc.multiplicar(5,5);
        double divisao = calc.dividir(20,3);


        System.out.println("Soma: " + Soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisao: " + divisao);

    }
}
