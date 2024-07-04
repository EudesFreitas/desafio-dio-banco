import java.util.Random;

/**
 *
 * Classe abstrata que representa uma conta genérica em um banco.
 */
public abstract class Conta {
    
    // Atributos protegidos da classe Conta
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    

    // Construtor padrão da classe Conta
    public Conta() {
        this.numero = 0;
        this.agencia = 0;
        this.saldo = 0;
        this.cliente = null;
    }
   
    /**
     * Cria uma nova conta para o cliente com saldo inicial.
     * @param cliente O cliente para quem a conta será criada.
     * @param saldoInicial O saldo inicial da conta.
     */
    public void criarConta(Cliente cliente, double saldoInicial) {
        Random random = new Random();
        int numConta = random.nextInt(1000000);
        int numAgencia = random.nextInt(1000);
        this.cliente = cliente;
        this.numero = numConta;
        this.agencia = numAgencia;
        this.saldo = saldoInicial;
    }
    
    /**
     * Realiza um crédito na conta.
     * @param valor O valor a ser creditado na conta.
     */
    public void credito(double valor) {
        this.saldo = this.saldo + valor;
    }
    
    /**
     * Transfere um valor para outra conta.
     * @param valor O valor a ser transferido.
     * @param conta A conta de destino para a transferência.
     */
    public void transferirParaAConta(double valor, Conta conta){
        this.debito(valor);
        conta.credito(valor);
    }
    
    /**
     * Método abstrato para realizar um débito na conta (deve ser implementado pelas subclasses).
     * @param valor O valor a ser debitado da conta.
     */
    public abstract void debito(double valor);
    
}
