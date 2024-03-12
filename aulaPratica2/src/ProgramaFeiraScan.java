import java.util.Scanner;

public class ProgramaFeiraScan {
    public static void main(String[] args) {
        String[] itens = new String[10];
        double[] valores = new double[10];
        double soma = 0;
        Scanner scan = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o nome do item que deseja cadastrar: ");
            itens[i] = scan.nextLine();
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o valor do " + itens[i]);
            valores[i] = ler.nextDouble();
            soma = soma + valores[i];
        }
        double media = soma / valores.length;

        System.out.println("Os produtos com valor maior que a media são: ");
        for(int i = 0; i < valores.length; i++){
            if(valores[i] > media){
                System.out.print(itens[i] + " = R$ " + String.format("%.2f", valores[i]));
                System.out.println();
            }
        }

//        for(int i = 0; i < 10; i++){
//            System.out.println(itens[i]);
//            System.out.println(valores[i]);
//        }
    }
}
