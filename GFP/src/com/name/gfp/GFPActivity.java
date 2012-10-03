package com.name.gfp;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TableRow;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;



public class GFPActivity extends Activity {
    /** Called when the activity is first created. */
	
	
	
	GerenciadorFinanceiro gerFin = new GerenciadorFinanceiro();


	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        
	        /* Find Tablelayout defined in main.xml */
			TableLayout tl = (TableLayout) findViewById(R.main.tabela);
			
			
			TextView t1 = new TextView(this);
			t1.setText("      Descricao   ");
			TextView t2 = new TextView(this);
			t2.setText("      Categoria   ");
			TextView t3 = new TextView(this);
			t3.setText("         Valor");
			
			TableRow tr = (TableRow) findViewById(R.main.linha1);
			tr.addView(t1);
			tr.addView(t2);
			tr.addView(t3);
			
			
			//Spinner 
			
			Spinner sp = (Spinner) findViewById(R.main.spinner1);
			ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
					this, R.array.itens, android.R.layout.simple_spinner_item);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			
			sp.setAdapter(adapter);
			
			
			//Mudaca de telas Main-Adicionar 
			
			Button adicionarReceita = (Button) findViewById (R.main.adicionarReceita);
			
			adicionarReceita.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
					Intent trocatela = new Intent(GFPActivity.this,TelaAdicionarReceita.class);
					trocatela.putExtra("GerenciadorObj",gerFin);
					trocatela.putExtra("receita", true);
					GFPActivity.this.startActivity(trocatela);
				}
			});
			
			Button adicionarDespesa = (Button) findViewById (R.main.adicionarDespesa);
			
			adicionarDespesa.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
					Intent trocatela = new Intent(GFPActivity.this,TelaAdicionarDespesa.class);
					trocatela.putExtra("GerenciadorObj",gerFin);
					trocatela.putExtra("receita", false);
					GFPActivity.this.startActivity(trocatela);
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