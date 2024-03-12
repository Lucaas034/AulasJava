import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double sm, salario, qtd, anual, porcent, vl, total, horas;
        int op = 1;
        Scanner scan = new Scanner(System.in);
        while(op != 0) {

            System.out.println("Escolha 1 opção de 1 a 3:");
            System.out.println("1 - Para calcular quantos salarios mínimos recebe por mes.");
            System.out.println("2 - Para calcular quantos salarios mínimos recebe por ano.");
            System.out.println("3 - Para calcular suas horas extras e o total com o salario");
            System.out.println("0 - Para encerrar o programa");
            op = scan.nextInt();
            if(op == 1){
                salario = 0;
                System.out.println("Digite o valor atual do salário mínimo:");
                sm = scan.nextDouble();
                System.out.println("Por favor, informe o seu salário mensal atual:");
                salario = scan.nextDouble();
                qtd = salario / sm;
                System.out.println("Você recebe " + qtd + " salários mínimos por mês!");
                System.out.println();
            } else if (op == 2) {
                salario = 0;
                System.out.println("Digite o valor atual do salário mínimo:");
                sm = scan.nextDouble();
                System.out.println("Por favor, informe o seu salário mensal atual:");
                salario = scan.nextDouble();
                qtd = salario / sm;
                anual = qtd * 12;
                System.out.println("Você recebe " + anual + " salarios mínimos por ano!");
            } else if (op == 3) {
                salario = 0;
                System.out.println("Por favor, informe o seu salário mensal atual:");
                salario = scan.nextDouble();
                System.out.println("Agora, a porcentagem de cada hora extra sobre o salario mensal:");
                porcent = scan.nextDouble();
                System.out.println("Agora, informe quantas horas extra fez no mês:");
                horas = scan.nextDouble();
                vl = (porcent * salario) / 100;
                total = horas * vl + salario;
                System.out.println("Suas horas extras no total foram R$ " + vl * horas);
                System.out.println("Total com o salário você receberá R$ " + total);
            } else if (op == 0) {
                System.out.println("Obrigado por utlizar o programa!!! =D Volte sempre!!! =) ");
            } else if (op > 3) {
                System.out.println("Por favor, digite uma opção válida! :D ");
            }
        }
    }
}
