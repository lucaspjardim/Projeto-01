package br.com.lucaspjardim;

import br.com.lucaspjardim.controller.CadastroClientes;

import javax.swing.*;

/**
 * Classe principal que inicia o sistema de cadastro de clientes.
 *
 * Esta classe contém o método main que exibe um menu interativo para o
 * usuário realizar operações de cadastro de clientes, como adicionar,
 * listar, atualizar e excluir clientes. O menu é exibido usando a classe
 * JOptionPane para uma interface gráfica simples.
 */
public class Main {
    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        CadastroClientes cadastro = new CadastroClientes();
        boolean continuar = true;

        while (continuar) {
            String[] opcoes = {"Adicionar Cliente", "Listar Clientes", "Atualizar Cliente", "Excluir Cliente", "Sair"};
            String opcao = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção",
                    "Sistema de Cadastro de Clientes",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            if (opcao == null) {
                continuar = false; // Fechar o programa se o usuário cancelar
                break;
            }

            switch (opcao) {
                case "Adicionar Cliente":
                    cadastro.adicionarCliente();
                    break;
                case "Listar Clientes":
                    cadastro.listarClientes();
                    break;
                case "Atualizar Cliente":
                    cadastro.atualizarCliente();
                    break;
                case "Excluir Cliente":
                    cadastro.excluirCliente();
                    break;
                case "Sair":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }
}
