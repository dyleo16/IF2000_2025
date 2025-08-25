/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2000_introduccionprogra;
import logic.*; 

/**
 *
 * @author dylan
 */
public class IF2000_IntroduccionProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicios_Semana2_Practicaenclase quiz = new Ejercicios_Semana2_Practicaenclase();
        Lab1_ejercicios ej = new Lab1_ejercicios();
   
        //Data types
String name = "Lionel";
int age = 40;

System.out.println("Hello World");
System.out.println("Name: " +name);
System.out.println("Age: " +age);
/*Tipos de datos numericos:
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

quiz.quiz2_B_piramide(8);

ej.ejercicioA(10);

ej.ejercicioB(6);

ej.ejercicioC(6);

ej.ejercicioD();

ej.ejercicioE();

ej.ejercicioF();
    }
    
}
