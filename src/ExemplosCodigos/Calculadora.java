package ExemplosCodigos;

public class Calculadora {
    //metodo para somar dois numeros

    public int somar(int a, int b){
        return a + b;
    }
    //metodo subtrair dois numeros

    public int subtrair(int a, int b){
        return a - b;
    }

    //metodo multiplicar dois numeros
    public int multiplicar (int a, int b){
        return a * b;
    }

    //metodo dividir dois numeros
    public double dividir (double a, double b){
        if (b != 0){
            return a/b;
        }else {
            System.out.println("Não é possivel dividir por zero");
            return 0;
        }
    }
 }

