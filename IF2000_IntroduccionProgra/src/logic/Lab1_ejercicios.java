package logic;

import java.util.Arrays;
import java.util.Scanner;


public class Lab1_ejercicios {
       public Lab1_ejercicios() {
       
       
   }

public void ejercicioA(int n){

for (int i = 0; i < n; i++){

    for(int j = 0; j < n; j++){

        if (i == 0 || i == n-1 || j == 0 || j == n-1){
        System.out.print("*");
        }else{
        System.out.print(" ");
        }
    }
    System.out.println();
}
System.out.println(" "); //divisor
}

    public void ejercicioB(int n) {
        for (int i = 0; i < n; i++){
           //control espacios
       for (int j = 0; j< (n-i); j++){
       System.out.print("*");
}
      
       System.out.println(" ");
       }
        
       System.out.println(" "); //divisor
    }
    
public void ejercicioC(int n) {
        for (int i = 0; i < n; i++){
           //control espacios
       for (int j = 0; j < i; j++){
       System.out.print(" ");
}
      for (int j=0; j < n - i; j++){
       System.out.print("*");
      }
      
       System.out.println(" "); 
      
       }
        
       System.out.println(" "); //divisor
    }

////////

public void ejercicioD() {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[10]; // arreglo de tamaño 10

    // Leer los 10 números
    for (int i = 0; i < 10; i++) {
        System.out.print("Ingrese un numero: ");
        numeros[i] = sc.nextInt();
    }

    // Ordenar ascendente
    Arrays.sort(numeros);

    // Mostrar resultado
    System.out.println("Números ordenados ascendentemente:");
    for (int i = 0; i < 10; i++) {
        System.out.print(numeros[i] + " ");
    }
    System.out.println(); // salto de línea final
    System.out.println(" "); //divisor
}

////

public void ejercicioE(){
int[] numeros = new int[100]; 

for (int i = 0; i < 100; i++){
numeros[i] = (int)(Math.random()*100);

}
Arrays.sort(numeros);

System.out.println("Numeros ordenados descendentemente");
for (int i = numeros.length - 1; i>= 0; i--){
System.out.print(numeros[i] + " ");
}
System.out.println();
System.out.println();
}

public void ejercicioF() {
    char[][] tablero = new char[8][8];
    
    // Inicializar tablero vacío
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            tablero[i][j] = ' ';
        }
    }
    
    // Colocar fichas negras (N)
    for (int i = 0; i < 3; i++) {
        for (int j = (i % 2 == 0) ? 1 : 0; j < 8; j += 2) {
            tablero[i][j] = 'N';
        }
    }
    
    // Colocar fichas rojas (R)
    for (int i = 5; i < 8; i++) {
        for (int j = (i % 2 == 0) ? 1 : 0; j < 8; j += 2) {
            tablero[i][j] = 'R';
        }
    }
    
    // Imprimir tablero
    System.out.println("  1 2 3 4 5 6 7 8");
    char[] letras = {'A','B','C','D','E','F','G','H'};
    
    for (int i = 0; i < 8; i++) {
        System.out.print(letras[i] + " ");
        for (int j = 0; j < 8; j++) {
            System.out.print(tablero[i][j] + " ");
        }
        System.out.println();
    }
}
}
