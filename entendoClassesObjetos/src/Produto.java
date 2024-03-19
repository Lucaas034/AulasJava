
public class Produto {
    String nome;
    double preco;
    int estoque;

    public double retornaDesconto(){
        double desconto;

        desconto = preco - 5;

        return desconto;
    }
}
