/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examen;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Ejercicio5 { 
    public static void main(String[] args) { 
        Scanner dato=new Scanner(System.in); 
        int c=0; System.out.println("Escriba una palabra"); 
        String palabra=dato.nextLine(); 
        char caracteres[]=new char[palabra.length()]; 
        for(int i=0;i<palabra.length();i++){
            c=c+1; caracteres[i]=palabra.charAt(i); 
            System.out.println(caracteres[i]); } 
        System.out.println("la cantidad de caracteres es : "+c); 
    } 
}