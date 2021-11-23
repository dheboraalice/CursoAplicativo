package com.example.classesmetodonapratica.classes;

 class Passaro extends Animal{

     void voar (){
         System.out.println("voar como um passaro");
     }

     void correr(){
         super.correr();
         System.out.println("Passaro");
     }

}
