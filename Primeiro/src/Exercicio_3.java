public class Exercicio_3 {
    public static void main(String[] args) {
        int i = 1;
        int contador = 1;
        while(contador <= 100){
            if(i % 2 == 0){
                System.out.println(contador + "º = " + i);
                contador++;
            }
            i++;
        }
    }
}
