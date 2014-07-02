package windows7;

public class AlterarSenhaControl {
	
	private UsuarioEntiny usuario;
	private AlterarSenhaBoundary frame;
	
	public AlterarSenhaControl(UsuarioEntiny usuario, AlterarSenhaBoundary frame) {
		this.usuario = usuario;
		this.frame = frame;
		
		frame.setVisible(true);
	}
	
	public void alterarSenha(String nomeUsuario, String senhaAntiga, String novaSenha, String confirmacaoSenha){
		
		System.out.println(nomeUsuario + ", " + senhaAntiga + ", " + novaSenha + ", " + confirmacaoSenha);
		
	}
	
}