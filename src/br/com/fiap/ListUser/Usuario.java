package br.com.fiap.ListUser;

public class Usuario implements Comparable<Usuario> {
	protected int IdUser;
	protected String nome, senha;
	
	public int getIdUser() {
		return IdUser;
	}
	public void setIdUser(int idUser) {
		IdUser = idUser;
	}

	protected int contador=0;

	public Usuario(String nome, String senha, int id) {
		this.nome = nome;
		this.senha=senha;
		this.IdUser=id;
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
	@Override
	public int compareTo(Usuario user) {
		// TODO Auto-generated method stub
		if(this.getIdUser()<user.getIdUser()) {
			return -1;
		}else if(this.getIdUser()>user.getIdUser()) {
			return +1;
		}
		return 0;
	}
	
}
//bubble sort
// quick sort
// hip sort
