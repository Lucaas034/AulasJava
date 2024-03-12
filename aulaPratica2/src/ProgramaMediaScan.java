import java.util.Scanner;

public class ProgramaMediaScan {
    public static void main(String[] args) {
        double[] notas = new double[10];

        for (int i = 0; i < 10; i++){
            Scanner scan = new Scanner(System.in);
            notas[i] = scan.nextDouble();
        }
        double soma = 0;
        for(double nota : notas){
            soma = soma + nota;
        }
        double media = 0;
        media = soma/10;
        System.out.println("A média das notas é: " + media);
    }
}
