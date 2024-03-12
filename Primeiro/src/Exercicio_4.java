public class Exercicio_4 {
    public static void main(String[] args) {
        int i;
        int contador = 100;
        while (contador > 0){
            for (i = contador * 2; i >= 1; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    contador--;
                }
            }
        }
    }
}
