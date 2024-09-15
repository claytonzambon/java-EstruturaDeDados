package fila;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class TesteFila {

	public static void main(String[] args) {
        Fila fila = new Fila();

        String relatorioFinal = "### Fila Criada manualmente ###\n\n";
        fila.adiciona("Socrates");
        relatorioFinal += "Após inserir primeiro elemento: \n" + fila.toString();
        fila.adiciona("Platão");
        relatorioFinal += "\nApós inserir outro elemento: \n" + fila.toString();
        fila.remove();
        relatorioFinal += "\nApós remover um elemento: \n" + fila.toString();

        Queue<String> filaDoJava = new LinkedList<String>();
        relatorioFinal += "\n\n### Fila Utilizando Queue do Java ###";
        filaDoJava.add("Rigel");
        relatorioFinal += "\nApós inserir primeiro elemento com Queue: \n" + filaDoJava;
        filaDoJava.add("Pollux");
        relatorioFinal += "\nApós inserir outro elemento com Queue: \n" + filaDoJava;
        filaDoJava.poll();
        relatorioFinal += "\nApós remover elemento com Queue: \n" + filaDoJava;
        JOptionPane.showMessageDialog(null, relatorioFinal, "Fila", 0);

	}

}
