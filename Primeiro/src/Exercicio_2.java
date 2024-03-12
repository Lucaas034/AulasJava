public class Exercicio_2 {
    public static void main(String[] args) {
        int i = 0;
        int contador = 0;
        int qtd;
            while (contador < 50){
                qtd = 0;
                for(int j = i; j > 0; j--) {
                    if (i % j == 0) {
                        qtd++;
                    }
                }
                    if(qtd == 2){
                        contador++;
                        System.out.println(i);
                    }
                    i++;
            }
    }
}
