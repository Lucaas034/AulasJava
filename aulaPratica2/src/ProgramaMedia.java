
public class ProgramaMedia {
    public static void main(String[] args) {
        double[] notas = new double[10];
        double soma = 0, media;

        for (int i = 0; i < notas.length; i++){
            notas[i] = i + 10;
        }
        for(double nota : notas){
            soma = soma + nota;
        }

//        for(int i = 0; i < 10; i++){
//            notas[i] = i + 10;
//            soma = soma + notas[i];
//        }

        media = soma/notas.length;

        System.out.println("Média = " + media);
    }
}
