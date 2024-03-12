import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op = 1;
        while (op > 0) {
            System.out.println("Para fazer uma soma digite 1");
            System.out.println("Para fazer uma subtração digite 2");
            System.out.println("Para fazer uma exponenciação digite 3");
            System.out.println("Para sair digite 0");
            double a = 0;
            double b = 0;
            double result;
            op = ler.nextInt();
            if (op == 1) {
                System.out.println("Digite o primeiro termo da soma: ");
                a = ler.nextDouble();
                System.out.println("Digite o segundo termo da soma: ");
                b = ler.nextDouble();
                result = a + b;
                System.out.println();
                System.out.println("***** " + a + " + " + b + " = " + result + " *****");
                System.out.println();
            } else if (op == 2) {
                System.out.println("Digite o primeiro termo da subtração:");
                a = ler.nextDouble();
                System.out.println("Digite o segundo termo da subtração:");
                b = ler.nextDouble();
                result = a - b;
                System.out.println();
                System.out.println("***** " + a + " - " + b + " = " + result + " *****");
                System.out.println();
            } else if (op == 3) {
                System.out.println("Qual valor da base?");
                a = ler.nextDouble();
                System.out.println("Qual valor do expoente?");
                b = ler.nextDouble();
                result = Math.pow(a, b);
                if(b == 2){
                    System.out.println();
                    System.out.println("***** " + a + " ao quadrado é = " + result + " *****");
                    System.out.println();
                } else if (b == 3) {
                    System.out.println();
                    System.out.println("***** " + a + " ao cubo é = " + result + " *****");
                    System.out.println();
                } else{
                    System.out.println();
                    System.out.println("***** " + a + " elevado a " + b + " é = " + result + " *****");
                    System.out.println();
                    System
                }
            }
        }
    }
}
