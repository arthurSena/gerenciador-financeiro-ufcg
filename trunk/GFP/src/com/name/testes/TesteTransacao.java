


import org.junit.Assert;

import org.junit.Before;

import org.junit.Test;

import com.name.gfp.Transacao;

public class TesteTransacao {
	
	private Transacao transacao;
	
   @Test	
   public void testConstrutor(){
		
		try{
			transacao = new Transacao("02/01/2012", 10, "receita", null);
		}
    	catch(Exception e){
    		Assert.assertEquals(e.getMessage(),"Categoria nao pode ser nulo");
    	}
		
		try{
			transacao = new Transacao("02/01/2012", 10, null, null);
		}
    	catch(Exception e){
    		Assert.assertEquals(e.getMessage(),"Tipo nao pode ser nulo");
    	}
		
		try{
			transacao = new Transacao(null, 10, "receita", "Alimentacao");
		}
    	catch(Exception e){
    		Assert.assertEquals("Data nao pode ser nulo",e.getMessage());
    	}
		
		try{
			transacao = new Transacao("////", 10, "receita", null);
		}
		catch(Exception e){
    		Assert.assertEquals(e.getMessage(),"Data invalida.");
    	}
		
		try{
			transacao = new Transacao("01/02/2012", 10, "receita", "Alimentacao", null);
		}
		catch(Exception e){
    		Assert.assertEquals(e.getMessage(),"Descricao nao pode ser nulo");
    	}
		
	}
   

@Test
	public void testGetSets() throws Exception{
	
			transacao = new Transacao("01/02/2012", 10, "Receita", "Alimentacao", "Descricao");
			Assert.assertEquals(transacao.getCategoria(),"Alimentacao");
			Assert.assertEquals(10, transacao.getValor(),0.1);
			Assert.assertEquals(transacao.getData(),"01/02/2012");
			Assert.assertEquals(transacao.getDescricao(),"Descricao");
			Assert.assertEquals(transacao.getTipo(),"Receita");
			
			Assert.assertEquals(true, transacao.isReceita());
			Assert.assertEquals(false, transacao.isDespesa());
			
			transacao.setCategoria("Lazer");
			transacao.setData("02/01/2012");
			transacao.setDescricao("Descricao1");
			transacao.setValor(100);
			
			
			Assert.assertEquals(transacao.getCategoria(),"Lazer");
			Assert.assertEquals(100, transacao.getValor(),0.1);
			Assert.assertEquals(transacao.getData(),"02/01/2012");
			Assert.assertEquals(transacao.getDescricao(),"Descricao1");
			
			
			transacao = new Transacao("03/02/2012", 10, "Despesa", "Moradia", "Descricao");
			Assert.assertEquals(transacao.getCategoria(),"Moradia");
			Assert.assertEquals(10, transacao.getValor(),0.1);
			Assert.assertEquals(transacao.getData(),"03/02/2012");
			Assert.assertEquals(transacao.getDescricao(),"Descricao");
			Assert.assertEquals(transacao.getTipo(),"Despesa");
			
			Assert.assertEquals(false, transacao.isReceita());
			Assert.assertEquals(true, transacao.isDespesa());
   }
   
 
}
