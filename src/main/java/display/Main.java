package display;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		String entrada = "";
		
		Scanner s = new Scanner(System.in);
		do{
			
			executaEntrada(entrada);
			
			
			entrada = s.nextLine();
			
		} while(!"sair".equals(entrada));
		
		
		s.close();
		
	}

	private static void executaEntrada(String entrada) {
		if("".equals(entrada) || entrada == null) {
			System.out.println("Display Executando...");
			System.out.println("Caso queira sair, digite 'sair'");
			System.out.println("Ou digite um número para ser mostrado no display");
			System.out.println();
		}
		else
			new Display( entrada).imprime();
	}
	
}
