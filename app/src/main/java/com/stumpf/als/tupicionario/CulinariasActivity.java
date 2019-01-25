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
public class CulinariasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinarias);
        String[] culinariasArray = getResources().getStringArray(R.array.culinaria_array);
        final String[] culinariasDescArray = getResources().getStringArray(R.array.culinaria_desc);
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String titulo = culinariasArray[i];
            String desc = culinariasDescArray[i];
            Item item = new Item(titulo, desc, R.drawable.ic_culinaria);
            list.add(item);
        }
        //List<String> culinariasList = Arrays.asList(culinariasArray);
        //LinearLayout root = findViewById(R.id.root_culinarias);
        //for (String culinaria : culinariasList) {
            //TextView textView = new TextView(this);
            //textView.setText(culinaria);
            //root.addView(textView);
        //}
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, culinariasArray);
        ItemAdapter adapter = new ItemAdapter(this, list, R.color.culinaria_categoria);
        ListView listView = findViewById(R.id.root_culinarias);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = culinariasDescArray[position];
                Toast.makeText(CulinariasActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}