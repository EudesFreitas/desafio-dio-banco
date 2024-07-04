
public class ProjetoBanco {

    /**
     * Método principal que inicia a execução do programa.
     * @param args Os argumentos da linha de comando (não são usados neste exemplo).
     */
    public static void main(String[] args) {
        // TODO código de aplicação aqui
        
        // Instancia um cliente
        Cliente cliente1 = new Cliente("Alexandre", "93580843087");
        
        // Instancia uma conta do tipo corrente
        Corrente corrente1 = new Corrente();
        
        // Cria a conta corrente para o cliente1 com saldo inicial 0
        corrente1.criarConta(cliente1, 0);
        
        // Imprime o objeto corrente1 após criar a conta
        System.out.println(corrente1);
        
        // Realiza um depósito de 500 na conta corrente
        corrente1.credito(500);
        
        // Imprime o objeto corrente1 após o depósito
        System.out.println(corrente1);
        
        // Realiza um débito de 100 na conta corrente
        corrente1.debito(100);
        
        // Imprime o objeto corrente1 após o débito
        System.out.println(corrente1);
               
        // Instancia uma conta do tipo poupança
        Poupança poupanca1 = new Poupança();
        
        // Imprime o objeto poupanca1
        System.out.println(poupanca1);
        
        // Cria a conta poupança para o cliente1 com saldo inicial 0
        poupanca1.criarConta(cliente1, 0);
        
        // Imprime o objeto poupanca1 após criar a conta
        System.out.println(poupanca1);
        
        // Realiza um depósito de 500 na conta poupança
        poupanca1.credito(500);
        
        // Imprime o objeto poupanca1 após o depósito
        System.out.println(poupanca1);
        
        // Realiza um débito de 100 na conta poupança
        poupanca1.debito(100);
        
        // Imprime o objeto poupanca1 após o débito
        System.out.println(poupanca1);
        
        // Transfere 100 da conta poupança para a conta corrente
        poupanca1.transferirParaAConta(100, corrente1);
        
        // Imprime os objetos corrente1 e poupanca1 após a transferência
        System.out.println(corrente1);
        System.out.println(poupanca1);
        
        // Transfere 100 da conta corrente para a conta poupança
        corrente1.transferirParaAConta(100, poupanca1);
        
        // Imprime os objetos corrente1 e poupanca1 após a transferência
        System.out.println(corrente1);
        System.out.println(poupanca1);
    }
    
}
