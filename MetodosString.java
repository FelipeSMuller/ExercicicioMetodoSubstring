package exerciciosLivro;

import javax.swing.JOptionPane;

public class MetodosString {

	public static void main(String[] args) throws Exception {

		/*
		 * Escreva um programa que solicite ao usuário uma string e um número inteiro N
		 * e, em seguida, exiba os primeiros N caracteres da string
		 */

		String resposta;

		String fraseSubstring;

		String frase = null;

		int indiceInicial = 0, indiceFinal = 0;

		do {

			try {

				frase = JOptionPane.showInputDialog(null, "Insira uma frase : ");

				indiceInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o índice inicial "));

				resposta = JOptionPane.showInputDialog(null, "Deseja inserir outro índice?");

				if (resposta.equalsIgnoreCase("sim")) {

					indiceFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o índice final"));

					fraseSubstring = frase.substring(indiceInicial, indiceFinal);

					JOptionPane.showMessageDialog(null, "Método Substring utilizado = " + fraseSubstring);

				}

				else {

					fraseSubstring = frase.substring(indiceInicial);

					JOptionPane.showMessageDialog(null, "Método Substring utilizado = " + fraseSubstring);

				}

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Você fechou o programa incorretamente" + JOptionPane.ERROR_MESSAGE);
			}

		} while (indiceInicial > 0 && frase != null && indiceFinal > 0);

	}

}
