package ProjetoDeProgramacao2.upe.funcionamento.br;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

import ProjetoProgramacao2.upe.botoes.br.JButton2;

public class TabuleiroDificil extends Tabuleiro{
	
	
	public TabuleiroDificil(){
		
		for (int i = 0; i < 30; i++) {
			buttons.add(new JButton2(i, versoDaCarta));
			buttons.get(i).addActionListener(this);
		}

		buttons.get(0).setBounds(0, 0, 60, 78);
		buttons.get(1).setBounds(0, 86, 60, 78);
		buttons.get(2).setBounds(0, 172, 60, 78);
		buttons.get(3).setBounds(0, 258, 60, 78);
		buttons.get(4).setBounds(0, 344, 60, 78);
	
		buttons.get(5).setBounds(70, 0, 60, 78);
		buttons.get(6).setBounds(70, 86, 60, 78);
		buttons.get(7).setBounds(70, 172, 60, 78);
		buttons.get(8).setBounds(70, 258, 60, 78);
		buttons.get(9).setBounds(70, 344, 60, 78);
	
		buttons.get(10).setBounds(140, 0, 60, 78);
		buttons.get(11).setBounds(140, 86, 60, 78);
		buttons.get(12).setBounds(140, 172, 60, 78);
		buttons.get(13).setBounds(140, 258, 60, 78);
		buttons.get(14).setBounds(140, 344, 60, 78);
	
		buttons.get(15).setBounds(210, 0, 60, 78);
		buttons.get(16).setBounds(210, 86, 60, 78);
		buttons.get(17).setBounds(210, 172, 60, 78);
		buttons.get(18).setBounds(210, 258, 60, 78);
		buttons.get(19).setBounds(210, 344, 60, 78);
	
		buttons.get(20).setBounds(280, 0, 60, 78);
		buttons.get(21).setBounds(280, 86, 60, 78);
		buttons.get(22).setBounds(280, 172, 60, 78);
		buttons.get(23).setBounds(280, 258, 60, 78);
		buttons.get(24).setBounds(280, 344, 60, 78);
	
		buttons.get(25).setBounds(350, 0, 60, 78);
		buttons.get(26).setBounds(350, 86, 60, 78);
		buttons.get(27).setBounds(350, 172, 60, 78);
		buttons.get(28).setBounds(350, 258, 60, 78);
		buttons.get(29).setBounds(350, 344, 60, 78);
	}
	
	@Override
	public ArrayList<ImageIcon> imagens() {
		
		Imagem t = new Imagem(60, 78);
		
		versoDaCarta = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/carta.jpg");
		
		// Imagens
		ImageIcon i1 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/all.png");
		ImageIcon i2 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/batman.jpg");
		ImageIcon i3 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/bleach.jpg");
		ImageIcon i4 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/cdz.jpg");
		ImageIcon i5 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/deathNote.jpg");
		ImageIcon i6 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/hollow.jpg");
		ImageIcon i7 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/kenpachi.jpg");
		ImageIcon i8 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/kira.jpg");
		ImageIcon i9 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/lordVader.jpg");
		ImageIcon i10 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/nanatsuNoTaizai.jpg");
		ImageIcon i11 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/rin.jpg");
		ImageIcon i12 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/snake.jpg");
		ImageIcon i13 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/swordArtOnline.jpg");
		ImageIcon i14 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/titan.jpg");
		ImageIcon i15 = t.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/yuyuhakusho.jpg");
		
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
		i.add(i11);
		i.add(i12);
		i.add(i13);
		i.add(i14);
		i.add(i15);
		
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
		i.add(i11);
		i.add(i12);
		i.add(i13);
		i.add(i14);
		i.add(i15);

		Collections.shuffle(i);

		return i;
	}
}
