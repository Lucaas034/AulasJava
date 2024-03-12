public class ProgramaDiagonal {
    public static void main(String[] args) {

        int[][] x = new int[10][10];

        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                x[i][j] = i + j;
            }
        }
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                System.out.print(x[i][j] + " ");;
            }
            System.out.println();
        }

        System.out.print("Diagonal Principal: ");
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                if(i == j) {
                    System.out.print(x[i][j] + " ");
                }
            }
        }
        System.out.print("\nDiagonal Secundaria: ");
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x.length; j++){
                if(i + j == x.length-1){
                    System.out.print(x[i][j] + " ");
                }
            }
        }
    }
}
