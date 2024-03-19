public class Programa {
    public static void main(String[] args) {
        funcionario f1 = new funcionario();
        f1.nome = "Clenio";
        f1.departamento = "Financeiro";
        f1.salario = 6500.80;
        f1.dataEntrada = "19-03-2022";
        f1.rg = "MG-01.010.010-0";

        funcionario f2 = new funcionario();
        f2.nome = "Claudia";
        f2.departamento = "Recepção";
        f2.salario = 2000.90;
        f2.dataEntrada = "19-03-2023";
        f2.rg = "MG-10.101.010-1";

        System.out.println("Salario antigo: R$ " + f1.salario);
        f1.receberAumento();
        System.out.println("Novo Salario: R$ " + f1.salario);

        System.out.println("Salario antigo: R$ " + f2.salario);
        f2.receberAumento();
        System.out.println("Novo Salario: R$ " + f2.salario);

        System.out.println("O funcionário " + f1.nome + " recebe anualmante R$ " +
                String.format("%.2f", f1.calculaGanhoAnual()));
        System.out.println("A funcionária " + f2.nome + " recebe anualmente R$ " +
                String.format("%.2f", f2.calculaGanhoAnual()));

        System.out.println(f1==f2);
        }
    }
