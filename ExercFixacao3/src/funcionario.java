public class funcionario {

    String nome;
     String departamento;
     double salario;
     String dataEntrada;
     String rg;

    public double receberAumento() {
        double aumento = (salario * 10) / 100;
        return salario = salario + aumento;
    }
    public double calculaGanhoAnual() {
        return salario * 12;
    }
}
