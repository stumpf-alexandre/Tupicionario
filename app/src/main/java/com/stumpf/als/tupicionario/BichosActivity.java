package com.stumpf.als.tupicionario;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
public class BichosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bichos);
        String[] bichosArray = getResources().getStringArray(R.array.bichos_array);
        List<String> bichoList = Arrays.asList(bichosArray);
        LinearLayout root = findViewById(R.id.root_bichos);
        for (String bicho : bichoList){
            TextView textView = new TextView(this);
            textView.setText(bicho);
            root.addView(textView);
        }
    }
}