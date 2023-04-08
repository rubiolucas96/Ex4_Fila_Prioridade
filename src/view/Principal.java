package view;

import br.edu.fateczl.filaobj.Fila;
import Controller.FilaController;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Fila fila = new Fila();
        Fila filaPrioritarios = new Fila();
        String opcao;
        do {
            opcao = JOptionPane.showInputDialog(null,
                    "Escolha uma opção:\n\n"
                            + "1 - Inserir senha prioritária na fila\n"
                            + "2 - Inserir senha na fila\n"
                            + "3 - Chamar próximo cliente\n"
                            + "4 - Sair",
                    "Sistema de Senhas",
                    JOptionPane.PLAIN_MESSAGE);
            switch (opcao) {
                case "1":
                    try {
                        String senha = JOptionPane.showInputDialog(null,
                                "Digite a senha para inserir na fila:",
                                "Inserir Senha",
                                JOptionPane.PLAIN_MESSAGE);
                        FilaController.inserirNaFila(fila, senha);
                        JOptionPane.showMessageDialog(null,
                                "Senha " + senha + " inserida com sucesso na fila.",
                                "Sucesso",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                e.getMessage(),
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "2":
                    try {
                        String senha = JOptionPane.showInputDialog(null,
                                "Digite a senha prioritária para inserir na fila:",
                                "Inserir Senha Prioritária",
                                JOptionPane.PLAIN_MESSAGE);
                        FilaController.inserirNaFila(filaPrioritarios, senha);
                        JOptionPane.showMessageDialog(null,
                                "Senha " + senha + " inserida com sucesso na fila prioritária.",
                                "Sucesso",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                e.getMessage(),
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "3":
                    try {
                        FilaController.chamarProximoCliente(filaPrioritarios, fila);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                e.getMessage(),
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null,
                            "Obrigado por utilizar o Sistema de Senhas.",
                            "Sair",
                            JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção inválida. Escolha uma opção válida.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (!opcao.equals("4"));
    }
}
