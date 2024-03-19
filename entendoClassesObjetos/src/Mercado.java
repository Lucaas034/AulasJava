import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[3];
        Scanner entrada = new Scanner(System.in);

        for (int i=0; i< produtos.length; i++){
            produtos[i] = new Produto();
            System.out.println("Digite o nome do produto: ");
            produtos[i].nome = entrada.next();
            System.out.println("Digite o preço do produtos: ");
            produtos[i].preco = entrada.nextDouble();

        }

        for (Produto p: produtos) {
            System.out.println("nome: " + p.nome);
            System.out.println("preço: " + p.preco);
            System.out.println("-----------------------------");

        }



    }
}
