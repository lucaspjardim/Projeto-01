package br.com.lucaspjardim.model;

import java.util.Objects;

/**
 * Classe que representa um cliente no sistema.
 *
 * A classe contém informações sobre o cliente, incluindo nome, CPF, telefone,
 * endereço, número do endereço, cidade e estado. O ID do cliente é gerado
 * automaticamente ao ser cadastrado.
 *
 * Author: Lucas Jardim
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private int numeroEndereco;
    private String cidade;
    private String estado;

    /**
     * Construtor para a classe Cliente.
     *
     * @param nome           O nome do cliente.
     * @param cpf            O CPF do cliente.
     * @param telefone       O telefone do cliente.
     * @param endereco       O endereço do cliente.
     * @param numeroEndereco O número do endereço do cliente.
     * @param cidade         A cidade onde o cliente reside.
     * @param estado         O estado onde o cliente reside.
     */
    public Cliente(String nome, String cpf, String telefone, String endereco, int numeroEndereco, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    /**
     * Obtém o ID do cliente.
     *
     * @return O ID do cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do cliente.
     *
     * @param id O ID a ser definido para o cliente.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome do cliente.
     *
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome O nome a ser definido para o cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF do cliente.
     *
     * @return O CPF do cliente.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do cliente.
     *
     * @param cpf O CPF a ser definido para o cliente.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o telefone do cliente.
     *
     * @return O telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do cliente.
     *
     * @param telefone O telefone a ser definido para o cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o endereço do cliente.
     *
     * @return O endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     *
     * @param endereco O endereço a ser definido para o cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o número do endereço do cliente.
     *
     * @return O número do endereço do cliente.
     */
    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    /**
     * Define o número do endereço do cliente.
     *
     * @param numeroEndereco O número a ser definido para o endereço do cliente.
     */
    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    /**
     * Obtém a cidade onde o cliente reside.
     *
     * @return A cidade do cliente.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define a cidade onde o cliente reside.
     *
     * @param cidade A cidade a ser definida para o cliente.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Obtém o estado onde o cliente reside.
     *
     * @return O estado do cliente.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o estado onde o cliente reside.
     *
     * @param estado O estado a ser definido para o cliente.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Retorna uma representação em String do objeto Cliente.
     *
     * @return Uma string que representa o cliente com todos os seus detalhes.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numeroEndereco=" + numeroEndereco +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    /**
     * Compara este cliente com outro objeto para verificar se são iguais.
     * Dois clientes são considerados iguais se seus IDs e demais atributos forem iguais.
     *
     * @param o O objeto a ser comparado.
     * @return true se os clientes forem iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id && numeroEndereco == cliente.numeroEndereco &&
                Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf) &&
                Objects.equals(telefone, cliente.telefone) && Objects.equals(endereco, cliente.endereco) &&
                Objects.equals(cidade, cliente.cidade) && Objects.equals(estado, cliente.estado);
    }

    /**
     * Retorna um valor hash para o cliente.
     *
     * @return Um valor hash para o objeto Cliente.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, telefone, endereco, numeroEndereco, cidade, estado);
    }
}
