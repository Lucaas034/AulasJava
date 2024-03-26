public class Conta {
        String tipo;
        double saldo;
        Cliente cliente;
        public void depositar(double valor){
            saldo = saldo + valor;
        }
        public void mostrarDados(){
            System.out.println("Tipo: " + tipo);
            System.out.println("Saldo: " + saldo);
            System.out.println("Cliente: " + cliente.nome);
        }
    }

