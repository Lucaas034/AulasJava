import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y;
        int m;
        int d;
        System.out.println("Quantos anos você tem?");
        y = scan.nextInt();
        System.out.println("Quantos meses?");
        m = scan.nextInt();
        System.out.println("E quantos dias?");
        d = scan.nextInt();
        int diasTotais;
        diasTotais = d + (y * 365) + (m * 30);
        System.out.println("Você tem " + diasTotais + " dias de vida");
    }
}
