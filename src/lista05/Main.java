package lista05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		ControleRemoto controle = new ControleRemoto(1);
		
		
		while (true) {
			System.out.println("O que deseja fazer?");
			System.out.println("Aumentar volume:1\nDiminuir volume:2\nPr�ximo canal:3\n"
					+ "Canal anterior:4\nStatus do controle:5\n");
			int opcao=entrada.nextInt();
			
			if(opcao==1) {
				System.out.println("volume:"+controle.aumentarVolume());
			}
			
			if(opcao==2) {
				System.out.println("volume:"+controle.diminuirVolume());
			}
			
			if(opcao==3) {
				System.out.println("canal:"+controle.proximoCanal());
			}
			
			if(opcao==4) {
				System.out.println("canal:"+controle.canalAnterior());
			}
			
			if(opcao==5) {
				
			}
		
		}
	}

}
