package com.example.bancodedadossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            //Criar banco de dados
            SQLiteDatabase bancoDados = openOrCreateDatabase("app", MODE_PRIVATE, null);

            //Criar tabela
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas (nome VARCHAR, idade INT(3))");

            //Inserir dados
            //bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Dhebora', 25) ");
            //bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Alice', 70) ");

            //Recuperar pessoas
            Cursor cursor = bancoDados.rawQuery("SELECT nome, idade FROM pessoas", null);

            //Indices da tabela
            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();
            while(cursor != null){
                Log.i("RESULTADO - nome: ", cursor.getString(indiceNome));
                Log.i("RESULTADO - idae: ", cursor.getString(indiceIdade));
                cursor.moveToNext();
            }

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
