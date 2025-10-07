import java.util.Random;

public class EX02_ValorProdutoRandom {
    public static void main(String [] args){
        Random random = new Random();
        int precoProduto1 = random.nextInt(1001);
        int precoProduto2 = random.nextInt(1001);

        System.out.println("Preco do produto1: " + precoProduto1 + "            Preco do produto2: " + precoProduto2);

        if (precoProduto1 < precoProduto2) {
            System.out.println("O primeiro produto é mais barato que o segundo");
        } else if (precoProduto1 == precoProduto2) {
            System.out.println("os dois tem o mesmo preço");
        }else {System.out.println("O segundo produto é mais barato que o primeiro");
        }
    }
}
