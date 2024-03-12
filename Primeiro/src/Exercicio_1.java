public class Exercicio_1 {
    public static void main(String[] args) {
        int ant = 0;
        int prox = 1;
        int atual = 1;
        int i = 1;
        System.out.println(atual);
        while (i < 10){
            prox = ant + atual;
            System.out.println(prox);
            ant = atual;
            atual = prox;

            i++;
        }
    }
}
