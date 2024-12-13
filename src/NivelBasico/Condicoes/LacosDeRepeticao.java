package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int numeroDeClones = 0;
        int numeroMaxClones = 40;

        while (numeroDeClones <= numeroMaxClones){
            System.out.println("O Naruto fez um clone das sombras "+  numeroDeClones);
            numeroDeClones++ ;

        }
        for (int i = 0; i <= numeroMaxClones ; i++) {
            System.out.println("O Naruto fez outro clone " + i);
            
        }
    }
}
