public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;

    public boolean debitarSaldo(double valor){
        if(valor > this.saldo + this.limite){
            return false;
        }
            this.saldo -= this.saldo;
            return true;
    }
}
