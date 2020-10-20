package ProjetoProgramacao2.upe.telas.br;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import ProjetoDeProgramacao2.upe.funcionamento.br.Tabuleiro;
import ProjetoDeProgramacao2.upe.funcionamento.br.TabuleiroDificil;
import ProjetoDeProgramacao2.upe.funcionamento.br.TabuleiroFacil;
import ProjetoDeProgramacao2.upe.funcionamento.br.TabuleiroMedio;

public class TelaMenu extends JFrame implements ActionListener, ItemListener{

	private JPanel contentPane;
	private JTextField nomeCampo;
	
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JRadioButton radioButton3;
	private Tabuleiro tabuleiro;
	

	//Constructor and Create the frame
	public TelaMenu(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 300);
		setTitle("Jogo da Memória");
		setResizable(false);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Cria um Panel
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 309, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Cria os dois Labels da tela inicial
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(10, 35, 46, 14);
		panel.add(nome);
		
		JLabel tamanhoMatriz = new JLabel("Tamanho da Matriz:");
		tamanhoMatriz.setBounds(10, 70, 115, 14);
		panel.add(tamanhoMatriz);
		
		//Cria um campo de texto
		nomeCampo = new JTextField();
		nomeCampo.setBounds(66, 32, 233, 20);
		panel.add(nomeCampo);
		nomeCampo.setColumns(10);
		
		//Escolhe as dimensÃµes da matriz
		radioButton1 = new JRadioButton("F\u00E1cil   =  3 x 4");
		radioButton1.setBounds(6, 90, 100, 23);
		radioButton1.addItemListener(this);
		panel.add(radioButton1);
		
		radioButton2 = new JRadioButton("M\u00E9dio = 4 x 5");
		radioButton2.setBounds(6, 110, 100, 23);
		radioButton2.addItemListener(this);
		panel.add(radioButton2);
		
		radioButton3 = new JRadioButton("Dif\u00EDcil  = 5 x 6");
		radioButton3.setBounds(6, 130, 100, 23);
		radioButton3.addItemListener(this);
		panel.add(radioButton3);

		//Cria Grupo de JRadioButtons
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(radioButton1);
		grupo.add(radioButton2);
		grupo.add(radioButton3);
		
		//Cria o botao Start
		JButton botaoStart = new JButton("Start");
		botaoStart.setFont(new Font("Times New Roman", Font.BOLD, 35));
		botaoStart.setBounds(10, 170, 289, 52);
		botaoStart.addActionListener(this);
		panel.add(botaoStart);	
		
	}
	
	//Trata o evento do botao Start
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try{
			if(nomeCampo.getText().equals("")){
				nomeCampo.setText("sem nome");
			}
		
			TelaDasCartas tela2 = new TelaDasCartas("Jogador: " + nomeCampo.getText(), tabuleiro);
			tela2.setVisible(true);
			dispose();//Fecha a Tela1 e inicia a Tela2
		}
		
		catch(NullPointerException erro){
			JOptionPane.showMessageDialog(null, "Erro!!!\nEscolha um tamanho de matriz para poder jogar.");
		}
		
	}

	//Trata os eventos dos JRadioButtons
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if(radioButton1.isSelected()){
			tabuleiro = new TabuleiroFacil();
		}else if(radioButton2.isSelected()){
			tabuleiro = new TabuleiroMedio();
		}else if(radioButton3.isSelected()){
			tabuleiro = new TabuleiroDificil();
		}
	}
	
}
