/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examen;

/**
 *
 * @author Hermes
 */
public class Ejercicio2 { 
    public static void main(String[]args){ 
        String nombres []={"Victor", "Ronald","Carolina","Paola"}; 
        int edad []={25,30,19,22}; char sexo []={'M','M','M','F'}; 
        System.out.println("Datos de los usuarios"); 
        System.out.println("NOMBRES EDAD SEXO"); 
        System.out.println("------- ---- ----"); 
        for (int u=0;u<nombres.length;u++){ 
            System.out.println(nombres[u]+ " "+ edad[u] + " " + sexo[u]); 
        }
} }