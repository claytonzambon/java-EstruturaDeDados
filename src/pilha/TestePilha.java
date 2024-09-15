package pilha;

import java.util.Stack;

import javax.swing.JOptionPane;

public class TestePilha {

	public static void main(String[] args) {
        Pilha pilha = new Pilha();
        
        String relatorioFinal = "### Pilha Implementada Manualmente ###\n";
        pilha.insere("Mercurio");
        relatorioFinal += "\nAdicionado primeiro elemento: \n" + pilha.toString();
        pilha.insere("Venus");
        relatorioFinal += "\nAdicionado outro elemento: \n" + pilha.toString();
        pilha.insere("Terra");
        relatorioFinal += "\nAdicionado outro elemento: \n" + pilha.toString();
        pilha.insere("Marte");
        relatorioFinal += "\nAdicionado outro elemento: \n" + pilha.toString();

        pilha.remove();
        relatorioFinal += "\nRemovido um elemento: \n" + pilha.toString();
        pilha.remove();
        relatorioFinal += "\nRemovido outro elemento: \n" + pilha.toString();
        relatorioFinal += "\nVerifica se a Pilha está vazia: \n" + pilha.vazia();
        relatorioFinal += "\n\n### Pilha Implementada com a Classe Stack do Java ###\n";
        Stack<String> stack = new Stack<String>();
        stack.push("Jupiter");
        relatorioFinal += "\nAdicionado primeiro elemento: \n" + stack.toString();
        stack.push("Saturno");
        relatorioFinal += "\nAdicionado outro elemento: \n" + stack.toString();
        stack.push("Urano");
        relatorioFinal += "\nAdicionado primeiro elemento: \n" + stack.toString();
        
        stack.pop();
        relatorioFinal += "\nRemovido um elemento: \n" + stack.toString();
        stack.peek();
        relatorioFinal += "\nPega o elemento: \n" + stack.peek();
        JOptionPane.showMessageDialog(null, relatorioFinal);

	}

}
