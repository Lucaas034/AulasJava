import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 1, op, c = 1, op1 = 1;
        double C, K, Re, Ra, F;

        while(i != 0){
            System.out.println("\n             Escolha para qual escala deseja converter (1-4)");
            System.out.println();
            System.out.println("1 - Para converter de Celsius(C) pra Kelvin(K).");
            System.out.println("2 - Para converter de Celsius(C) pra Réaumur(Re).");
            System.out.println("3 - Para converter de Celsius(C) pra Rankine(Ra).");
            System.out.println("4 - Para converter de Celsius(C) pra Fahrenheit(F).");
            System.out.println("0 - Para encerrrar o conversor de temperatura.");
            op = scan.nextInt();
            if(op == 1){
                System.out.println("Informe qual temperaura em graus Celsius deseja converter: ");
                C = scan.nextDouble();
                K = C + 273.15;
                while(c != 0){
                System.out.println(C + "ºC em Kelvin é " + K + " K\n");
                System.out.println("1 - Para encerrar o conversor de temperatura.");
                System.out.println("2 - Para fazer outra conversão.");
                op1 = scan.nextInt();
                if (op1 == 1) {
                    i = 0;
                    c = 0;
                    System.out.println("Obrigado por utilizar o conversor!!! :D");
                } else if (op1 == 2) {
                    c = 0;
                } else if (op1 == 0 || op1 > 2) {
                    System.out.println("\nEscolha uma opção válida!\n");
                    c = 1;
                }
                }
            }
            if(op == 2){
                System.out.println("Informe a temperatura em graus Celsius deseja converter: ");
                C = scan.nextDouble();
                Re = C * 0.8;
                while(c != 0) {
                    System.out.println(C + "ºC em Réaumur é " + Re + " ºRe\n");
                    System.out.println("1 - Para encerrar o conversor de temperatura.");
                    System.out.println("2 - Para fazer outra conversão.");
                    op1 = scan.nextInt();
                    if (op1 == 1) {
                        i = 0;
                        c = 0;
                        System.out.println("Obrigado por utilizar o conversor!!! :D");
                    } else if (op1 == 2) {
                        c = 0;
                    } else if (op1 == 0 || op1 > 2) {
                        System.out.println("\nEscolha uma opção válida!\n");
                        c = 1;
                    }
                }
            }
            if(op == 3){
                System.out.println("Informe a temperatura em graus Celsius deseja converter: ");
                C = scan.nextDouble();
                Ra = C * 1.8 + 32 + 459.67;
                while(c != 0) {
                    System.out.println(C + "ºC em Rankine é " + Ra + " ºRa\n");
                    System.out.println("1 - Para encerrar o conversor de temperatura.");
                    System.out.println("2 - Para fazer outra conversão.");
                    op1 = scan.nextInt();
                    if (op1 == 1) {
                        i = 0;
                        c = 0;
                        System.out.println("Obrigado por utilizar o conversor!!! :D");
                    } else if (op1 == 2) {
                        c = 0;
                    } else if (op1 == 0 || op1 > 2) {
                        System.out.println("\nEscolha uma opção válida!\n");
                        c = 1;
                    }
                }
            }
            if(op == 4){
                System.out.println("Informe a temperatura em graus Celsius deseja converter: ");
                C = scan.nextDouble();
                F = C * 1.8 + 32;
                while(c != 0) {
                    System.out.println(C + "ºC em Fahrenheit é " + F + " ºF\n");
                    System.out.println("1 - Para encerrar o conversor de temperatura.");
                    System.out.println("2 - Para fazer outra conversão.");
                    op1 = scan.nextInt();
                    if (op1 == 1) {
                        i = 0;
                        c = 0;
                        System.out.println("Obrigado por utilizar o conversor!!! :D");
                    } else if (op1 == 2) {
                        c = 0;
                    } else if (op1 == 0 || op1 > 2) {
                        System.out.println("\nEscolha uma opção válida!\n");
                        c = 1;
                    }
                }
            } else if (op == 0) {
                System.out.println("Obrigado por utilizar o conversor!!! :D");
                i = 0;
            } else if (op > 4) {
                System.out.println("Por favor escolha uma opção válida\n");
            }
            op1 = 1;
            op = 1;
            c = 1;
        }
    }
}
