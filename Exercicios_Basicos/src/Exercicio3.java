import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo;
        double reajuste;
        double resultado;
        System.out.println("Digite o saldo ");
        saldo = ler.nextDouble();
        reajuste = (1 * saldo) / 100;
        resultado = saldo + reajuste;
        System.out.println("Saldo com reajuste de 1% = " + resultado);
    }
}
