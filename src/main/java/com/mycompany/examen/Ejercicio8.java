/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examen;

/**
 *
 * @author Usuario
 */
public class Ejercicio8 { 
    public static void main(String[]args){ 
double plancha =400;
double licuadora =500;
double lavandora =600;
double cocina=1000;
        System.out.println("Felicidades comprador debido a que su compra sobrepaso los 1200 soles le haremos un descuento del 17%");
double sum= plancha+licuadora+lavandora+cocina;
double desc=sum-((sum*17)/100);
        System.out.println("Total: "+sum);
        System.out.println("Plancha: "+plancha);
        System.out.println("Licuadora: "+licuadora);
        System.out.println("Lavadora: "+lavandora);
        System.out.println("Cocina: "+cocina);
        System.out.println("Pago con descuento: "+desc);
    }
} 