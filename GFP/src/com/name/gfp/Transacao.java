package src.com.name.gfp;


/**
 * Classe que representa as transacoes realizadas pelo Usuario
 * 
 * @author ARTHUR SENA, ELIAS PAULINO, BRUNNA AMORIM, RODOLFO LIMA
 */

public class Transacao {
	
	private String data;
	private String descricao;
	private double valor;
	private int id; 
	
	public Transacao(String data, double valor){
		this.data = data;
		this.valor = valor;
		this.descricao = "";
		this.id = geraID();
	}

	public Transacao(String data, String descricao, double valor){	
		this(data, valor);
		this.descricao = descricao;
	}
	
	/**
	 * Recupera a Data da Transacao
	 * @return
	 *        Data da Transacao
	 */
	
	public String getData() {
		return data;
	}
	
	/**
	 * Recupera a Descricao da Transacao
	 * @return
	 *      Descricao da Transacao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Recupera o Valor da Transacao
	 * @return
	 *         Valor da Transacao
	 */
	public double getValor() {
		return valor;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getID(){
		return this.id;
	}
	
	private int geraID() {
		return (int) (1+Math.random()*1000000);
	}
}
