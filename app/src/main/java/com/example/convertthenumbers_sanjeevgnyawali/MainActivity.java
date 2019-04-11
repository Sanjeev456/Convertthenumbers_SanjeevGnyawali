package com.example.convertthenumbers_sanjeevgnyawali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ettext;
    private Button btnconvert;
    private TextView tvoutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ettext = findViewById(R.id.ettext);
        btnconvert = findViewById(R.id.btnconvert);
        tvoutput = findViewById(R.id.tvoutput);

        btnconvert.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(ettext.getText().toString());
                Convertnumber c = new Convertnumber();
                if (num<=10000000) {
                    String res = c.convert(num);
                    tvoutput.setText(res);
                }else{
                    tvoutput.setText("High number of length");
                }
            }
        });
    }
}
