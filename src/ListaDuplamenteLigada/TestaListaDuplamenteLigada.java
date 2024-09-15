package ListaDuplamenteLigada;

import javax.swing.JOptionPane;

public class TestaListaDuplamenteLigada {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		
		String relatorioFinal = "### Lista Duplamente Ligada ###";
		relatorioFinal += "\nExibe a Lista criada: \n" + lista.toString();
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
		relatorioFinal += "\nExibe elemento da posição 3: \n" + lista.pega(2);
		relatorioFinal += "\nTamanho da lista: " + lista.tamanho();
		lista.removeDoFim();
		relatorioFinal += "\nRemovido elemento do Fim: \n" + lista.toString();
		relatorioFinal += "\nTamanho da lista: " + lista.tamanho();
		lista.remove(1);
		relatorioFinal += "\nRemovido elemento da posição 2: \n" + lista.toString();
		relatorioFinal += "\nLista contém Terra? " + lista.contem("Terra");
		relatorioFinal += "\nLista contém Plutão? " + lista.contem("Plutão");
		JOptionPane.showMessageDialog(null, relatorioFinal);
	}

}
