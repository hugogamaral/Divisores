import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra quantos e quais divisores um número possui!");
        char resp = 'y';
        while (resp == 'y') {
            List<Integer> divisores= new ArrayList<>();
            System.out.print("Digite um número inteiro: ");
            int n = sc.nextInt();
            int quantidade = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisores.add(i);
                    quantidade++;
                }
            }
            System.out.println("O número " + n + " possui " + quantidade + " divisores!");
            System.out.println(divisores);
            System.out.println("\nDeseja repetir (y/n)? ");
            resp = sc.next().charAt(0);
        }
    }
}