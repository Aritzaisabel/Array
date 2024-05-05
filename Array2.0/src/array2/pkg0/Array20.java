/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2.pkg0;

/**
 *
 * @author alvar
 */
public class Array20 {

  public static void main(String[] args) {
    // Declaración del arreglo
    int[] numeros;
    numeros = new int[5];
    
    // Valores
    numeros[0] = 10;
    numeros[1] = 20;
    numeros[2] = 30;
    numeros[3] = 40;
    numeros[4] = 50;
    
    // Imprimir los valores del arreglo
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("El elemento del índice " + i + ": " + numeros[i]);
    }
        
    int suma=0;
      for (int i=0;i<numeros.length;i++){
          suma+=numeros[i];
        }
        System.out.println("La suma con ciclo for es : "+ suma );
        
        
 
    }}
    

