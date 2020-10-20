package ProjetoDeProgramacao2.upe.funcionamento.br;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Espere {

	//
	public void setIcon(JButton b , ImageIcon i) {
		TimerTask t1 = new TimerTask(){
			@Override
			public void run() {
				
			}						
		};
		
		TimerTask t2 = new TimerTask(){
			@Override
			public void run() {
				b.setIcon(i);
			}						
		};
		
		Timer timer = new Timer();
		
		timer.schedule(t1, 1);
		
		timer.schedule(t2, 1000);

	}

}
