import java.util.Scanner;

public class EX06_ADivisivelPorB {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        int a =  leia.nextInt();
        int b = leia.nextInt();

        if (a < 0 || a > 1000 || b < 0 || b > 1000){
            System.out.println("valores não validos");
            return;
        }

        if (1 >= b) {
            System.out.println("valor não valido");
            return;
        }

        if (b == 0){
            System.out.println("Não é possível dividir por zero.");
            return;
        }

        if (a % b == 0){
            System.out.println("Divisivel");
        } else {
            System.out.println("Não divisivel");
        }






    }
}
