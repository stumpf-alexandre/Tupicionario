package com.stumpf.als.tupicionario;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
public class PovosNativosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);
        String[] povosArray = getResources().getStringArray(R.array.povos_nativos_array);
        List<String> povosList = Arrays.asList(povosArray);
        LinearLayout root = findViewById(R.id.root_povos);
        for (String povo : povosList){
            TextView textView = new TextView(this);
            textView.setText(povo);
            root.addView(textView);
        }
    }
}