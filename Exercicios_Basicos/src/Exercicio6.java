import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, antes, prox, i = 1;
        while(i > 0) {
            System.out.println("Digite o número que deseja: ");
            num = scan.nextInt();
            antes = num - 1;
            prox = num + 1;
            System.out.println("Antecessor = " + antes);
            System.out.println("Sucessor = " + prox);
            System.out.println("Se deseja parar digite 0, caso contrario digite qualquer outro valor");
            i = scan.nextInt();

        }
        if(i == 0){
            System.out.println("Obrigado por utilizar :)");
        }
    }
}
