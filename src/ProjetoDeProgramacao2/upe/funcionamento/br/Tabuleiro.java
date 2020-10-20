package ProjetoDeProgramacao2.upe.funcionamento.br;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import ProjetoProgramacao2.upe.botoes.br.JButton2;
import ProjetoProgramacao2.upe.telas.br.TelaDasCartas;

public abstract class Tabuleiro implements ActionListener {

	protected ArrayList<JButton2> buttons = new ArrayList<>();
	protected ImageIcon versoDaCarta;
	private ArrayList<ImageIcon> imageIcons = imagens();
	
	
	// Metodo que é sobreescrito pelas classes filhas
	//e que serve para criar e embaralhar as imagens
	public abstract ArrayList<ImageIcon> imagens();
	
	
	
	//metodo para sabe se a vitoria
	public void testaVitoria(ArrayList<JButton2> buttons){
		int cartas_desviradas = 0; 
		
		for (JButton2 jButton2 : buttons) {
			if(jButton2.isClicado() == true){
				cartas_desviradas++;
			}
		}
		
		if(cartas_desviradas == buttons.size()){
			JOptionPane.showMessageDialog(null,"Vitoria "+TelaDasCartas.getLblContadorJogadas().getText()+" jogadas");
		}
		
	}
	
	
	
	//Botoes sevem para fazer a comparacao
	private JButton2 aux1 = null;
	private JButton2 aux2 = null;
	int contador = 0;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for (int j = 0; j < buttons.size(); j++) {
			//pega o botao que gerou o envento porem so ira funciona se o botão não tiver sido clicado antes
			if (e.getSource() == buttons.get(j) && buttons.get(j).isClicado() == false) {
				
				//conta mais um no contador la em TelaDasCartas
				int a = Integer.parseInt(TelaDasCartas.getLblContadorJogadas().getText());
				TelaDasCartas.getLblContadorJogadas().setText((a+1)+"");
				
				//muda a imagem do button
				buttons.get(j).setIcon(imageIcons.get(j));
				
				
				if(contador == 0){
					aux1 = buttons.get(j);
					buttons.get(j).setClicado(true);
					contador++;
				}else if(contador == 1){
					aux2 = buttons.get(j);
					buttons.get(j).setClicado(true);
					contador++;
				}
			}
		}
		
		//caso o contador seja igual a 2 quer dizer que existe dois botoes que devem se comparados 
		if(contador == 2){
			
			contador = 0;
			boolean iguais = JButton2.equals(aux1, aux2);
			
			if(iguais == false){
				int id1 = aux1.getId();
				int id2 = aux2.getId();
				
				//muda o icon do button mas espera um tempo
				new Espere().setIcon(buttons.get(id2),versoDaCarta);
				buttons.get(id2).setClicado(false);
				
				new Espere().setIcon(buttons.get(id1),versoDaCarta);
				buttons.get(id1).setClicado(false);	
			}
			aux1 = null;
			aux2 = null;
		}
		testaVitoria(buttons);
		
	}

	//Getters e Setters
	public ArrayList<JButton2> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<JButton2> buttons) {
		this.buttons = buttons;
	}
	
	public ImageIcon getVersoDaCarta(){
		return versoDaCarta;
	}
	
}
