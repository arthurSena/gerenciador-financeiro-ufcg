package com.name.gfp;


import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class GFPActivity extends Activity {
    /** Called when the activity is first created. */
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        
	        /* Find Tablelayout defined in main.xml */
			TableLayout tl = (TableLayout) findViewById(R.id.myTableLayout);
			
			
			TextView t1 = new TextView(this);
			t1.setText("Descricao   ");
			TextView t2 = new TextView(this);
			t2.setText("Categoria   ");
			TextView t3 = new TextView(this);
			t3.setText("   Valor");
			
			TableRow tr = (TableRow) findViewById(R.main.linha1);
			tr.addView(t1);
			tr.addView(t2);
			tr.addView(t3);
			

			
			TableRow tr1 = new TableRow(this);
			tr1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT));
			
			
			TextView t4 = new TextView(this);
			t4.setText("Descricao1");
			TextView t5 = new TextView(this);
			t5.setText("Categoria1");
			TextView t6 = new TextView(this);
			t6.setText("   Valor1");
			
			tr1.addView(t4);
			tr1.addView(t5);
			tr1.addView(t6);
			
			TableRow tr2 = new TableRow(this);
			tr2.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
					LayoutParams.WRAP_CONTENT));
			
			
			TextView t7 = new TextView(this);
			t7.setText("Descricao2");
			TextView t8 = new TextView(this);
			t8.setText("Categoria2");
			TextView t9 = new TextView(this);
			t9.setText("   Valor2");
			
			tr2.addView(t7);
			tr2.addView(t8);
			tr2.addView(t9);
			
			TableRow tr3 = new TableRow(this);
			
			tr3.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
					LayoutParams.WRAP_CONTENT));
			
			TextView t10 = new TextView(this);
			t10.setText("Descricao3");
			TextView t11 = new TextView(this);
			t11.setText("Categoria3");
			TextView t12 = new TextView(this);
			t12.setText("   Valor3");
			
			tr3.addView(t10);
			tr3.addView(t11);
			tr3.addView(t12);
			
			tl.addView(tr1, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT));
			tl.addView(tr2, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT));
			tl.addView(tr3, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT));
			
}