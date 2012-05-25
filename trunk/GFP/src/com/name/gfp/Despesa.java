package src.com.name.gfp;

/***
 * Classe que Representa um debito do Usuário
 * 
 * @author ARTHUR SENA, RODOLFO LIMA, ELIAS PAULINO, BRUNNA AMORIM
 */

public class Despesa extends Transacao{
	
	/*
	 *Eu coloquei inteiro, porq eu pensei em agent usar valores pra indentificar
	 *cada categoria, tipo 0 seria categoria X, 1 categoria Y..o mesmo vale pra o tipo...e por ai vai..
	 *axo q o mais correto seria usar ENUM, mas eu nao lembro como eh q usa =\...
	 */
	
	private Categoria categoria; 
	private Tipo tipo;
	private int numeroDeParcelas = 0;
	
	public Despesa(String data, double valor, Tipo tipo, Categoria categoria){
		//TODO Verificar se a data eh valida -- (Tá em Transacao)
		//TODO verificar se o valor eh valido -- (Tá em Transacao)
		
		super(data,valor);
		this.tipo = tipo;
		this.categoria = categoria;
	}
	
	public Despesa(String data, double valor, Tipo tipo, Categoria categoria, String descricao){
		//TODO Verificar se a data eh valida -- (Tá em Transacao)
		//TODO verificar se o valor eh valido -- (Tá em Transacao)
		
		super(data, descricao, valor);
		this.tipo = tipo;
		this.categoria = categoria;
	}
	
	/**
	 * Recupera a categoria do Debito
	 * @return
	 *        Categoria do Debito
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	
	/**
	 * Altera a Categoria do Débito  
	 * @param categoria
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/**
	 * Recupera o Tipo do Débito
	 * @return
	 */
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(int numeroDeParcelas) {
		//verificar se a qt de parcelas eh valida
		this.numeroDeParcelas = numeroDeParcelas;
	}
}
