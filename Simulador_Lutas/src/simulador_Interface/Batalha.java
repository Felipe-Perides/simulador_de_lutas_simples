package simulador_Interface;

import java.awt.EventQueue;
import simulador_Interface.Criacao_Personagem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Batalha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Criacao_Personagem person;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Batalha frame = new Batalha();
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
	public Batalha() {
		initComponents();
	}
	
	public void initComponents() {
		person = new Criacao_Personagem();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jogador1 = new JLabel("JOGADOR 1");
		jogador1.setBounds(40, 53, 74, 27);
		contentPane.add(jogador1);
		
		JLabel jogador2 = new JLabel("JOGADOR 2");
		jogador2.setBounds(422, 53, 74, 27);
		contentPane.add(jogador2);
		
		JLabel batalha = new JLabel("BATALHA");
		batalha.setBounds(210, 11, 74, 20);
		contentPane.add(batalha);
		
		JLabel ataque1 = new JLabel("ATAQUE");
		ataque1.setBounds(24, 91, 62, 20);
		contentPane.add(ataque1);
		
		JLabel defesa1 = new JLabel("DEFESA");
		defesa1.setBounds(24, 164, 62, 20);
		contentPane.add(defesa1);
		
		JLabel ataque2 = new JLabel("ATAQUE");
		ataque2.setBounds(408, 91, 62, 20);
		contentPane.add(ataque2);
		
		JLabel defesa2 = new JLabel("DEFESA");
		defesa2.setBounds(408, 164, 62, 20);
		contentPane.add(defesa2);
		
		JButton comecar = new JButton("COMEÇAR");
		comecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comecar.setVisible(false);
			}
		});
		comecar.setBounds(199, 245, 105, 23);
		contentPane.add(comecar);
		
		JLabel atq1 = new JLabel();
		atq1.setBounds(24, 112, 46, 14);
		contentPane.add(atq1);
		
		JLabel def1 = new JLabel();
		def1.setBounds(24, 185, 46, 14);
		contentPane.add(def1);
		
		JLabel def2 = new JLabel();
		def2.setBounds(408, 185, 46, 14);
		contentPane.add(def2);
		
		JLabel atq2 = new JLabel();
		atq2.setBounds(408, 112, 46, 14);
		contentPane.add(atq2);
	}
}
