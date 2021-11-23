package com.example.classesmetodonapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.classesmetodonapratica.classes.Animal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



/*        Conta conta = new Conta();
        conta.depositar(100); //200
        conta.sacar(50);//150


        System.out.println(conta.recuperarSaldo());

---------------------------------------------------------------

          /*  Passaro passaro = new Passaro();

            Cao cao = new Cao();
            cao.dormir();


        /*Animal animal = new Animal();
        animal.correr();
---------------------------------------------------------------

       /* Funcionario funcionario = new Funcionario();
        funcionario.nomes = "Dhebora";
        funcionario.salario = 920;

       double salarioRecuperado = funcionario.recuperarSalario(120, 20);
        System.out.println("O salario da Dhebora é: "+ salarioRecuperado);
--------------------------------------------------------------
        /*Casa minhaCasa = new Casa();
        minhaCasa.cor = "AZUL";

        System.out.println( minhaCasa.cor);
        minhaCasa.abrirPorta();
        */

    }
}
