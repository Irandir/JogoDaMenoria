package ProjetoProgramacao2.upe.botoes.br;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JButton2 extends JButton{
	private int id;
	private boolean clicado = false;
	
	//Constructor
	public JButton2(int id,ImageIcon imageIcon) {
		super.setIcon(imageIcon);
		this.id = id;
	}
	
	
	public static boolean equals(JButton2 e,JButton2 e2){
		ImageIcon imageIcon = (ImageIcon)e.getIcon();
		ImageIcon imageIcon2 =(ImageIcon)e2.getIcon();
		
		if(e.getId() != e2.getId() && imageIcon.getImage().equals(imageIcon2.getImage())){
			return true;
		}
		return false;
	}
	
	
	//Getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isClicado() {
		return clicado;
	}
	public void setClicado(boolean clicado) {
		this.clicado = clicado;
	}
	
}
