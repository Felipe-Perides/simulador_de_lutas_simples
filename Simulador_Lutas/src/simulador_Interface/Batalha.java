package simulador_Interface;

import java.awt.EventQueue;
import java.util.Random;
import simulador_Interface.Criacao_Personagem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class Batalha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Criacao_Personagem person;
	private int roundLucky, playerLucky;
	private int attk1S,attk2S,def1S,def2S,vida1S,vida2S;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Criacao_Personagem criacaoPersonagem = new Criacao_Personagem();
					criacaoPersonagem.setVisible(true);
					Batalha frame = new Batalha(criacaoPersonagem);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Batalha(Criacao_Personagem person) {
		this.person=person;
		initComponents();
	}
	
	public void initComponents() {
		Random rand = new Random();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jogador1 = new JLabel("JOGADOR 1");
		jogador1.setBounds(24, 53, 74, 27);
		contentPane.add(jogador1);
		
		JLabel jogador2 = new JLabel("JOGADOR 2");
		jogador2.setBounds(408, 53, 74, 27);
		contentPane.add(jogador2);
		
		JLabel batalha = new JLabel("BATALHA");
		batalha.setBounds(226, 11, 74, 20);
		contentPane.add(batalha);
		
		JLabel ataque1 = new JLabel("ATAQUE");
		ataque1.setBounds(24, 91, 74, 20);
		contentPane.add(ataque1);
		
		JLabel defesa1 = new JLabel("DEFESA");
		defesa1.setBounds(24, 164, 62, 20);
		contentPane.add(defesa1);
		
		JLabel ataque2 = new JLabel("ATAQUE");
		ataque2.setBounds(408, 91, 74, 20);
		contentPane.add(ataque2);
		
		JLabel defesa2 = new JLabel("DEFESA");
		defesa2.setBounds(408, 164, 62, 20);
		contentPane.add(defesa2);
		
		JButton comecar = new JButton("COMEÇAR");
		comecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comecar.setVisible(false);
				initBatalha();
			}
		});
		comecar.setBounds(199, 245, 112, 23);
		contentPane.add(comecar);
		
		attk1S=person.getAttk1();attk2S=person.getAttk2();def1S=person.getDef1();def2S=person.getDef2();vida1S=person.getVida1();vida2S=person.getVida2();
		
		JLabel atq1 = new JLabel(String.valueOf(attk1S));
		atq1.setBounds(24, 112, 46, 14);
		contentPane.add(atq1);
		
		JLabel def1 = new JLabel(String.valueOf(def1S));
		def1.setBounds(24, 185, 46, 14);
		contentPane.add(def1);
		
		JLabel def2 = new JLabel(String.valueOf(def2S));
		def2.setBounds(408, 185, 46, 14);
		contentPane.add(def2);
		
		JLabel atq2 = new JLabel(String.valueOf(attk2S));
		atq2.setBounds(408, 112, 46, 14);
		contentPane.add(atq2);
		
		textField = new JTextField(" ");
		textField.setBounds(127, 91, 271, 83);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		
		//Dado + moeda
		playerLucky = rand.nextInt(2)+1;
		roundLucky = rand.nextInt(6)+1;
	}
	
	public void initBatalha() {
		attk1S=person.getAttk1();attk2S=person.getAttk2();def1S=person.getDef1();def2S=person.getDef2();vida1S=person.getVida1();vida2S=person.getVida2();
		int ataq1 = attk1S, ataq2 = attk2S, defe1 = def1S, defe2 = def2S, resto;
		// i == round
		while(vida1S>0 && vida2S>0) {
			for(int i = 0; i<20; i++) {
				System.out.println("Rodada " + i + ": Vida Jogador 1 = " + vida1S + ", Vida Jogador 2 = " + vida2S);
				if(i%2==0) { // vez do Jogador 2
					if(ataq2<defe1) {
						defe1-=ataq2;
					}else {
						resto = ataq2-defe1;
						vida1S -= resto;
					}
				}else {  // vez do Jogador 1
					if(ataq1<defe2) { 
						defe2-=ataq1;
					}else {
						resto = ataq1-defe2;
						vida2S -= resto;
					}
				}
			}
		}
		if(vida1S<=0) {
			textField.setText("Parabéns Jogador 2! Você venceu!");
			textField.setVisible(true);
		}else if(vida2S<=0) {
			textField.setText("Parabéns Jogador 1! Você venceu!");
			textField.setVisible(true);
		}
	}
}
