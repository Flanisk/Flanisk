import java.util.Random;

public class EX05_ADivisivelPorBRando {
    public static void main (String[] args){
        Random leia = new Random();

        int a = leia.nextInt(1001);
        int b = leia.nextInt(21);

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        if (b == 0){

        } else if (a % b == 0) {
            System.out.println("Divisivel");
        } else {
            System.out.println("Não é divisivel");
        }

    }
}
