
public class Poupança extends Conta {
    
    /**
     * Realiza um débito na conta poupança.
     * @param valor O valor a ser debitado da conta.
     */
    public void debito(double valor) {
        // Realiza o débito na conta, deduzindo o valor
        this.saldo = this.saldo - valor;
    }
    
    /**
     * Retorna uma representação em string da Conta Poupança.
     * @return Uma string com informações da conta poupança.
     */
    public String toString() {
        return "Conta Poupança:\nNúmero: " + Integer.toString(this.agencia) + 
                "\nConta: " + Integer.toString(this.numero) +
                "\nSaldo: " + Double.toString(this.saldo) + "\n-------------";
    }
    
}
