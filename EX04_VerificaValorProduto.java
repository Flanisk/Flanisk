import java.util.Scanner;

public class EX04_VerificaValorProduto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite algo");

        int a = leia.nextInt();
        int b = leia.nextInt();

        if (a < 1 || a > 1000 || b < 1 || b > 1000) {
            System.out.println("Valor invalido");
            return;
        }

        if (a < b) {
            System.out.println("O produto 1 é mais barato");
        } else if (b < a) {
            System.out.println("O produto 2 é mais barato");

            } else {
        System.out.println("Os dois produtos são iguais");
        }


        }
    }
