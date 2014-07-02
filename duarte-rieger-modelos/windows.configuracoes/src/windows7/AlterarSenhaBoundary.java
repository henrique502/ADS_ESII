package windows7;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AlterarSenhaBoundary extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField senhaAntiga;
	private JTextField novaSenha;
	private JTextField confirmacaoSenha;
	private JTextField nomeUsuario;
	private AlterarSenhaControl control;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioEntiny usuario = new UsuarioEntiny("180901954","perfil.jpg");
					AlterarSenhaBoundary frame = new AlterarSenhaBoundary(usuario.getNome(), usuario.getImagem());
					AlterarSenhaControl control = new AlterarSenhaControl(usuario, frame);
					frame.setControl(control);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void setControl(AlterarSenhaControl control) {
		this.control = control;
	}

	/**
	 * Create the frame.
	 * @param imagem 
	 * @param nome 
	 */
	public AlterarSenhaBoundary(String nome, String imagem) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomeUsuario = new JTextField();
		nomeUsuario.setBounds(131, 104, 181, 20);
		nomeUsuario.setText(nome);
		contentPane.add(nomeUsuario);
		nomeUsuario.setColumns(10);
		
		senhaAntiga = new JTextField();
		senhaAntiga.setBounds(131, 135, 181, 20);
		contentPane.add(senhaAntiga);
		senhaAntiga.setColumns(10);
		
		novaSenha = new JTextField();
		novaSenha.setBounds(131, 166, 181, 20);
		contentPane.add(novaSenha);
		novaSenha.setColumns(10);
		
		confirmacaoSenha = new JTextField();
		confirmacaoSenha.setBounds(131, 197, 181, 20);
		contentPane.add(confirmacaoSenha);
		confirmacaoSenha.setColumns(10);
		
		JButton buttonVoltar = new JButton("Voltar");
		buttonVoltar.setBounds(128, 228, 184, 23);
		contentPane.add(buttonVoltar);
		
		JButton buttonSubmit = new JButton(">");
		buttonSubmit.setBounds(322, 196, 41, 23);
		buttonSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				control.alterarSenha(nomeUsuario.getText(), senhaAntiga.getText(), novaSenha.getText(), confirmacaoSenha.getText());
			}
		});
		contentPane.add(buttonSubmit);
		
		JLabel usuarioImagem = new JLabel(imagem);
		usuarioImagem.setBackground(Color.WHITE);
		usuarioImagem.setHorizontalAlignment(SwingConstants.CENTER);
		usuarioImagem.setBounds(131, 11, 181, 82);
		contentPane.add(usuarioImagem);
	}
}
