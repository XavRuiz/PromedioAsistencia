package com.example.javier.promedioasistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2,et3;
    private Button bt1;
    private TextView tv1;
    private CheckBox tb1,tb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);
        et3= (EditText) findViewById(R.id.et3);
        bt1= (Button) findViewById(R.id.bt1);
        tv1= (TextView) findViewById(R.id.tv1);
        tb1= (CheckBox) findViewById(R.id.tb1);
        tb2= (CheckBox) findViewById(R.id.tb2);

    }

    public void calcular(View view){

        int numero1=Integer.parseInt(et1.getText().toString());
        int numero2=Integer.parseInt(et2.getText().toString());
        int numero3=Integer.parseInt(et3.getText().toString());
        if(tb1.isChecked()){

            tv1.setText(String.valueOf((numero1+numero2+numero3)/3));
        }
        else {
            tv1.setText(String.valueOf( Math.round (((numero1+numero2+numero3)/3)/1.10)));
        }
    }

}
