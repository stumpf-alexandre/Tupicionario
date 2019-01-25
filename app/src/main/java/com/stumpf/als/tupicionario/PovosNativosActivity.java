package com.stumpf.als.tupicionario;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PovosNativosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);
        String[] povosArray = getResources().getStringArray(R.array.povos_nativos_array);
        final String[] povosDescArray = getResources().getStringArray(R.array.povos_nativos_desc);
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String titulo = povosArray[i];
            String desc = povosDescArray[i];
            Item item = new Item(titulo, desc, R.drawable.ic_povos_nativos);
            list.add(item);
        }
        //List<String> povosList = Arrays.asList(povosArray);
        //LinearLayout root = findViewById(R.id.root_povos);
        //for (String povo : povosList){
            //TextView textView = new TextView(this);
            //textView.setText(povo);
            //root.addView(textView);
        //}
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, povosArray);
        ItemAdapter adapter = new ItemAdapter(this, list, R.color.povos_nativos_categoria);
        ListView listView = findViewById(R.id.root_povos);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = povosDescArray[position];
                Toast.makeText(PovosNativosActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}