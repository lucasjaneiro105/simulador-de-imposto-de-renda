package projetos_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class imposto_renda {

	public static void main(String[] args) {
		// variáveis
		double imposto, rendaUsuario;
		
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		// entrada
		System.out.println("Simulador de Imposto de Renda ");
		System.out.print("Qual o valor da sua renda anual: R$");
		rendaUsuario = teclado.nextDouble();
		
		// processamento
		if(rendaUsuario <= 1903.98) {
			imposto = 0;
		} else if (rendaUsuario <= 2826.65) {
			imposto = (rendaUsuario - 1903.98) * 0.075 - 142.80;
		} else if (rendaUsuario <= 3751.05) {
			imposto = (rendaUsuario - 2826.65) * 0.15 - 354.80;
		} else if (rendaUsuario <= 4664.68) {
			imposto = (rendaUsuario - 3751.05) * 0.225 - 636.13;
		} else {
			imposto = (rendaUsuario - 4664.68) * 0.275 - 869.36;
		}
		
		// saída
		System.out.println("Imposto: R$" + formatador.format(imposto));
		
		teclado.close();
	}

}
