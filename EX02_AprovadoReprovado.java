import java.util.Scanner;

public class EX02_AprovadoReprovado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite algo: ");

        int usuario = scanner.nextInt();
        if (usuario > 6) { System.out.println("Aprovado");
        } else { System.out.println("Reprovado");}
    }
}
