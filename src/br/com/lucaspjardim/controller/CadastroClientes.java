package br.com.lucaspjardim.controller;

import br.com.lucaspjardim.model.Cliente;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Classe responsável pelo cadastro e gerenciamento de clientes.
 *
 * Author: Lucas Jardim
 */
public class CadastroClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private int nextID = 1; // ID gerado automaticamente

    /**
     * Adiciona um novo cliente à lista de clientes.
     * Os dados do cliente são coletados através de caixas de diálogo.
     *
     * @throws NumberFormatException se a entrada para o número do endereço não for um número válido.
     */
    public void adicionarCliente() {
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente:");
        int numeroEndereco = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do endereço:"));
        String cidade = JOptionPane.showInputDialog("Digite a cidade do cliente:");
        String estado = JOptionPane.showInputDialog("Digite o estado do cliente:");

        // Cria um novo cliente sem ID
        Cliente cliente = new Cliente(nome, cpf, telefone, endereco, numeroEndereco, cidade, estado);

        // Define o ID automaticamente
        cliente.setId(nextID++);

        // Adiciona o cliente à lista de clientes
        clientes.add(cliente);

        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
    }

    /**
     * Lista todos os clientes cadastrados e exibe as informações em uma caixa de diálogo.
     * Não possui parâmetros de entrada.
     */
    public void listarClientes() {
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado.");
        } else {
            StringBuilder listaClientes = new StringBuilder("Clientes cadastrados:\n\n");

            for (Cliente cliente : clientes) {
                listaClientes.append("ID: ").append(cliente.getId()).append("\n")
                        .append("Nome: ").append(cliente.getNome()).append("\n")
                        .append("CPF: ").append(cliente.getCpf()).append("\n")
                        .append("Telefone: ").append(cliente.getTelefone()).append("\n")
                        .append("Endereço: ").append(cliente.getEndereco()).append(", ").append(cliente.getNumeroEndereco()).append("\n")
                        .append("Cidade: ").append(cliente.getCidade()).append("\n")
                        .append("Estado: ").append(cliente.getEstado()).append("\n")
                        .append("-----------------------------\n");
            }

            JOptionPane.showMessageDialog(null, listaClientes.toString(), "Lista de Clientes", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Atualiza os dados de um cliente existente.
     * O ID do cliente a ser atualizado é solicitado ao usuário.
     *
     * @throws NumberFormatException se a entrada para o número do endereço não for um número válido.
     */
    public void atualizarCliente() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente que deseja atualizar:"));
        Cliente cliente = encontrarClientePorId(id);

        if (cliente != null) {
            String nome = JOptionPane.showInputDialog("Digite o novo nome do cliente:", cliente.getNome());
            String cpf = JOptionPane.showInputDialog("Digite o novo CPF do cliente:", cliente.getCpf());
            String telefone = JOptionPane.showInputDialog("Digite o novo telefone do cliente:", cliente.getTelefone());
            String endereco = JOptionPane.showInputDialog("Digite o novo endereço do cliente:", cliente.getEndereco());
            int numeroEndereco = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo número do endereço:", cliente.getNumeroEndereco()));
            String cidade = JOptionPane.showInputDialog("Digite a nova cidade do cliente:", cliente.getCidade());
            String estado = JOptionPane.showInputDialog("Digite o novo estado do cliente:", cliente.getEstado());

            // Atualiza os dados do cliente
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            cliente.setTelefone(telefone);
            cliente.setEndereco(endereco);
            cliente.setNumeroEndereco(numeroEndereco);
            cliente.setCidade(cidade);
            cliente.setEstado(estado);

            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }
    }

    /**
     * Exclui um cliente da lista de clientes.
     * O ID do cliente a ser excluído é solicitado ao usuário.
     * Não possui parâmetros de entrada.
     */
    public void excluirCliente() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente que deseja excluir:"));
        Cliente cliente = encontrarClientePorId(id);

        if (cliente != null) {
            clientes.remove(cliente);
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }
    }

    /**
     * Método auxiliar para encontrar um cliente pelo ID.
     *
     * @param id O ID do cliente a ser encontrado.
     * @return O cliente encontrado ou null se não encontrado.
     */
    private Cliente encontrarClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
}
