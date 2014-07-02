package windows7;

public class UsuarioEntiny {
	
	private String nome, senha, imagem;

	public UsuarioEntiny(String nome, String imagem) {
		this.nome = nome;
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
	
		this.senha = senha;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
	
}
