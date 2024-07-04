/*
 * Este é um exemplo simples de classe Cliente em um projeto de banco.
 * Ele demonstra como definir atributos e construtores básicos.
 */


public class Cliente {
    
    // Atributos privados da classe Cliente
    private String nome;
    private String cpf;
    
    /**
     * Construtor da classe Cliente.
     * @param nome O nome do cliente.
     * @param cpf O CPF do cliente.
     */
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // Getters e Setters para os atributos privados
    
    /**
     * Obtém o nome do cliente.
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     * @param nome O nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF do cliente.
     * @return O CPF do cliente.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do cliente.
     * @param cpf O CPF do cliente.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
