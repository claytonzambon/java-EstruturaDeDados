package ListaLigada;

import javax.swing.JOptionPane;

public class TestaListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		String relatorioFinal = "### Lista Ligada ###";
		relatorioFinal += "\nLista Ligada criada: \n" + lista.toString();
		lista.adicionaNoComeco("Jupiter");
		relatorioFinal += "\nAdicionado um Elemento: \n" + lista.toString();
		lista.adicionaNoComeco("Marte");
		relatorioFinal += "\nAdicionado outro Elemento: \n" + lista.toString();
		lista.adicionaNoComeco("Terra");
		relatorioFinal += "\nAdicionado outro Elemento: \n" + lista.toString();
		lista.adiciona("Netuno");
		relatorioFinal += "\nAdicionado outro Elemento: \n" + lista.toString();
		lista.adiciona(2, "Venus");
		relatorioFinal += "\nAdicionado elemento na posição 3: \n" + lista.toString();
		relatorioFinal += "\nBuscando elemento da posição 3: \n" + lista.pega(2);
		relatorioFinal += "\nTamanho da lista: \n" + lista.tamanho();
		lista.removeDoComeco();
		relatorioFinal += "\nExibir lista após remover elemento do começo: \n" + lista.toString();
		relatorioFinal += "\nTamanho da lista: \n" + lista.tamanho();
		JOptionPane.showMessageDialog(null, relatorioFinal);

	}

}
