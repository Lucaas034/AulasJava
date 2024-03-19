public class Executavel {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro();
        c1.raca = "Pit bull";
        c1.tamanho = 60;

        System.out.println(" O Cachorro " + c1.raca +
                " tem a altura de " +  c1.tamanho + "cm e o comportamento:");
        c1.latir();

        Cachorro c2 = new Cachorro();
        c2.raca = "chow chow";
        c2.tamanho =  80;

        System.out.println(" O Cachorro " + c2.raca +
                " tem a altura de " +  c2.tamanho + "cm");
        c2.latir();

    }

}
