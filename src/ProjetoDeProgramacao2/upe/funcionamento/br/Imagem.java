package ProjetoDeProgramacao2.upe.funcionamento.br;

import java.awt.Image;

import javax.swing.ImageIcon;

import ProjetoProgramacao2.upe.telas.br.TelaMenu;

public class Imagem extends ImageIcon{
	private int lagura;
	private int altura;
	public Imagem(int lagura, int altura){
		this.lagura = lagura;
		this.altura = altura;
	}
	
	// Redimensiona o tamanho da imagem
	public ImageIcon tamanhoDaImagem(String path) {
		ImageIcon i1 = new ImageIcon(TelaMenu.class.getResource(path));			
		Image nova_imagem = i1.getImage().getScaledInstance(lagura, altura, Image.SCALE_SMOOTH);
			return new ImageIcon(nova_imagem);
	}
}
