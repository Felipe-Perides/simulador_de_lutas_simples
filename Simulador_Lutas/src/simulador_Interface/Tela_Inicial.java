package simulador_Interface;

import java.awt.BorderLayout;
import simulador_Interface.Criacao_Personagem;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Inicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Inicial frame = new Tela_Inicial();
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
	public Tela_Inicial() {
		initComponents();
	}
	
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel simulador = new JLabel("SIMULADOR");
		simulador.setBounds(223, 39, 80, 29);
		contentPane.add(simulador);
		
		JLabel de = new JLabel("  DE");
		de.setBounds(240, 64, 26, 14);
		contentPane.add(de);
		
		JLabel batalha = new JLabel("BATALHAS");
		batalha.setBounds(225, 80, 80, 23);
		contentPane.add(batalha);
		
		JButton comecar = new JButton("COMEÇAR");
		comecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Criacao_Personagem tela = new Criacao_Personagem();
				tela.setVisible(true);
			}
		});
		comecar.setBounds(200, 156, 111, 23);
		contentPane.add(comecar);
		
		JButton sair = new JButton("  SAIR");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sair.setBounds(200, 190, 111, 23);
		contentPane.add(sair);
	}
}
