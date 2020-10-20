package ProjetoDeProgramacao2.upe.funcionamento.br;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

import ProjetoProgramacao2.upe.botoes.br.JButton2;

public class TabuleiroFacil extends Tabuleiro{
	
	public TabuleiroFacil(){
		
		for (int i = 0; i < 12; i++) {
			buttons.add(new JButton2(i, versoDaCarta));
			buttons.get(i).addActionListener(this);
			
		}

		buttons.get(0).setBounds(10, 11, 89, 120);
		buttons.get(1).setBounds(10, 152, 89, 120);
		buttons.get(2).setBounds(10, 295, 89, 120);
		buttons.get(3).setBounds(109, 11, 89, 120);
		buttons.get(4).setBounds(109, 152, 89, 120);
		buttons.get(5).setBounds(109, 295, 89, 120);
		buttons.get(6).setBounds(208, 11, 89, 120);
		buttons.get(7).setBounds(208, 152, 89, 120);
		buttons.get(8).setBounds(208, 295, 89, 120);
		buttons.get(9).setBounds(307, 11, 89, 120);
		buttons.get(10).setBounds(307, 152, 89, 120);
		buttons.get(11).setBounds(307, 295, 89, 120);
	}
	
	@Override
	public ArrayList<ImageIcon> imagens() {

		// Imagens
		Imagem t = new Imagem(89, 120);
		
		versoDaCarta = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/carta.jpg");
		
		ImageIcon i1 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/all.png");
		ImageIcon i2 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/batman.jpg");
		ImageIcon i3 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/kenpachi.jpg");
		ImageIcon i4 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/kira.jpg");
		ImageIcon i5 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/rin.jpg");
		ImageIcon i6 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/snake.jpg");

		ArrayList<ImageIcon> i = new ArrayList<>();

		i.add(i1);
		i.add(i2);
		i.add(i3);
		i.add(i4);
		i.add(i5);
		i.add(i6);

		i.add(i1);
		i.add(i2);
		i.add(i3);
		i.add(i4);
		i.add(i5);
		i.add(i6);

		Collections.shuffle(i);

		return i;
	}
	
}
