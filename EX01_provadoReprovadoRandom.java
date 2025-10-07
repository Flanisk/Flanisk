import java.util.Random;

public class EX01_provadoReprovadoRandom {
    public static void main(String[] args){
        Random random = new Random();

        int nota = random.nextInt(11);

        System.out.println("A sua nota é: " + nota);

        if (nota < 6) {System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}
