package com.example.classesmetodonapratica;

 class Funcionario {
    //propriedade
    String nomes;
    double salario;

    //metodos - sem retorno
     double recuperarSalario(double bonus, double descontoAdicional){

         this.salario = this.salario - (this.salario * 0.1);
        return this.salario + bonus - descontoAdicional;
         // System.out.println(this.salario);

     }

}
