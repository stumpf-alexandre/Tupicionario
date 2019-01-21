package com.stumpf.als.tupicionario;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
public class CulinariasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinarias);
        String[] culinariasArray = getResources().getStringArray(R.array.culinaria_array);
        List<String> culinariasList = Arrays.asList(culinariasArray);
        LinearLayout root = findViewById(R.id.root_culinarias);
        for (String culinaria : culinariasList) {
            TextView textView = new TextView(this);
            textView.setText(culinaria);
            root.addView(textView);
        }
    }
}