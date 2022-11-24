package teste01_para_prova02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class PainelGol extends JPanel implements ActionListener {
	
	private ArrayList<Botao>botoes;
	
	
	Botao botao;
	public PainelGol() {
		this.setBackground(Color.RED);
		criarBotoes();
	}
		
	public void criarBotoes() {
		
		botoes=new ArrayList<Botao>();
		
		//Botao botao;
		this.setLayout(new GridLayout(9,17));
		
		for(int linha=0;linha<=8;linha++) {
			for(int coluna=0;coluna<=16;coluna++) {
				this.add(botao =new Botao(linha,coluna));
				botoes.add(botao);
				botao.addActionListener(this);
			}
		}
	}

	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Gol !!!!");
		Random aleatorio= new Random();
		for(Botao botao : botoes) {
			if((botao.getLinha()==aleatorio.nextInt(9)) && (botao.getColuna()==aleatorio.nextInt(17)))
				botao.setBackground(Color.BLUE);
		}
		//botao.setLinha(3).setColuna(2);
		//botao.criarGoleiro(aleatorio.nextInt(7),aleatorio.nextInt(8));
	}
		
}
	
	
	

