public class Conta {
    String tipo;
    double saldo;
    String cliente;

    public void mostrarDados(){
        System.out.println("Tipo da conta: "+ tipo);
        System.out.println("Saldo: " + String.format("%.2f", saldo));
        System.out.println("Cliente: " + cliente);
    }
    public void aumentarSaldo(double valor){
        saldo = saldo + valor;
        System.out.println("Valor de R$ " + String.format("%.2f", valor) + " adicionado ao saldo.");
    }
}
