public class Exercicio2 {
    public static void main(String[] args) {
        double media1;
        double media2;
        media1 = (8 + 9 + 7) / 3;
        media2 = (4 + 5 + 6) / 3;
        System.out.println("A média de 8, 9 e 7 é " + media1);
        System.out.println("A média de 4, 5 e 6 é " + media2);
        double soma;
        soma = media1 + media2;
        System.out.println("A soma das duas medias é " + soma);
        double media_total;
        media_total = soma / 2;
        System.out.println("A média das duas medias é " + media_total);
    }
}
