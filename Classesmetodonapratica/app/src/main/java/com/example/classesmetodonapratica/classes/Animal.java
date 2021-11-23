package com.example.classesmetodonapratica.classes;

 public class Animal {

     private int tamanho;
    protected String cor;
    private double peso;

     //getter e setter
     void setCor(String cor){
         //formatação ou validação
         this.cor = cor;
     }

    String getCor(){
         return  this.cor;
    }

     void  dormir(){
         System.out.println("Dormir como um animal");
     }
     void correr(){
         System.out.println("Correr como um ");
     }
 }
