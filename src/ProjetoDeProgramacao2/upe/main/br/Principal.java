package ProjetoDeProgramacao2.upe.main.br;

import ProjetoProgramacao2.upe.telas.br.TelaMenu;

public class Principal {

	public static void main(String[] args) {
		try {
			TelaMenu frame = new TelaMenu();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
