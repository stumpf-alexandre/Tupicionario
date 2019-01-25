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
public class BichosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bichos);
        final String[] bichosArray = getResources().getStringArray(R.array.bichos_array);
        final String[] bichosDescArray = getResources().getStringArray(R.array.bichos_desc);
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String titulo = bichosArray[i];
            String desc = bichosDescArray[i];
            Item item = new Item(titulo, desc, R.drawable.ic_bichos);
            list.add(item);
        }
        //List<String> bichoList = Arrays.asList(bichosArray);
        //LinearLayout root = findViewById(R.id.root_bichos);
        //for (String bicho : bichoList){
        //    TextView textView = new TextView(this);
        //    textView.setText(bicho);
        //    root.addView(textView);
        //}
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bichosArray);
        ItemAdapter adapter = new ItemAdapter(this, list, R.color.bicho_categoria);
        ListView listView = findViewById(R.id.root_bichos);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = bichosDescArray[position];
                Toast.makeText(BichosActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}