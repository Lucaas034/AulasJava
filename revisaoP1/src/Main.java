import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Cliente cl1 = new Cliente();
        cl1.nome = "Clenio";
        cl1.cpf = "010.101.010-10";
        cl1.salario = 10000;
        cl1.email = "clenio@uniube.com";
        cl1.idade = 30;

        Conta c1 = new Conta();
        c1.tipo = "Corrente";
        c1.saldo = 100000;
        c1.cliente = cl1.nome;

        c1.mostrarDados();
        System.out.println();
        c1.aumentarSaldo(10000);
        System.out.println();
        c1.mostrarDados();

        Conta c2 = new Conta();
        c2.tipo = "Poupança";
        c2.saldo = 1000000;
        c2.cliente = cl1.nome;

        Cliente cl2 = new Cliente();
        cl2.nome = ler.next();
        cl2.cpf = ler.next();
        cl2.salario = ler.nextDouble();
        cl2.email = ler.next();
        cl2.idade = ler.nextInt();
        System.out.println();
        Conta c3 = new Conta();
        c3.tipo = ler.next();
        c3.saldo = ler.nextDouble();
        c3.cliente = cl2.nome;

        c3.mostrarDados();
    }
}
