package com.name.gfp;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;

import android.view.View;
import android.widget.Button;

import com.thoughtworks.xstream.XStream;  


public class TelaAdicionar extends Activity {
    /** Called when the activity is first created. */
	
	XStream xstream = new XStream(); 
	GerenciadorFinanceiro gerenciador =  new GerenciadorFinanceiro();


	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.adicionar);
			
			
			//Mudaca de telas Adicionar - Main 
			
//			Button voltar = (Button) findViewById (R.adicionar.voltarTelaMain);
//			
//			voltar.setOnClickListener(new View.OnClickListener() {
//				
//				public void onClick(View v) {
//					Intent trocatela = new Intent(TelaAdicionar.this, GFPActivity.class);
//					TelaAdicionar.this.startActivity(trocatela);
//					TelaAdicionar.this.finish();
//					
//				}
//			});
			
			//Adicionando na lista.
			
			Button btAdd = (Button) findViewById(R.adicionar.btAdd);
			
			btAdd.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO pegar as coisas e criar o objeto e adicionar em gereciador
					 BufferedWriter writer;
					try {
							writer = new BufferedWriter(new FileWriter( Environment.getExternalStorageDirectory().getName() + "/"+ "pessoa.xml"));
							String func = xstream.toXML("passar aqui o objeto criado ou atualizado");
							writer.write(func);
							writer.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					
				}
			});
					 
			
//			TableRow tr1 = new TableRow(this);
//			tr1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
//					LayoutParams.WRAP_CONTENT));
//			
//			
//			TextView t4 = new TextView(this);
//			t4.setText("Descricao1");
//			TextView t5 = new TextView(this);
//			t5.setText("Categoria1");
//			TextView t6 = new TextView(this);
//			t6.setText("   Valor1");
//			
//			tr1.addView(t4);
//			tr1.addView(t5);
//			tr1.addView(t6);
//			
//			TableRow tr2 = new TableRow(this);
//			tr2.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
//					LayoutParams.WRAP_CONTENT));
//			
//			
//			TextView t7 = new TextView(this);
//			t7.setText("Descricao2");
//			TextView t8 = new TextView(this);
//			t8.setText("Categoria2");
//			TextView t9 = new TextView(this);
//			t9.setText("   Valor2");
//			
//			tr2.addView(t7);
//			tr2.addView(t8);
//			tr2.addView(t9);
//			
//			TableRow tr3 = new TableRow(this);
//			
//			tr3.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
//					LayoutParams.WRAP_CONTENT));
//			
//			TextView t10 = new TextView(this);
//			t10.setText("Descricao3");
//			TextView t11 = new TextView(this);
//			t11.setText("Categoria3");
//			TextView t12 = new TextView(this);
//			t12.setText("   Valor3");
//			
//			tr3.addView(t10);
//			tr3.addView(t11);
//			tr3.addView(t12);
//			
//			tl.addView(tr1, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
//					LayoutParams.WRAP_CONTENT));
//			tl.addView(tr2, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
//					LayoutParams.WRAP_CONTENT));
//			tl.addView(tr3, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
//					LayoutParams.WRAP_CONTENT));
			
	 }
}