package ProjetoProgramacao2.upe.telas.br;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ProjetoDeProgramacao2.upe.funcionamento.br.Imagem;
import ProjetoDeProgramacao2.upe.funcionamento.br.Tabuleiro;
import ProjetoDeProgramacao2.upe.funcionamento.br.TabuleiroDificil;
import ProjetoDeProgramacao2.upe.funcionamento.br.TabuleiroFacil;
import ProjetoDeProgramacao2.upe.funcionamento.br.TabuleiroMedio;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDasCartas extends JFrame implements ActionListener{

	private JPanel contentPane;
	private String nome;
	private Tabuleiro tabuleiro;
	private JButton voltar;
	private JButton reiniciar;
	
	private static JLabel lblContadorJogadas;
	//Constructor
	public TelaDasCartas(String nome, Tabuleiro tabuleiro) {
		this.nome = nome;
		this.tabuleiro = tabuleiro;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 532);
		setTitle("Jogo da Memória");
		setResizable(false);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Panel dos botoes
		JPanel panelButton = new JPanel();
		panelButton.setBounds(10, 45, 409, 427);
		contentPane.add(panelButton);
		panelButton.setLayout(null);
		
		//Adiciona os botoes dependendo do dimensao do
		//tabuleiro escolhido
		for (int i = 0; i < tabuleiro.getButtons().size(); i++) {
			panelButton.add(tabuleiro.getButtons().get(i));
		}
		
		// Panel dos textos
		JPanel panelText = new JPanel();
		panelText.setBounds(10, 11, 409, 35);
		contentPane.add(panelText);
		panelText.setLayout(null);

		JLabel nomeDoJogador = new JLabel(nome);
		nomeDoJogador.setBounds(111, 0, 143, 35);
		panelText.add(nomeDoJogador);

		lblContadorJogadas = new JLabel("0");
		lblContadorJogadas.setBounds(370, 0, 29, 35);
		panelText.add(lblContadorJogadas);

		JLabel lblJogadas = new JLabel("N\u00BA Jogadas:");
		lblJogadas.setBounds(264, 0, 67, 35);
		panelText.add(lblJogadas);
		
		voltar = new JButton("");
		Imagem i = new Imagem(42, 35);
		voltar.setIcon(i.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/voltar.png"));
		voltar.setBounds(10, 0, 42, 35);
		voltar.addActionListener(this);
		panelText.add(voltar);
		
		reiniciar = new JButton("");
		reiniciar.setIcon(i.tamanhoDaImagem("/ProjetoDeProgramacao2/upe/imagens/br/reiniciar.png"));
		reiniciar.setBounds(62, 0, 42, 35);
		reiniciar.addActionListener(this);
		panelText.add(reiniciar);
	}
	
	public static JLabel getLblContadorJogadas() {
		return lblContadorJogadas;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == voltar){
			TelaMenu novoMenu = new TelaMenu();
			novoMenu.setVisible(true);
			dispose();//Fecha a tela atual e inicia o menu novamente	
		}else if(e.getSource() == reiniciar){
			dispose();
			int tamanho = tabuleiro.getButtons().size();
			Tabuleiro novoTabuleiro = null;
			if(tamanho == 12){
				novoTabuleiro = new TabuleiroFacil();
			}else if(tamanho == 20){
				novoTabuleiro = new TabuleiroMedio();
			}else if(tamanho == 30){
				novoTabuleiro = new TabuleiroDificil();
			}
			
			new TelaDasCartas(nome, novoTabuleiro).setVisible(true);
			
		}
		
	}
	
}
