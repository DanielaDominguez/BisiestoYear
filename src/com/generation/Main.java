package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pedir un año al usuario por consola, y determinar si el año es bisiesto.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un año culquiera y te diremos si es bisiesto o no");

        int year = sc.nextInt();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            System.out.println("El año " + year + " es bisiesto");
        } else {
            System.out.println("El año " + year + " no es bisiesto");
        }
        sc.close();
    }
}
