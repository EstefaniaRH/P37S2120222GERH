package mx.edu.tesoem.g7s21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1, txtnum2;
    Button btnsuma,btnresta,btndiv,btnmul;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        lblresultado = findViewById(R.id.lblresultado);
        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btndiv = findViewById(R.id.btndiv);
        btnmul = findViewById(R.id.btnmul);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                lblresultado.setText(String.valueOf(num1 + num2));

            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                lblresultado.setText(String.valueOf(num1 - num2));

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                lblresultado.setText(String.valueOf(num1 / num2));
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                lblresultado.setText(String.valueOf(num1 * num2));
            }
        });



    ;}
}