import java.util.Scanner;

public class ProgramaDiagonalScan {
    public static void main(String[] args) {
        double[][] x = new double[10][10];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.println("Qual valor deseja alocar na posição ["+ i + "]["+ j +"]");
                x[i][j] = scan.nextDouble();
            }
        }
        System.out.printf("Diagonal Principal: \n");
        for(int i = 0; i < 10; i++){
            System.out.printf(x[i][i] + "   ");
            }
        System.out.println();
        System.out.printf("Diagonal Secundaria: \n");
        for(int i = 0; i < 10; i++){
            System.out.printf(x[i][9 - i] + "   ");
        }
        System.out.println();
    }
}
