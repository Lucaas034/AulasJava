public class ProgramaFeira {
    public static void main(String[] args) {

        String[] itens = {"Queijo", "Tomate", "Pastel", "Alface", "Pimenta", "Farinha",
                 "Doce de leite", "Rapadura", "Mel", "Tempero"};
        double[] valores = {50 , 5, 20, 5, 7, 7, 10, 8, 10, 7};

        double soma = 0, media;


        for(int i = 0; i < itens.length; i++){
            soma = soma + valores[i];
        }
        media = soma / valores.length;

        System.out.println("Itens com preço acima da media: ");
        for(int i = 0; i < valores.length; i++){
            if(valores[i] > media){
                System.out.println(itens[i] + " : R$ " + String.format("%.2f", valores[i]));
            }
        }
    }
}
