package ProjetoDeProgramacao2.upe.funcionamento.br;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

import ProjetoProgramacao2.upe.botoes.br.JButton2;

public class TabuleiroMedio extends Tabuleiro{

	public TabuleiroMedio(){
		
		for (int i = 0; i < 20; i++) {
			buttons.add(new JButton2(i, versoDaCarta));
			buttons.get(i).addActionListener(this);
			
		}

		buttons.get(0).setBounds(0, 0, 72, 95);
		buttons.get(1).setBounds(0, 106, 72, 95);
		buttons.get(2).setBounds(0, 212, 72, 95);
		buttons.get(3).setBounds(0, 318, 72, 95);
		
		buttons.get(4).setBounds(83, 0, 72, 95);
		buttons.get(5).setBounds(83, 106, 72, 95);
		buttons.get(6).setBounds(83, 212, 72, 95);
		buttons.get(7).setBounds(83, 318, 72, 95);
		
		buttons.get(8).setBounds(166, 0, 72, 95);
		buttons.get(9).setBounds(166, 106, 72, 95);
		buttons.get(10).setBounds(166, 212, 72, 95);
		buttons.get(11).setBounds(166, 318, 72, 95);
		
		buttons.get(12).setBounds(249, 0, 72, 95);
		buttons.get(13).setBounds(249, 106, 72, 95);
		buttons.get(14).setBounds(249, 212, 72, 95);
		buttons.get(15).setBounds(249, 318, 72, 95);
		
		buttons.get(16).setBounds(332, 0, 72, 95);
		buttons.get(17).setBounds(332, 106, 72, 95);
		buttons.get(18).setBounds(332, 212, 72, 95);
		buttons.get(19).setBounds(332, 318, 72, 95);
	}
	
	@Override
	public ArrayList<ImageIcon> imagens() {
		Imagem t = new Imagem(72, 95);
		
		versoDaCarta = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/carta.jpg");
		
		// Imagens
		ImageIcon i1 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/all.png");
		ImageIcon i2 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/batman.jpg");
		ImageIcon i3 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/bleach.jpg");
		ImageIcon i4 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/cdz.jpg");
		ImageIcon i5 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/deathNote.jpg");
		ImageIcon i6 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/kenpachi.jpg");
		ImageIcon i7 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/kira.jpg");
		ImageIcon i8 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/rin.jpg");
		ImageIcon i9 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/snake.jpg");
		ImageIcon i10 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/yuyuhakusho.jpg");
		
		ArrayList<ImageIcon> i = new ArrayList<>();

		i.add(i1);
		i.add(i2);
		i.add(i3);
		i.add(i4);
		i.add(i5);
		i.add(i6);
		i.add(i7);
		i.add(i8);
		i.add(i9);
		i.add(i10);
		
		i.add(i1);
		i.add(i2);
		i.add(i3);
		i.add(i4);
		i.add(i5);
		i.add(i6);
		i.add(i7);
		i.add(i8);
		i.add(i9);
		i.add(i10);

		Collections.shuffle(i);

		return i;
	}
}
