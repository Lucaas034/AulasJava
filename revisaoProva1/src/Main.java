import javax.tools.JavaCompiler;

public class Main {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente();
        cl1.nome = "Clenio";
        cl1.cpf = "101.010.101-01";
        cl1.salario = 10000.50;
        cl1.email = "clenio@uniube.com";
        cl1.idade = 30;

        Conta co1 = new Conta();
        co1.tipo = "Corrente";
        co1.saldo = 1000000.10;
        co1.cliente = cl1;

        Conta co2 = new Conta();
        co2.tipo = "Poupança";
        co2.saldo = 1000000;
        co2.cliente = cl1;

        co1.depositar(100.5);
        co1.mostrarDados();
        System.out.println();
        co2.mostrarDados();
    }
}
