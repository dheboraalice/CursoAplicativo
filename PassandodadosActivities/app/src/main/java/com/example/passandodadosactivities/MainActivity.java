package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button buttonEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Instanciar o objeto
                Usuario usuario = new Usuario("Dhebora", "dheboraalice66@hotmail.com");


                //Passar dados
                intent.putExtra("nome", "Dhebora");
                intent.putExtra("idade", 25);
                intent.putExtra("objeto", usuario);
                startActivity(intent);


            }
        });

    }
}
