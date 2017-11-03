/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.datos;

import java.util.Scanner;

/**
 *
 * Nombre: Cristian Calle
 */
public class EntradaDatos {
    public static void ingreso() {
        
        Scanner input =new Scanner(System.in);
        
        int dato;
        
        System.out.println("Colada Morada");
        System.out.println("Cuabtos Ingredientes Utilizaste :");
        dato = input.nextInt();
        String datos[] = new String[dato];                              //arreglo tipo string
        
        String aux;  
        
        System.out.println("Ingrese los Ingredientes: ");
        
        for(int i=0;i<dato;i++){
            System.out.print((i+1)+")Ingrediente: ");
            aux = input.next();                                         //ingresamos por teclado los datos al arreglo
            datos[i] = aux;                                             //guarda los datos que ingresamos por teclado en el arreglo  
        
        }
                
        Scanner entrada =new Scanner(System.in);
        int pan ;
        
        System.out.println("Realizo Guagua de pan ");
        
        System.out.println("1.-SI ");
        System.out.println("2.-NO ");
        pan= entrada.nextInt();
        
        if(pan==1)                                                      //creamos una condicion 
           {
            int dato2;
            String aux2;
            System.out.println("Cuantos Ingredientes Utilizaste :");
            dato2 = input.nextInt(); 
            String datos2[] = new String[dato2];
            System.out.println("Ingresa los Ingredientes: ");
            for(int i=0;i<dato2;i++){
            System.out.print((i+1)+")Ingrediente: ");
            aux = input.next();                                         
            datos2[i] = aux;  
                   
        }
            {
                System.out.println(""); 
                System.out.println("Los ingredientes de la Guagua de pan son : "); 
        for(int i=0;i<dato2;i++){
            System.out.println((i+1)+")Ingrediente: "+datos2[i]);
            
        
        }
            }   
        }
        
        else{
            System.out.println("Gracias ");
        }
        System.out.println(""); 
        System.out.println("Los ingredientes de la Colada Morada son : ");
        for(int i=0;i<dato;i++){
            System.out.println((i+1)+")Ingrediente: "+datos[i]);
            
        
        }
        
        
         
    }
        
     
    }


