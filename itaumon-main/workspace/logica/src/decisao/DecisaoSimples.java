package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		// So avalia o True
		String nome = JOptionPane.showInputDialog("Nome do Aluno: ");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2: "));
		float media = (nota1 + nota2) / 2;
		System.out.println("Aluno: " + nome + " sua media foi " + media);
		if (media>=6) {
			System.out.println("Parabens " + nome + " voce esta aprovado");
		}
		if (media<4) {
			System.out.println("Infelizmente " + nome + " voce foi reprovado");
		}
		// and = &&
		// or => ||
		// se a media estiver entre 5.9 e 4 tem que mostrar:
		// "xxx voce ainda tem chance no exame"
		if (media<6 && media>=4) {
			System.out.println(nome + " voce ainda tem chance no exame.");
		}
	}

}
