import org.junit.Assert;

import org.junit.Before;

import org.junit.Test;

import com.name.gfp.GerenciadorFinanceiro;


public class TesteGerenciador {
		GerenciadorFinanceiro ger;
		
		@Test	
		public void testMetodos(){
			try {
				povoarGerenciador();
			} catch (Exception e) {}
			
			Assert.assertEquals(40, ger.getListaDeTransacoes().size(),0.1);
			

				excluirTransacoes();


			
			Assert.assertEquals(20, ger.getListaDeTransacoes().size(),0.1);
		}


		public void povoarGerenciador() throws Exception{
			ger = new GerenciadorFinanceiro();
			for(int i = 0; i< 20; i++){
				ger.adicionarReceita("01/02/2012", i+10, "Alimentacao", "Descricao");
			}
			for(int i = 0; i< 20; i++){
				ger.adicionarDespesa("02/10/2012", i+10, "Lazer", "Descricao");
			}
		}
		
		public void excluirTransacoes(){
			for (int i = 0; i <ger.getListaDeTransacoes().size(); i++){
				ger.excluirTransacao(ger.getListaDeTransacoes().get(i).getID());
			}
		}

}

