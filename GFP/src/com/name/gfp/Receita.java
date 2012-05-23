package src.com.name.gfp;

/***
 * Classe que Representa uma determinada Renda do Usuário
 * 
 * @author ARTHUR SENA, RODOLFO LIMA, ELIAS PAULINO, BRUNNA AMORIM
 */

public class Receita extends Transacao{
	
	private Tipo tipo; 
	
	public Receita(String data, double valor, Tipo tipo){
		//TODO Verificar se a data eh valida 
		//TODO verificar se o valor eh valido
		
		super(data,valor);
		this.tipo = tipo;
	}

	public Receita(String data, double valor, Tipo tipo, String descricao){
		//TODO Verificar se a data eh valida 
		//TODO verificar se o valor eh valido
		
		super(data,descricao,valor);
		this.tipo = tipo;
	}

	/**
	 * Recupera o Tipo da Renda
	 * @return
	 *        Tipo da Renda
	 */
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	

}
