package logic;

import java.util.Arrays;

import java.util.Scanner;

public class Lab2_ejercicios {

    public Lab2_ejercicios() {

    }

    public void ejercicio13() {
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los numeros pares entre 2 y 1000 es: " + suma);
    }

    public void ejercicio14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("Equivalente en Fahrenheit: " + fahrenheit);
    }

    public void ejercicio15() {
        System.out.println("Ejercicio 15");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base (X): ");
        int x = sc.nextInt();
        System.out.print("Ingrese el exponente (N): ");
        int n = sc.nextInt();

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= x; // multiplicamos X por sí mismo N veces
        }
        System.out.println(x + " elevado a " + n + " es: " + resultado);

    }

    public void ejercicio16() {
        System.out.println("Ejercicio 16");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Numero inválido, debe estar entre 1 y 12");
        }
    }

    public double ejercicio17(int valorX) {
        
        if (valorX > 0) {
            return valorX + 5;
        } else if (valorX < 0) {
            return valorX * valorX;
        } else {
            return 1;
        }
        
    }

public void ejercicio18(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Ejercicio 18  Area del triangulo = " + area);
    }
    
public void ejercicio19(int a, int b) {
        System.out.println("Ejercicio 19  Antes: A=" + a + ", B=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Ejercicio 19  Despues: A=" + a + ", B=" + b);
    }

public void ejercicio20(double x0, double y0, double x1, double y1) {
        double m = (y0 - y1) / (x0 - x1);
        double b = y0 - m * x0;
        System.out.println("Ejercicio 20  Ecuacion: y = " + m + "x + " + b);
    }

public void ejercicio21(int k) {
        int suma = 0;
        for (int i = 1; i < k; i++) {
            suma += i;
        }
        System.out.println("Ejercicio 21  Suma de naturales menores a " + k + " = " + suma);
    }

    
    public void ejercicio22(int[] numeros) {
        int suma = 0;
        for (int n : numeros) suma += n;
        double promedio = (numeros.length > 0) ? (double) suma / numeros.length : 0;
        System.out.println("Ejercicio 22  Promedio = " + promedio);
    }

  
    public void ejercicio23(int[] numeros) {
        int sumaPares = 0, sumaImpares = 0, total = 0, pares = 0, impares = 0;
        for (int n : numeros) {
            total += n;
            if (n % 2 == 0) { sumaPares += n; pares++; }
            else { sumaImpares += n; impares++; }
        }
        System.out.println("Ejercicio 23  Total=" + total +
                           ", Pares=" + pares + " (suma=" + sumaPares + ")" +
                           ", Impares=" + impares + " (suma=" + sumaImpares + ")");
    }

  
    public void ejercicio24() {
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) sumaPares += i;
            else sumaImpares += i;
        }
        System.out.println("Ejercicio 24  Suma pares=" + sumaPares + ", Suma impares=" + sumaImpares);
    }

   
    public void ejercicio25() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println("Ejercicio 25  Suma de cuadrados = " + suma);
    }

    
    public void ejercicio26(int n) {
        long fact = 1;
        if (n == 0 || n == 1) fact = 1;
        else {
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
        }
        System.out.println("Ejercicio 26  " + n + "! = " + fact);
    }

    
    public void ejercicio27(int[] numeros) {
        int max = numeros[0];
        for (int n : numeros) {
            if (n > max) max = n;
        }
        System.out.println("Ejercicio 27  Maximo = " + max);
    }
}
