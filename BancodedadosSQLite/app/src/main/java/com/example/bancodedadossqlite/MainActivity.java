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
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas ( id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3))");
           // bancoDados.execSQL("DROP TABLE pessoas "); //APAGAR TABELA

            //Inserir dados
            //bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Mariana', 18) ");
            //bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Dhebora', 25) ");
            //bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES('Pedro', 50) ");

            //Update da tabela
            /*bancoDados.execSQL("UPDATE pessoas SET idade = 20 " +
                    "WHERE nome = 'Dhebora' ");*/

            //bancoDados.execSQL("DELETE FROM pessoas WHERE id = 2 "); // apagar tabela por ID

            //Recuperar pessoas
            /*String consulta = "SELECT nome, idade FROM pessoas " +
                    "WHERE NOME = 'Mariana' AND idade = 18";*/ // AND = e

            /*String consulta = "SELECT nome, idade FROM pessoas " +
                    "WHERE idade >= 35 OR idade = 18";*/ // OR = ou

          /*  String consulta = "SELECT nome, idade FROM pessoas " +
                    "WHERE nome IN('Dhebora')";*/ // IN = dentro

            /*String consulta = "SELECT nome, idade FROM pessoas " +
                    "WHERE idade BETWEEN 30 AND 50";*/   //BETWEEN = entre

           /* String filtro = "dhe";
            String consulta = "SELECT nome, idade FROM pessoas " +
                    "WHERE nome LIKE '%"+ filtro + "%' ";    */               // LIKE = como  %= qualquer coisa a esquerda


            /*String consulta = "SELECT nome, idade FROM pessoas " +
                    "WHERE 1=1 ORDER BY idade ASC LIMIT 3";  */        // ORDERBY= ordenar // ASC = do maior para menos A/Z(POR NOME)  DESC = do menor para maior Z/A(POR NOME)
            //LIMIT = limite

            String consulta = "SELECT id, nome, idade FROM pessoas " +
                    "WHERE 1=1 ";

            Cursor cursor = bancoDados.rawQuery(consulta, null);

            //Indices da tabela
            int indiceId = cursor.getColumnIndex("id");
            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();
            while(cursor != null){

                String nome = cursor.getString(indiceNome);
                String idade = cursor.getString(indiceIdade);
                String id = cursor.getString(indiceId);
                Log.i("RESULTADO - id ", id + " / nome: " + nome + " / idade: " + idade );

                cursor.moveToNext();
            }

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
