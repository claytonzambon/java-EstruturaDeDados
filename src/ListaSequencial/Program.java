package ListaSequencial;

import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("José");
		Aluno a3 = new Aluno("Daniel");
		
		Vetor lista = new Vetor();
		String resultadoFinal;
		
		resultadoFinal = "Tamanho Inicial da Lista: " + Integer.toString(lista.tamanho());
		lista.adiciona(a1);
		resultadoFinal += "\nTamanho após adicionar um elemento: " + Integer.toString(lista.tamanho());
		lista.adiciona(a2);
		resultadoFinal += "\nTamanho após adicionar outro elemento: " + Integer.toString(lista.tamanho());
		lista.adiciona(1, a3);

		resultadoFinal += "\nElementos da Lista: \n" + lista;
		
		resultadoFinal += "\nVerifica se a lista contém o elemento na posição ZERO: " + lista.contem(0);
				
		Aluno x = lista.pega(1);
		resultadoFinal += "\nBusca o elemento da posição UM da lista: " + x;
		
		lista.remove(1);
		resultadoFinal += "\nExibe a lista após remover o elemento UM: \n" + lista;
		JOptionPane.showMessageDialog(null, resultadoFinal);
		
		for (int i = 0; i < 10; i++) {
			Aluno y = new Aluno("Teste" + i);
			lista.adiciona(y);
		}
		
		JOptionPane.showMessageDialog(null, "Lista após adicionar novos elementos: \n" + lista);
	}
}
