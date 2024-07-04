
public class Corrente extends Conta {
        
    /**
     * Realiza um débito na conta corrente, aplicando uma taxa de CPMF.
     * @param valor O valor a ser debitado da conta.
     */
    public void debito(double valor) {
        // Calcula a taxa de CPMF
        double cpmf = valor * 0.38 / 100;
        
        // Realiza o débito na conta, deduzindo o valor e a taxa de CPMF
        this.saldo = this.saldo - valor - cpmf;
    }
    
    /**
     * Retorna uma representação em string da Conta Corrente.
     * @return Uma string com informações da conta corrente.
     */
    public String toString() {
        return "Conta Corrente:\nNúmero: " + Integer.toString(this.agencia) + 
                "\nConta: " + Integer.toString(this.numero) +
                "\nSaldo: " + Double.toString(this.saldo) + "\n-------------\n";
    }
    
}
