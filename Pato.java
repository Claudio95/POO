package exercicios;

public class Pato {
	String nome;
	private Voar voar;
	private Nadar nadar;
	
	public void setVoar(Voar voar){
		this.voar = voar;
	}
	
	public void setNadar(Nadar nadar){
		this.nadar = nadar;
	}
	
	public Pato(String nome, Voar voar){
		this.nome = nome;
		this.voar = voar;
	}
	
	public void usarVoo(){
		System.out.println(nome + "usando: " + voar.ativar());
	}
	
	public void Nadar(){
		System.out.println(nome + "usando: " + nadar.ativarNadar() );
	}

}
