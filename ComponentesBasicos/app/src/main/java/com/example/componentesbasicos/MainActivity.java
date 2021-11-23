package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private  EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    //RadioButton
    private RadioButton sexoM, sexoF;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome     = findViewById(R.id.editNome);
        campoEmail    = findViewById(R.id.editEmail);
        textResultado = findViewById(R.id.textResultado);

        //checkbox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoF = findViewById(R.id.radioButtonF);
        sexoM = findViewById(R.id.radioButtonM);
        opcaoSexo = findViewById(R.id.radioGroupSexo);

        radiobutton();
    }

    public  void radiobutton(){

     opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
             if (checkedId == R.id.radioButtonM){
                 textResultado.setText("Masculinho");
             }else if(checkedId == R.id.radioButtonF){
                 textResultado.setText("Feminino");
             }
         }
     });
        /*if( sexoM.isChecked() ){
            textResultado.setText("Masculinho");
        }else if ( sexoF.isChecked() ){
            textResultado.setText("Feminino");
        }*/

    }

    public void enviar(View view){

        //radiobutton();
        //checkbox();

       /* String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textResultado.setText("nome: "+ nome +" email: "+ email);

        */
    }
    public void checkbox(){

        String texto = "";
        String corSelecionada = checkVerde.getText().toString();
        texto = corSelecionada;

        if( checkVerde.isChecked() ){
            //String corSelecionada = checkVerde.getText().toString();
            //texto = corSelecionada;
            texto = "Verde selecionado -";
        }if( checkBranco.isChecked() ){
            texto = texto + "Branco selecionado -";
        }if( checkVermelho.isChecked() ){
            texto = texto + "Vermelho selecionado -";
        }

        textResultado.setText(texto);
    }


    public  void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");

    }
}
