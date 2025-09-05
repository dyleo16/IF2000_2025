package logic;

import java.util.Arrays;
import java.util.Scanner;

/* 
public class Lab1_ejercicios {
       public Lab1_ejercicios() {     
   }

//Trabajo en Clase 1 (Semana 2) Ejercicios programados       
     
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

//Ejercicios de Lab1

public void ejercicio1(){
Scanner sc = new Scanner(System.in);

System.out.print("Ingrese numero: ");
int n = sc.nextInt();

if (n % 2 == 0){
System.out.print("Su numero es: " + "par");
}else {
System.out.print("Su numero es: " + "impar");
}
System.out.println(" "); //divisor
}


//////

public void ejercicio2(){
Scanner sc = new Scanner(System.in);

System.out.print("Ingrese el numero: ");
int n = sc.nextInt();

int valorAbs;
if (n < 0){
valorAbs = -n;
}else{
valorAbs = n;
}

System.out.print("El valor absoluto de " + n + " es de: " + valorAbs);
System.out.println();
}

public void ejercicio3(){
int suma = 0;

System.out.print("Serie de numeros: ");
for (int i = 3; i <= 99; i += 3){
System.out.print(i + " ");
suma += i;
}

System.out.print("La suma es de: " + suma);
 System.out.println();
}


public void ejercicio4(){
Scanner sc = new Scanner(System.in);
int[] n = new int[3];

for (int i = 0; i < 3; i++) {
        System.out.print("Ingrese un numero: ");
        n[i] = sc.nextInt();
}
Arrays.sort(n);

System.out.print("Numeros ordenados descendentemente");
for (int i = n.length - 1; i>= 0; i--){
System.out.print(n[i] + " ");
}
}


public void ejercicio5(){
Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el primer numero: ");
    int num1 = sc.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    int num2 = sc.nextInt();

    int resultado;
    if (num1 == num2) {
        resultado = num1 * num2;
        System.out.println("Los numeros son iguales, se multiplican: " + resultado);
    } else if (num1 > num2) {
        resultado = num1 - num2;
        System.out.println("El primero es mayor, se restan: " + resultado);
    } else {
        resultado = num1 + num2;
        System.out.println("El primero es menor, se suman: " + resultado);
    }
    System.out.println();
}



public void ejercicio6(){
Scanner sc = new Scanner(System.in);
    boolean huboDiez = false;

    System.out.println("Ingrese las notas (de 0 a 10). Ingrese -1 para terminar:");

    while (true) {
        int nota = sc.nextInt();

        if (nota == -1) {
            break; // termina el ciclo
        }

        if (nota == 10) {
            huboDiez = true;
        }
    }

    if (huboDiez) {
        System.out.println("Sí hubo al menos una nota con valor 10.");
    } else {
        System.out.println("No hubo ninguna nota con valor 10.");
    }
    System.out.println();

}


//////


public void ejercicio7(){
Scanner sc = new Scanner(System.in);

System.out.print("Indique su edad: ");
int age = sc.nextInt();

System.out.print("Indique su sexo (M/F): ");
char sex = sc.next().toUpperCase().charAt(0);

int pulsac;

if(sex == 'F'){
pulsac = (220 - age)/ 10;
}else if(sex == 'M'){
pulsac = (210 - age) / 10;
}else {
System.out.print("Invalido");
return;
}

 System.out.println("El numero de pulsaciones cada 10 segundos es: " + pulsac);
    System.out.println();
    
}



public void ejercicio8(){
Scanner sc = new Scanner(System.in);

System.out.print("Indique el salario mensual: ");
    int salario = sc.nextInt();
    
System.out.print("Indique los años de antiguedad: ");
    int antig = sc.nextInt();
    
double utilidad;
if (antig < 1){
     utilidad = salario * 0.05;
}else if (antig < 2){
     utilidad = salario * 0.07;
}else if (antig < 5){
     utilidad = salario * 0.10;
}else if (antig < 10){
     utilidad = salario * 0.15;
}else{
     utilidad = salario * 0.20;
}

System.out.print("La utilidad es: " + utilidad);
System.out.println();
}



public void ejercicio9(){
Scanner sc = new Scanner(System.in);

System.out.print("Digite un numero: ");
int n = sc.nextInt();

boolean esPrimo = true;

if (n <= 1){
esPrimo = false;
}else{
for (int i = 2; i <= n / 2; i++){
if (n % i == 0){
    esPrimo = false;
    break;
}
}
}

if(esPrimo){
  System.out.print(n + " es primo.");
}else{
  System.out.print(n + " no es primo.");
}
  System.out.println();
}


public void ejercicio10(){
Scanner sc = new Scanner(System.in);

    final double precioUnitario = 11000;

    System.out.print("Ingrese la cantidad de computadoras a comprar: ");
    int cantidad = sc.nextInt();

    double totalSinDescuento = cantidad * precioUnitario;
    double descuento = 0;

    if (cantidad < 5) {
        descuento = totalSinDescuento * 0.10;
    } else if (cantidad < 10) {
        descuento = totalSinDescuento * 0.20;
    } else {
        descuento = totalSinDescuento * 0.40;
    }

    double totalConDescuento = totalSinDescuento - descuento;

    System.out.println("Cantidad de computadoras: " + cantidad);
    System.out.println("Precio total sin descuento: $" + totalSinDescuento);
    System.out.println("Monto de descuento: $" + descuento);
    System.out.println("Total a pagar: $" + totalConDescuento);
    System.out.println();
}

public void ejercicio11(){
Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese un numero N: ");
    int n = sc.nextInt();

    System.out.println("Numeros primos entre 2 y " + n + ":");

    for (int i = 2; i <= n; i++) {
        boolean esPrimo = true;

        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.print(i + " ");
        }
    }
    System.out.println("\n");
}

public void ejercicio12(){
Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la base del triángulo: ");
    double base = sc.nextDouble();

    System.out.print("Ingrese la altura del triángulo: ");
    double altura = sc.nextDouble();

    double area = (base * altura) / 2;

    System.out.println("El area del triangulo es: " + area);
    System.out.println();
}

}
*/

