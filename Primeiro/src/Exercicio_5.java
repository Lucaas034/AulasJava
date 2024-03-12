public class Exercicio_5 {
    public static void main(String[] args) {
        int a = 1;
        int b;
        while (a <= 10) {
            System.out.println();
            System.out.println("Tabuada de 1 a 10 do " + a);
            System.out.println();
            b = 1;
            while (b <= 10) {
                int resultado = a * b;
                System.out.println(a + " * " + b + " = " + resultado);
                b++;
            }
            a++;

        }
    }
}
