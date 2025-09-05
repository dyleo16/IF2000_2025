package if2000_introduccionprogra;

import logic.*;

public class IF2000_IntroduccionProgra {
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejercicios_Semana2_Practicaenclase quiz = new Ejercicios_Semana2_Practicaenclase();
        // Lab1_ejercicios l1 = new Lab1_ejercicios();
        Lab2_ejercicios l2 = new Lab2_ejercicios();

        //Data types
        String name = "Lionel";
        int age = 40;
        
        System.out.println("Hello World");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        /*
Tipos de datos numericos:
  int, long, short,float, double
  numeric, money, decimal

  Manejo de fecha:
  Date

 Cadena de carecteres:
  String

Objectos: 
Object

Data Structures: 
Arrays or Vectors: int[] x
                   int[] y
         */
 /*
quiz.quiz2_B_piramide(8);


l1.ejercicioA(10);

l1.ejercicioB(6);

l1.ejercicioC(6);

l1.ejercicioD();

l1.ejercicioE();

l1.ejercicioF();

l1.ejercicio1();

l1.ejercicio2();

l1.ejercicio3();

l1.ejercicio4();

l1.ejercicio5();

l1.ejercicio6();

l1.ejercicio7();

l1.ejercicio8();

l1.ejercicio9();

l1.ejercicio10();

l1.ejercicio11();

l1.ejercicio12();
         */
//Lab2 - 03/09/25
        l2.ejercicio13();
        
        l2.ejercicio14();
        
        l2.ejercicio15();
        
        l2.ejercicio16();
        
        System.out.println("Resultado con x=5: " + l2.ejercicio17(5));
        System.out.println("Resultado con x=-3: " + l2.ejercicio17(-3));
        System.out.println("Resultado con x=0: " + l2.ejercicio17(0));l2.ejercicio17(5);
        
        l2.ejercicio18(2, 3, 4);
        
        l2.ejercicio19(2,3);
        
        l2.ejercicio20(3, 5, 6, 9);
        
        l2.ejercicio21(5);
        
        l2.ejercicio22(new int[]{5, 10, 15, 20, 25});
        
        l2.ejercicio23(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        
        l2.ejercicio24();
        
        l2.ejercicio25();
        
        l2.ejercicio26(8);
        
        l2.ejercicio27(new int[]{8, 12, 3, 25, 7, 19, 4, 10, 15, 6});
    }
    
}