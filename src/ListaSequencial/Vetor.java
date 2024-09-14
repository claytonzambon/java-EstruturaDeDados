package ListaSequencial;

import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[10];
	private int totalAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		this.alunos[totalAlunos] = aluno;
		totalAlunos++;
//		for (int i = 0; i < alunos.length; i++) {
//			if (alunos[i] == null) {
//				alunos[i] = aluno;
//				break;
//			}
//		}
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalAlunos;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i = totalAlunos - 1; i >= posicao; i -= 1) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalAlunos++;
	}
	
	public void remove(int posicao) {
		//remove pela posicao
		for (int i = posicao; i < this.totalAlunos; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		totalAlunos--;
	}
	
	public Aluno contem(int posicao) {
		//descobre se o aluno está ou não na lista
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicão inválida");
		}
		return alunos[posicao];
//		for (int i = 0; i < totalAlunos; i++) {
//			if (aluno.equals(alunos[i])) {
//				return true;
//			}
//		}
//		return false;
	}
	
	public Aluno pega(int posicao) {
		return alunos[posicao];
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalAlunos;
	}
	
	public int tamanho() {
		//devolve a quantidade de alunos
		return totalAlunos;
	}
	
	private void garanteEspaco() {
		if (totalAlunos == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length*2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	
	public String toString() {
		//facilitará a impressão
		return Arrays.toString(alunos);
	}
}
