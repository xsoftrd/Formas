package com.xsoftrd.formas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
public class MainActivity extends Activity {
Button boton;
EditText texto;
CheckBox chequeo;
TextView etiqueta;
String printeo;
Spinner Spinner;


@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	boton=(Button)findViewById(R.id.boton);
	texto=(EditText)findViewById(R.id.texto);
	chequeo=(CheckBox)findViewById(R.id.check);
	etiqueta=(TextView)findViewById(R.id.label);
	Spinner=(Spinner)findViewById(R.id.Spinner);
ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.cuidad,R.layout.simple_spinner_item );
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
Spinner.setAdapter(adapter);
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void btnaceptar(View view)
	{
	if(chequeo.isChecked()==true) 
	{
	printeo=texto.getText().toString();
	etiqueta.setText(printeo);
	
	
	}
	}
}
