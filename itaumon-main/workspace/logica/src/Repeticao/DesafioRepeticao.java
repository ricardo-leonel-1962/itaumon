package Repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {

	public static void main(String[] args) {
		/*
		 * Jogador 1 digita 1 numero
		 * Jogador 2 tenta descobrir o numero
		 * Parabens quando descobrir
		 * Atualizacoes:
		 * - Jogador2 recebe dica para descobrir o numero
		 * - ao fim exibir a qtde de tentativas
		 */
		int qt = 0;    
		int fim = 1;
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Numero secreto: "));
		int valor2 = 0;
		do {
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Descubra o numero: "));
			if (valor2>valor1) {
				System.out.println("Digite numero menor");
			}else if (valor2<valor1) {
				System.out.println("Digite numero maior");
			}
			qt = qt+1;
			// qt++
			// 
		}while(valor1!=valor2);
		System.out.println("Acertou...Qtde de tentativas: " + qt);
		
	}
}