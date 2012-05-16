package src.com.name.gfp;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel pelo gerenciamento financeiro do usuario
 * 
 * @author ARTHUR SENA, RODOLFO LIMA, BRUNNA AMORIM, ELIAS PAULINO
 */

public class GerenciadorFinanceiro {
	
	List<Transacao> listaDeTransacoes;
	
	/**
	 * Construtor da Classe
	 */
	
	public GerenciadorFinanceiro(){
		listaDeTransacoes = new ArrayList<Transacao>();
	}
	
	/**
	 * Recupera a Lista de Transacoes realizada pelo Usuario
	 * @return
	 *        Lista de Transacoes 
	 */
	
	public List<Transacao> getListaDeTransacoes() {
		return listaDeTransacoes;
	}
	
	
}
