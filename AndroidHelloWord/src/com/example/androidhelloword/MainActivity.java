package com.example.androidhelloword;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;

import java.util.*;

public class MainActivity extends Activity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button button = (Button) findViewById(R.id.btnConsultar);
        
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	DatePicker data = (DatePicker) findViewById(R.id.dtDataNasc);
            	
//            	Map<String,String> map = new HashMap<String,String>();
//            	map.put("Sunday", "Domingo");            	
//            	map.put("Monday", "Segunda-Feira");
//            	map.put("Tuesday", "Terça-Feira");
//            	map.put("Wednesday", "Quarta-Feira");
//            	map.put("Thursday", "Quinta-Feira");
//            	map.put("Friday", "Sexta-Feira");
//            	map.put("Saturday", "Sábado");   
            	
            	Map<Integer,String> map = new HashMap<Integer, String>();
            	map.put(1, "Domingo");            	
            	map.put(2, "Segunda-Feira");
            	map.put(3, "Terça-Feira");
            	map.put(4, "Quarta-Feira");
            	map.put(5, "Quinta-Feira");
            	map.put(6, "Sexta-Feira");
            	map.put(7, "Sábado");
            	
            	int ano = data.getYear();
            	int mes = data.getMonth();
            	int dia = data.getDayOfMonth();
            	
            	Calendar calendario = Calendar.getInstance();
            	calendario.set(ano, mes, dia);
            	int diaSemana = calendario.get(calendario.DAY_OF_WEEK); 
        		
            	String diaDaSemana = map.get(diaSemana);
            	
            	TextView strDiaSemama = (TextView) findViewById(R.id.strDiaSemana);
            	strDiaSemama.setText(diaDaSemana);            	
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
