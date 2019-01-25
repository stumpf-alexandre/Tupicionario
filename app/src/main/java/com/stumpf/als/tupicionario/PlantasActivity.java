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
public class PlantasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas);
        String[] plantasArray = getResources().getStringArray(R.array.plantas_array);
        final String[] plantasDescArray = getResources().getStringArray(R.array.plantas_desc);
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String titulo = plantasArray[i];
            String desc = plantasDescArray[i];
            Item item = new Item(titulo, desc, R.drawable.ic_plantas);
            list.add(item);
        }
        //List<String> plantasList = Arrays.asList(plantasArray);
        //LinearLayout root = findViewById(R.id.root_plantas);
        //for (String planta : plantasList){
            //TextView textView = new TextView(this);
            //textView.setText(planta);
            //root.addView(textView);
        //}
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, plantasArray);
        ItemAdapter adapter = new ItemAdapter(this, list, R.color.plantas_categoria);
        ListView listView = findViewById(R.id.root_plantas);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = plantasDescArray[position];
                Toast.makeText(PlantasActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}