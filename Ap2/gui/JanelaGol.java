package gui;

import javax.swing.JFrame;

import interface_grafica.Painel;
import teste01_para_prova02.PainelGol;

public class JanelaGol extends JFrame {
	
	public JanelaGol() {
		this.setSize(1030,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		criarPainelGol();
		this.setVisible(true);
	}
	
	public void criarPainelGol() {
		
		PainelGol painel = new PainelGol();
		this.add(painel);
	}
	
	
}
